package edu.wmich.cs1120.la5;

import java.io.*;

public interface IMapCreator throws IOException {
	void scanTerrain(String fileName, int threshold) throws IOException;
	// Read from the file, set up the IArea[10][10] and set the
	//terrain for the object of TerrainScanner
	TerrainScanner getScanner();
	void setScanner(TerrainScanner scanner);
}
