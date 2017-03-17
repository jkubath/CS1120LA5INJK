package edu.wmich.cs1120.la5;

import java.util.ArrayList;

public class EnergyAnalyzer implements IRover {
	// This class is responsible for providing the “total energy cost”
	//of the path.

	private ArrayList<IArea> path; // holds place for an area array list to be
	// referenced

	private String analysis; // holds place for a string representing the path analysis.
	
	/**
	 * This method analyzes the path by calculating the total energy expended during its crossing.
	 */
	@Override
	public void analyzePath() {
		
		double totEnergy = 0;
		String energyAnalysis = "";
		for(int index = 0; index < path.size(); index++){
			totEnergy += path.get(index).calcConsumedEnergy();
		}
		
		energyAnalysis += totEnergy;
		
		this.setAnalysis(this.toString() + ": " + energyAnalysis.trim());

	}

	/**
	 * 
	 * @return 
	 */
	@Override
	public String getAnalysis() {
		
		return analysis;
	}

	/**
	 * 
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
	 */
	@Override
	public void setPath(ArrayList<IArea> path) {
		
		this.path = path;
		
	}
	
	/**
	 * This method returns the name of this analyzer.
	 * @return the String object of the name of the analyzer.
	 */
	@Override
	public String toString(){
		
		return "Energy Analyzer";
	
	}

}
