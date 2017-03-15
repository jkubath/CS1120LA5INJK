package edu.wmich.cs1120.la5;

public class HighArea extends Area {
	
	/**
	 * This method gets the value of the basic energy cost in the area and
	 * multiplies it by four to yield the calculation of the energy consumed in
	 * a high area.
	 * 
	 * @return the value of the energy consumed by a rover traveling in a high
	 *         area.
	 */
	@Override
	public double calcConsumedEnergy() {

		return getBasicEnergyCost() * 4;
	}

}
