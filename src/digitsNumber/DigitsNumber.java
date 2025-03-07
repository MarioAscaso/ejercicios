package digitsNumber;

import input.Input;
import output.Output;

public class DigitsNumber {

    static long number;

    public static void numberOfDigitsNumber() {
        Output.askIntValue();
        number = Input.getLongValue();

        int contador = 0;

        while (number != 0) {
            number /= 10;
            contador++;
        }

        // 🤔 ¿?
        if (contador == 0) {
            contador = 1;
        }

        System.out.println("EL NÚMERO TIENE " + contador + " DÍGITOS.");
    }

}
