package edu.wmich.cs1120.la5;

import java.util.ArrayList;

public class RadiationAnalyzer implements IRover {
	// This class is responsible for providing the “total radiation” of
	//the path.
	
	private ArrayList<IArea> path; // holds place for an area array list to be
			// referenced
	
	private String analysis; // holds place for a string representing the path analysis.
	
	/**
	 * This method analyzes the path by calculating the total radiation encountered in it.
	 */
	@Override
	public void analyzePath() {
		
		double totalRad = 0; // accumulator for the total path radiation, initialized to 0.
		String radAnalysis = ""; // radiation analysis local variable initialized with empty space.
		
		//for loop accumulates each area radiation value in the path to get the total.
		for(int index = 0; index < path.size(); index++){
			totalRad += path.get(index).getRadiation();
		}
		
		
		radAnalysis += totalRad; // converts and stores the total radiation as a String.
		
		
		this.setAnalysis(this.toString() + radAnalysis.trim());
		

	}

	/**
	 * 
	 * @return analysis 
	 */
	@Override
	public String getAnalysis() {
		return this.analysis;
	}

	/**
	 * 
	 * @param analysis String representation of the total radiation of the path
	 */
	@Override
	public void setAnalysis(String analysis) {
		
		this.analysis = analysis;

	}

	/**
	 * 
	 * @return 
	 */
	@Override
	public ArrayList<IArea> getPath() {
		
		return path;
	}
	
	/**
	 * 
	 * @param path 
	 */
	@Override
	public void setPath(ArrayList<IArea> path) {
		
		this.path = path;
		
	}
	
	/**
	 * This method returns the String of the name of the current analyzer.
	 * @return The string of the name of the current analyzer.
	 */
	@Override
	public String toString(){
		
		return "Radiation Analyzer: ";
	
	}

}
