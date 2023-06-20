package converter;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class TemperatureConversionTest {
    @Test
    public void shouldReturnTrueIfConversionCorrect(){
        // given
        CelsiusToFahrenheit toFahrenheit = new CelsiusToFahrenheit();
        CelsiusToKelvin toKelvin = new CelsiusToKelvin();
        //czy tworząc testy również jest dopuszczalne ukrycie obiektu pod typem interfejsu?

        FahrenheitToCelsius toCelsiusF = new FahrenheitToCelsius();
        KelvinToCelsius toCelsiusK = new KelvinToCelsius();

        // when
        float degreeInFahrenheit = toFahrenheit.temperatureConverter(0);
        boolean expectedFahrenheit = degreeInFahrenheit == 32f;

        float degreeInKelvin = toKelvin.temperatureConverter(0);
        boolean expectedKelvin = degreeInKelvin == 273.15f;

        float degreeInCelsiusF = toCelsiusF.temperatureConverter(0);
        boolean expectedCelsiusF = degreeInCelsiusF == -17.777778f;

        float degreeInCelsiusK = toCelsiusK.temperatureConverter(0);
        boolean expectedCelsiusK = degreeInCelsiusK == -273.15f;

        // then
        assertTrue(expectedFahrenheit);
        assertTrue(expectedKelvin);
        assertTrue(expectedCelsiusF);
        assertTrue(expectedCelsiusK);
    }
}