package evenOdd;

import input.Input;
import output.Output;

public class EvenOdd {

    // Solo las usas en un método, no hace falta que las declares a nivel de clase.
    static int number;
    static int rest;

    public static void isItEvenOrOdd() {
        Output.askIntValue();
        number = Input.getIntValue();

        rest = number % 2;

        // ✅
        if (rest == 0) {
            System.out.println(number + " ES PAR");
        } else {
            System.out.println(number + " ES IMPAR");
        }

        /* ✅✅: uso innecesario de variable.
        if ((number % 2) == 0) {

        }
        */

        /* ✅✅✅: uso de booleanos (aporta más semántica al código).
        boolean isEven = (number % 2) == 0;
        if (isEven) {

        }
        */
    }

    public static void listOddNumbers() {
        for (int i = 1; i < 51; i++) {
            System.out.print(i + " | ");
            i++; // ¿Por qué incrementas otra vez la i?
            /* Alternativa:
             * if (i < 50) {
             *  System.out.print(i + " | ");
             * } else {
             *   System.out.println(i);
             * }
             */
        }
        System.out.println();
    }
}
