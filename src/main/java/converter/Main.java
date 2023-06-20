package converter;

import java.util.Arrays;

/*
Przygotuj odpowiedni interfejs, który będzie reprezentować operację konwersji.
Zaimplementuj interfejs dla każdej z klas konwertujących i zaprezentuj funkcjonalność polimorfizmu
(obiekt możemy schować za typem zmiennej tego interfejsu).
 */
public class Main {
    public static void main(String[] args) {
        Converter toCelsiusK = new KelvinToCelsius();
        float zeroCelsiusK = toCelsiusK.temperatureConverter(0f);

        Converter toCelsiusF = new FahrenheitToCelsius();
        float zeroCelsiusF = toCelsiusF.temperatureConverter(0f);

        Converter toKelvin = new CelsiusToKelvin();
        float zeroKelvin = toKelvin.temperatureConverter(0f);

        Converter toFahrenheit1 = new CelsiusToFahrenheit();
        float zeroFahrenheit1 = toFahrenheit1.temperatureConverter(0f);

        Converter toFahrenheit2 = new CelsiusToFahrenheit(150f); //
        float zeroFahrenheit2 = toFahrenheit2.temperatureConverter(0f);

        System.out.println(String.format("Zero degree expressed in: \n\t Celsius (from Kelvin): %f" +
                "\n\t Celsius (from Fahrenheit): %f, \n\t Kelvin: %f \n\t Fahrenheit 1: %f \n\t Fahreheit 2: %f"
                , zeroCelsiusK, zeroCelsiusF, zeroKelvin, zeroFahrenheit1, zeroFahrenheit2));

        toFahrenheit1 = new CelsiusToKelvin();

        System.out.println("0 Celsius to Kelvin hidden under variable toFahrenheit: "
                + toFahrenheit1.temperatureConverter(0f));

    }
    public static void convert(Converter converter, float degree){ //nie mogę wywołac tej metody na powyższych zmiennych - dlaczego?
        converter.temperatureConverter(0);
    }
}
