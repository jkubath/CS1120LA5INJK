package edu.wmich.cs1120.la5;

import java.util.ArrayList;

public class RadiationAnalyzer implements IRover {
	// This class is responsible for providing the “total radiation” of
	//the path.
	
	private MapCreator mc; // holds place for a MapCreator object to be
			// referenced
	
	private ArrayList<IArea> path; // holds place for an area array list to be
			// referenced
	
	private String analysis;
	
	@Override
	public void analyzePath() {
		

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

}
