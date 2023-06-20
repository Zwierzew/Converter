package converter;
/*
 * C -> K  [0 C -> 273.15 K;  100 C -> 373.15 K]
 */
public class CelsiusToKelvin implements Converter {
    private float celsiusDegree;

    public CelsiusToKelvin(){
        this.celsiusDegree = 0;
    }
    @Override
    public float temperatureConverter(float degree) {
        return degree + 273.15f;
    }
    public float getCelsiusDegree(){
        return celsiusDegree;
    }
    public void setCelsiusDegree(float degree){
        this.celsiusDegree = degree;
    }
}
