package Strategy;

/**
 * @author Santiago
 * @see CelsiusToFarenheit
 * @see Converter
 * @see FahrenheitToCelsius
 * @see MilesToKilometers
 * @see UnitConverter
 * @see UnitConverterTest
 * @see KilometerToMiles
 *
 **/

public class MilesToKilometers implements Converter {
    //Attributes
    private final double CONVERTFACTOR = 1.6;

    /**
     *
     * @param miles
     * @return unit in Kilometers
     */
    @Override
    public double convert(double miles) {
        System.out.println("Unit in miles converted to Kilometers");
        return miles * CONVERTFACTOR;
    }
}
