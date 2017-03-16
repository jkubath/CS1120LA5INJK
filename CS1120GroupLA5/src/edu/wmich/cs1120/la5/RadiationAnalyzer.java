package edu.wmich.cs1120.la5;

import java.util.ArrayList;

public class RadiationAnalyzer implements IRover {
	// This class is responsible for providing the “total radiation” of
	//the path.
	
	private MapCreatorFromTxt mc; // holds place for a MapCreator object to be
			// referenced
	
	private ArrayList<IArea> path; // holds place for an area array list to be
			// referenced
	
	private String analysis;
	
	/**
	 * Adds together all the radiation levels from the path and stores
	 * in a local variable - analysis.
	 */
	@Override
	public void analyzePath() {
		
		double totalRad = 0;
		String radAnalysis = "";
		//Move through the entire path and total the radiation
		for(int index = 0; index < path.size(); index++){
			totalRad += path.get(index).getRadiation();
		}
		
		//Save the double as a string
		radAnalysis += totalRad;
		
		//Save the total radiation
		this.setAnalysis(radAnalysis.trim());
		

	}

	/**
	 * Returns the total radiation of the path
	 * @return analysis The total radiation of the path
	 */
	@Override
	public String getAnalysis() {
		return this.analysis;
	}

	/**
	 * Sets the total radiation local variable
	 * @param analysis String of the total radiation of the path
	 */
	@Override
	public void setAnalysis(String analysis) {
		
		this.analysis = analysis;

	}

	/**
	 * Returns the ArrayList of the path objects
	 * @return The local ArrayList of the path
	 */
	@Override
	public ArrayList<IArea> getPath() {
		
		return path;
	}
	
	/**
	 * Sets the ArrayList to the found path
	 * @param path The ArrayList of the path that was found
	 */
	@Override
	public void setPath(ArrayList<IArea> path) {
		
		this.path = path;
		
	}
	
	/**
	 * Returns the name of the analyzer
	 * @return String The name of the analyzer currently being used
	 */
	@Override
	public String toString(){
		
		return "Radiation Analyzer";
	
	}

}
