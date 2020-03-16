/**
* City defined as
* @param {String} name
* @param {Road} array - of 10 roads
* @param {int} numRoads - the amount of the roads
* 
* @author  Idan Abergel & Hen Hess
*/

public class City {

	private String name;
	private Road[] roads = new Road[10];
	private int numRoads;

	/*
	 * Contractor of City (String)
	 * @param {string} name - define the name of the new city
	 */
	public City(String name) {
		// Contractor of new city named 'name'
		this.name = name;
		this.numRoads = 0;
	}
	/*
	 * connect current city object to a road.
	 * @param {road} r - connect road r to the city.
	 */
	public void connect(Road r) {
		roads[numRoads] = r;
		numRoads++;
	}
	/*
	 * check what is the nearest city connected to the Object.
	 * @return {City} the nearest city as an object.
	 */
	public City nearestCity() {
		int min = 0;
		City c1, c2;
		c1 = roads[0].getCity1();
		c2 = roads[0].getCity2();
		for (int i = 0; i < numRoads; i++) {
			if (i == 0) {
				min = roads[0].getLength();

			} else {
				if (roads[i].getLength() < min) {
					min = roads[i].getLength();
					c1 = roads[i].getCity1();
					c2 = roads[i].getCity2();
				}
			}
		}// for
		if(this.name.equals(c1.toString())) return c2;
		else
			return c1;
	}
	/*
	 * city to a name string
	 * @return {String} the city name of the object.
	 */
	public String toString() {
		return this.name;
	}
}
