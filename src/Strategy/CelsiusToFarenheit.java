package Strategy;

/**
 * @author Santiago
 * @see CelsiusToFarenheit
 * @see Converter
 * @see FahrenheitToCelsius
 * @see KilometerToMiles
 * @see MilesToKilometers
 * @see UnitConverter
 * @see UnitConverterTest
**/
public class CelsiusToFarenheit implements Converter {
	private final double convFactor=1.8;
	private final double convOrigin=32.0;
	/**
	 * @param celsius value in Celsius to be converted
	 * @return equivalent in Fahrenheit
	 */
	public double convert(double celsius) {
		System.out.println("Unit in Celsius converted to Fahrenheit");
		return celsius*convFactor + convOrigin;
	}
}
