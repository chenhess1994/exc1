/**
* Road is a pathway between two cities.
* @param {City} city1
* @param {City} city2
* @param {int} length - the length of the road
* 
* @author  Idan Abergel & Hen Hess
*/

public class Road {

	private City city1, city2;
	private int length;
	
	
	/*
	 * Contractor of Road
	 * road is a pathway between two cities.
	 * @param {City} city1 
	 * @param {City} city2 
	 * @param {int} length 
	 */
	public Road(City city1, City city2, int length) {
		this.city1 = city1;
		this.city2 = city2;
		this.length = length;
		city1.connect(this);
	}

	public City getCity1() {
		return this.city1;
	}

	public City getCity2() {
		return this.city2;
	}

	public int getLength() {
		return this.length;
	}
	

}
