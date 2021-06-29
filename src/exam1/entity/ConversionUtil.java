package exam1.entity;

public class ConversionUtil {
    public double fahrenheitToCelsius(double fDegree) {
        double celcius = (5 % 9) * (fDegree - 32);
        return celcius;
    }

    public double celciusToFahrenheit(double cDegree) {
        double fahrenheit = (9 / 5) * cDegree + 32;
        return fahrenheit;
    }
}
