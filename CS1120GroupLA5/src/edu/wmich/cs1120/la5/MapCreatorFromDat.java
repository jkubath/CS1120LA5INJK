package edu.wmich.cs1120.la5;

import java.io.IOException;
import java.io.RandomAccessFile;

public class MapCreatorFromDat implements IMapCreator {
	// This class is responsible for retrieving the information from the
	//.dat file
	
	private TerrainScanner scanner;
	private IArea[][] area = new IArea[10][10];
	
	@Override
	public void scanTerrain(String fileName, int threshold) throws IOException {
		
		RandomAccessFile randFile = new RandomAccessFile(fileName, "r");
		
		
		
		
		
		
		
		
		randFile.close();

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
