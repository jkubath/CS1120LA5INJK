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
	
	@Override
	public void analyzePath() {
		
		double totalRad = 0;
		String radAnalysis = "";
		for(int index = 0; index < path.size(); index++){
			totalRad += path.get(index).getRadiation();
		}
		
		radAnalysis += totalRad;
		
		this.setAnalysis(radAnalysis.trim());
		

	}

	@Override
	public String getAnalysis() {
		return this.analysis;
	}

	@Override
	public void setAnalysis(String analysis) {
		
		this.analysis = analysis;

	}

	@Override
	public ArrayList<IArea> getPath() {
		
		return path;
	}

	@Override
	public void setPath(ArrayList<IArea> path) {
		
		this.path = path;
		
	}
	
	@Override
	public String toString(){
		
		return "Radiation Analyzer";
	
	}

}
