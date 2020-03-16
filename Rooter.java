/**
* Rooter is a class for root calculation
* the precision of the calculation defined as @param 'precision'
* @author  Idan Abergel & Hen Hess
*/
public class Rooter {

	private double precision;
	
	
	public Rooter(double precision) {
		// TODO Auto-generated constructor stub
		// Initializing precision
		// input: precision
		setPrecision(precision);
	}

	public void setPrecision(double precision) {
		// set the precision level
		// input: precision

		this.precision = precision;
	}
	/*
	 * calculate the sqrt of input x
	 * @param double
	 * @return second root of input double as double. 
	 */
	public double sqrt(double x) {

		double one = x / 2.0, two;

		do {
			two = x / one;
			if (Math.abs(one - two) < precision)
				return one;
			else
				one = (one + two) / 2.0;

		} while (one != two);

		return one;
	}

}