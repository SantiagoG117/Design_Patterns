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
 **/


public class KilometerToMiles implements Converter{
    //Attributes
    private final double CONVERTFACTOR = 0.62137;

    /**
     *
     * @param kilometer
     * @return unit in miles
     */
    @Override
    public double convert(double kilometer) {
        return kilometer * CONVERTFACTOR;
    }
}
