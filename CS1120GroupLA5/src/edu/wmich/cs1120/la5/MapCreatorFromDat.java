package edu.wmich.cs1120.la5;

import java.io.IOException;
import java.io.RandomAccessFile;
import edu.wmich.cs1120.la5.TerrainScanner;

public class MapCreatorFromDat implements IMapCreator {
	// This class is responsible for retrieving the information from the
	//.dat file
	
	private TerrainScanner scanner = new TerrainScanner(); // created TerrainScanner to access terrain
                                                           // setter.
	private IArea[][] area = new IArea[10][10]; // predetermined 10x10 size array for simulating map
                                                // conditions
	
	/**
	 * 
	 * @param fileName 
	 * @param threshold 
	 */
	@Override
	public void scanTerrain(String fileName, int threshold) throws IOException {
		
		RandomAccessFile randFile = new RandomAccessFile(fileName, "r");
		
		//This constant is the byte length summation for each data type in a line.
		final int LINE_LENGTH = 8 + 8 + 8 + 2 + 4 + 4;
		
		int result, //resultant of the calculation that determines the next location to be read.
			row = 0, col = 0; //row and column indices to store IArea type object refs in the array.
		
		
		IArea square; //reference variable will be used to store addresses of created IArea type objects.
		
		double basicEnergy = randFile.readDouble(); //reads and stores basic energy cost from file.
		double elevation = randFile.readDouble(); //reads and stores elevation value from file.
		double radiation = randFile.readDouble(); // reads and stores radiation level from file.
		
		// condition for determining high or low areas to be referenced
		if (radiation > 0.5 || (radiation < 0.5 && elevation > (0.5 * threshold))) {
			square = new HighArea(); // assigns location of high area
										// object.
		} else {
			square = new LowArea(); // assigns location of low area object.
		}
		
		square.setBasicEnergyCost(basicEnergy); //stores basic energy cost into the object location.
		square.setElevation(elevation); //stores elevation value into the object location.
		square.setRadiation(radiation); //stores radiation into the object location.
		
		area[row][col] = square; //passes location of area object to the current array element.
		
		/*
		 * Increments the column counter to cause the next area object
		 * referenced to have its location stored in the next element in
		 * left-right linear order of the associated row.
		 */
		col++;
		
		//reads and stores character that represents the expression used to move the file pointer.
		char operator = randFile.readChar(); 
		//reads and stores first/left value that is used to find the next location for the file pointer.
		int val1 = randFile.readInt();
		//reads and stores second/right value that is used to move the file pointer.
		int val2 = randFile.readInt();
		
		//stores result of expression that leads to the next file pointer location.
		result = ExpressionFactory.getExpression(operator, val1, val2).getValue();
		
		//reads file until the next expression hint reads -1.
		while(result != -1){
			
			//moves file pointer to next position given by the expression result.
			randFile.seek(result * LINE_LENGTH);
			
			/*
			 * Checks condition if the column count has gone past the row size,
			 * manually incrementing the row counter to the next row and
			 * resetting the column counter to the first column index
			 */
			if(col == area[0].length){
				row++;
				col = 0;
			}
			
			basicEnergy = randFile.readDouble(); //reads and stores basic energy cost from file.
			elevation = randFile.readDouble(); //reads and stores elevation value from file.
			radiation = randFile.readDouble(); //reads and stores radiation level from file.
			
			// condition for determining high or low areas to be referenced
			if (radiation > 0.5 || (radiation < 0.5 && elevation > (0.5 * threshold))) {
				square = new HighArea(); // assigns location of high area
											// object.
			} else {
				square = new LowArea(); // assigns location of low area object.
			}
			
			square.setBasicEnergyCost(basicEnergy); //stores basic energy cost into the object location.
			square.setElevation(elevation); //stores elevation value into the object location.
			square.setRadiation(radiation); //stores radiation into the object location.
			
			area[row][col] = square; //passes location of area object to the current array element.
			
			/*
			 * Increments the column counter to cause the next area object
			 * referenced to have its location stored in the next element in
			 * left-right linear order of the associated row.
			 */
			col++;
			
			//reads and stores character that represents the expression used to move the file pointer.
			operator = randFile.readChar();
			//reads and stores first/left value that is used to find the next location for the file pointer.
			val1 = randFile.readInt();
			//reads and stores second/right value that is used to move the file pointer.
			val2 = randFile.readInt();
			
			//stores result of expression that leads to the next file pointer location.
			result = ExpressionFactory.getExpression(operator, val1, val2).getValue();
			
		}
		
		scanner.setTerrain(area); // sets the terrain with the area data.
		
		randFile.close(); //closes access to the random access file.

	}
	
	/**
	 * This method access the reference to a TerrainScanner object.
	 * 
	 * @return the reference to the TerrainScanner object.
	 */
	@Override
	public TerrainScanner getScanner() {

		return this.scanner;
	}

	/**
	 * This method sets the location of a TerrainScanner object by passing the
	 * address fed into the parameter from its associated argument from the
	 * method call.
	 * 
	 * @param scanner
	 *            a reference variable to a TerrainScanner object
	 */
	@Override
	public void setScanner(TerrainScanner scanner) {
		this.scanner = scanner;

	}

}
