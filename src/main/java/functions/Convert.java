package functions;

public class Convert {
    public static int transformFahrenheiteToCelsius(int degrees) {
        return (int) ((degrees - 32) * 5 / 9);
    }

    public static int transformCelsiusToFahrenheit(int degrees) {
        return (int) ((degrees * 9) / 5) + 32;
    }
}
