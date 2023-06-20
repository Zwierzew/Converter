package converter;
/*
 * F -> C  [ C = (1 stopien F -32) * 5/9  ]
 */
public class FahrenheitToCelsius implements Converter {
    private float fahrenheitDegree;

    //celowo pominięty konstruktor

    @Override
    public float temperatureConverter(float degree) {
        return (degree - 32) * 5 / 9;
    }
    public float getFahrenheitDegree(){
        return fahrenheitDegree;
    }
    public void setFahrenheitDegree(float degree){
        this.fahrenheitDegree = degree;
    }
}
