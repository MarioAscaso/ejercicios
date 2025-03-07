package celsiusFahrenheitConverter;

import input.Input;
import output.Output;

public class CelsiusFahrenheitConverter {

    static float celsius;
    static float fahrenheit;

    public static void celsiusFahrenheitConverter() {
        Output.askCelsius();
        celsius = Input.getFloatValue();

        fahrenheit = celsius * 9 / 5 + 32;

        System.out.println(celsius + " ºC --> " + fahrenheit + " ºF");
    }

}
