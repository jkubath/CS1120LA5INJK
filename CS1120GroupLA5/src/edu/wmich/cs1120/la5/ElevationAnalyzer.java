package edu.wmich.cs1120.la5;

import java.util.ArrayList;

public class ElevationAnalyzer implements IRover {
	// This class is responsible for providing the �average elevation�
	//of the path.
	
	private MapCreator mc; // holds place for a MapCreator object to be
	// referenced

	private ArrayList<IArea> path; // holds place for an area array list to be
	// referenced

	private String analysis;
	
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

	@Override
	public String getAnalysis() {
		
		return analysis;
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
		
		return "Elevation Analyzer";
	
	}

}
