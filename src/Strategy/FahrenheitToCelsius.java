package Strategy;

/**
 * @author Santiago
 * @see Converter
 * @see FahrenheitToCelsius
 * @see MilesToKilometers
 * @see UnitConverter
 * @see UnitConverterTest
 **/

public class FahrenheitToCelsius implements Converter {
	private final double convFactor=1.8;
	private final double convOrigin=32.0;
	
	/**
	 * @param fahrenheit value in Fahrenheit to be converted
	 * @return equivalent in Celsius
	 */
	public double convert(double fahrenheit) {
		System.out.println("Unit in Fahrenheit converted to Celsius");
		return (fahrenheit - convOrigin)/convFactor;
	}
}
