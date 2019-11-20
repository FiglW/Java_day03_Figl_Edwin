import javax.xml.stream.FactoryConfigurationError;

public class D3A5_E {

    public static void main(String[] args) {

        System.out.println(celsius2Fahrenheit(40));
        System.out.println(celsius2Fahrenheit(50));
        System.out.println(celsius2Fahrenheit(60));

        System.out.println(fahrenheit2Celsius(40));
        System.out.println(fahrenheit2Celsius(50));
        System.out.println(fahrenheit2Celsius(60));
    }

    public static float celsius2Fahrenheit(float celsius){

        // TF=TC*9/5+32
        return celsius * 9 / 5 + 32;
    }

    public static float fahrenheit2Celsius(float fahrenheit){

        // TC=(TF-32)*5/9
        return (fahrenheit -32) * 5 / 9;
    }
}
