package edu.wmich.cs1120.la5;

import java.util.ArrayList;

public class EnergyAnalyzer implements IRover {
	// This class is responsible for providing the “total energy cost”
	//of the path.
	
	private MapCreatorFromTxt mc; // holds place for a MapCreator object to be
	// referenced

	private ArrayList<IArea> path; // holds place for an area array list to be
	// referenced

	private String analysis; 
	
	/**
	 * Calculates the total energy of the path
	 */
	@Override
	public void analyzePath() {
		
		double totEnergy = 0;
		String energyAnalysis = "";
		for(int index = 0; index < path.size(); index++){
			totEnergy += path.get(index).calcConsumedEnergy();
		}
		
		energyAnalysis += totEnergy;
		
		this.setAnalysis(energyAnalysis.trim());

	}

	/**
	 * Returns the total energy of the path as a string
	 * @return analysis The total energy of the path
	 */
	@Override
	public String getAnalysis() {
		
		return analysis;
	}

	/**
	 * Sets the local variable for total energy
	 * @param analysis The total energy for the found path
	 */
	@Override
	public void setAnalysis(String analysis) {
		
		this.analysis = analysis;

	}

	/**
	 * Returns the stored path ArrayList
	 * @return path ArrayList that holds the objects of the path
	 */
	@Override
	public ArrayList<IArea> getPath() {
		return path;
	}

	/**
	 * Sets the local path variable
	 * @param path The found path
	 */
	@Override
	public void setPath(ArrayList<IArea> path) {
		
		this.path = path;
		
	}
	
	/**
	 * The name of the current analyzer
	 * @return String The name of the current analyzer
	 */
	@Override
	public String toString(){
		
		return "Energy Analyzer";
	
	}

}
