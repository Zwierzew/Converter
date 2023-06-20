package converter;
/*
Napisz mechanizm konwertujący temperaturę w następujących formatach:
    * C -> K  [(]0 C -> 273.15 K;  100 C -> 373.15 K]
    * K -> C
    * F -> C  [ F = (1 stopień C * 9) / 5  + 32  ]
    * C -> F
Przygotuj odpowiedni interfejs, który będzie reprezentować operację konwersji.
Zaimplementuj interfejs dla każdej z klas konwertujących i zaprezentuj funkcjonalność polimorfizmu
(obiekt możemy schować za typem zmiennej tego interfejsu).
 */
public interface Converter {
    float temperatureConverter(float degree);
}
