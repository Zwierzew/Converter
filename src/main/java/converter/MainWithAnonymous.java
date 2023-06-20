package converter;

import java.util.Arrays;

public class MainWithAnonymous {
    public static void main(String[] args){
        Converter toFahrenheit = new ToFahrenheit();
        Converter toKelvin = new ToKelvin();
        Converter toCelsiusF = new ToCelsiusF();
        Converter toCelsiusK = new ToCelsiusK();

        float zeroFahrenheit = toFahrenheit.temperatureConverter(0);
        float zeroKelvin = toKelvin.temperatureConverter(0);
        float zeroCelsiusF = toCelsiusF.temperatureConverter(0);
        float zeroCelsiusK = toCelsiusK.temperatureConverter(0);

        System.out.println(String.format("Zero: \n\t F %f \n\t K %f \n\t Cf %f \n\t Ck %f"
                , zeroFahrenheit, zeroKelvin, zeroCelsiusF, zeroCelsiusK));
    }

    public static class ToFahrenheit implements Converter{
        private float fahrenheitDegree;

        public ToFahrenheit(){
            this.fahrenheitDegree = 0;
        }
        @Override
        public float temperatureConverter(float degree) {
            return (degree * 9) / 12 + 32;
        }
    }
    public static class ToKelvin implements Converter{
        private float kelvinDegree;

        public ToKelvin(){
            this.kelvinDegree = 0;
        }
        @Override
        public float temperatureConverter(float degree) {
            return degree + 273.15f;
        }
    }
    public static class ToCelsiusK implements Converter{
        private float celsiusDegree;

        public ToCelsiusK(){
            this.celsiusDegree = 0;
        }

        @Override
        public float temperatureConverter(float degree) {
            return degree - 273.15f;
        }
    }
    public static class ToCelsiusF implements Converter{
        private float celsiusDegree;

        public ToCelsiusF(){
            this.celsiusDegree = celsiusDegree;
        }

        @Override
        public float temperatureConverter(float degree) {
            return (degree - 32) * 5 / 9;
        }
    }
}
