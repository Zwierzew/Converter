package converter;
/*
 * K -> C
 */
public class KelvinToCelsius implements Converter{
    private float kelvinDegree = 0;

    public KelvinToCelsius(){

    }
    @Override
    public float temperatureConverter(float degree) {
        return degree - 273.15f; // InteliiJ chce żeby zrobić castowanie (float) - potrzebne?
    }
    public float getKelvinDegree(){
        return kelvinDegree;
    }
    public void setKelvinDegree(float degree){
        this.kelvinDegree = degree;
    }
}
