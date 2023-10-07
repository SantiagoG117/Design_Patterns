package Strategy;

/**
 ** Context class
 * * We want that the Strategy.UnitConverter to behave differently, depending on the type of unit we use.
 * * We must keep a reference to the Strategy.Converter object
 * @author Santiago Garcia
 *  @see CelsiusToFarenheit
 *  @see Converter
 *  @see FahrenheitToCelsius
 *  @see MilesToKilometers
 *  @see KilometerToMiles
 *  @see UnitConverter
 *  @see UnitConverterTest
 *  *
 */
public class UnitConverter  {
    //Attributes
    private Converter converter;

    //Constructor
    public UnitConverter(Converter converter) {
        this.converter = converter;
    }

    /**
     ** Responsibility method: Delegates the responsibility of converting the unit to a specific object
     * @param unit
     * @return converted unit
     */
    public double requestConverter(double unit){
        return converter.convert(unit);
    }

    //Public methods
    public void setConverter(Converter converter) {
        this.converter = converter;
    }
}
