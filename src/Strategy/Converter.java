package Strategy;

/**
* @author Santiago Garcia
 * * Strategy class
 * * All the type of units we want to support in our application should implement the Strategy.Converter interface
 * @author Santiago
 * @see CelsiusToFarenheit
 * @see FahrenheitToCelsius
 * @see KilometerToMiles
 * @see MilesToKilometers
 * @see UnitConverter
 * @see UnitConverterTest
 **/
public interface Converter {

    double convert (double unit);


}
