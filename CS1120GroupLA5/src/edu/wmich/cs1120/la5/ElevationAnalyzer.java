package edu.wmich.cs1120.la5;

import java.util.ArrayList;

public class ElevationAnalyzer implements IRover {
	// This class is responsible for providing the “average elevation”
	//of the path.
	
	private MapCreatorFromTxt mc; // holds place for a MapCreator object to be
	// referenced

	private ArrayList<IArea> path; // holds place for an area array list to be
	// referenced

	private String analysis;
	
	/**
	 * Calculates the average path elevation
	 */
	@Override
	public void analyzePath() {
		
		double totElevation = 0;
		String elevAnalysis = "";
		
		for(int index = 0; index < path.size(); index++){
			totElevation += path.get(index).getElevation();
		}
		
		//gets the avg. elevation in the path, converts it to a String and puts in a temporary storage.
		elevAnalysis += (totElevation / path.size());
		
		this.setAnalysis(elevAnalysis.trim());

	}

	/**
	 * Returns the average path elevation
	 * @return analysis The average path elevation
	 */
	@Override
	public String getAnalysis() {
		
		return analysis;
	}

	/**
	 * Sets the local analysis variable
	 * @param The average path elevation
	 */
	@Override
	public void setAnalysis(String analysis) {
		this.analysis = analysis;

	}

	/**
	 * Returns the stored ArrayList of path objects
	 * @return path The ArrayList holding the path objects
	 */
	@Override
	public ArrayList<IArea> getPath() {
		
		return path;
	}

	/**
	 * Sets the local ArrayList to the found path
	 * @param path The found path
	 */
	@Override
	public void setPath(ArrayList<IArea> path) {
		
		this.path = path;
		
	}
	
	/**
	 * The name of the current analyzer
	 * @return The name of the current analyzer
	 */
	@Override
	public String toString(){
		
		return "Elevation Analyzer";
	
	}

}
