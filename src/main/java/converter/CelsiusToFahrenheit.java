package converter;
/*
 * C -> F [ F = (1 stopień C * 9) / 5  + 32  ]
 */
public class CelsiusToFahrenheit implements Converter {
    private float celsiusDegree;

    public CelsiusToFahrenheit(){ // czy w konwersji jest sens takiego konstruktora? czy lepiej zostawić konstruktor domyślny?
        this.celsiusDegree = 0;
    }
    public CelsiusToFahrenheit(float degree){
        this.celsiusDegree = degree;
    }

    @Override
    public float temperatureConverter(float degree) {
        return (degree * 9) / 12 + 32;
    }
    public float getCelsiusDegree(){
        return celsiusDegree;
    }
    public void setCelsiusDegree(float degree){
        this.celsiusDegree = degree;
    }
}
