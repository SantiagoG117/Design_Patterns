package Strategy;

/**
 * @author Santiago
 * @see CelsiusToFarenheit
 * @see FahrenheitToCelsius
 * @see MilesToKilometers
 * @see UnitConverter
 * @see Converter
 * @see MilesToKilometers
 */

public class UnitConverterTest {

    /**
     *
     * @param args command line arguments
     */
    public static void main(String[] args) {
        UnitConverter converter = new UnitConverter(new CelsiusToFarenheit()); //Constructor injection
        System.out.println(converter.requestConverter(10));

        converter.setConverter(new FahrenheitToCelsius());// Method injection
        System.out.println(converter.requestConverter(50));

        converter.setConverter(new MilesToKilometers());
        System.out.println(converter.requestConverter(100));

        converter.setConverter(new KilometerToMiles());
        System.out.println(converter.requestConverter(50));



	}

}
