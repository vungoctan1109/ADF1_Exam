package exam1;

import exam1.entity.ConversionUtil;

public class MainThread {
    public static void main(String[] args) {
        ConversionUtil conversionUtil = new ConversionUtil();
        System.out.println(conversionUtil.celciusToFahrenheit(30));
        System.out.println(conversionUtil.fahrenheitToCelsius(122));
    }
}
