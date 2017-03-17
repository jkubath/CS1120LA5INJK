package edu.wmich.cs1120.la5;

import java.util.ArrayList;

public class RadiationAnalyzer implements IRover {
	// This class is responsible for providing the “total radiation” of
	//the path.
	
	private IMapCreator mc; // holds place for a MapCreator object to be referenced
	
	private ArrayList<IArea> path; // holds place for an area array list to be
			// referenced
	
	private String analysis;
	
	/**
	 * This method analyzes the path by calculating the total radiation encountered in it.
	 */
	@Override
	public void analyzePath() {
		
		double totalRad = 0;
		String radAnalysis = "";
		
		//
		for(int index = 0; index < path.size(); index++){
			totalRad += path.get(index).getRadiation();
		}
		
		
		radAnalysis += totalRad;
		
		
		this.setAnalysis(radAnalysis.trim());
		

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
		
		return "Radiation Analyzer";
	
	}

}
