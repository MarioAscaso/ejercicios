package evenOdd;

import input.Input;
import output.Output;

public class EvenOdd {

    static int number;
    static int rest;

    public static void isItEvenOrOdd() {
        Output.askIntValue();
        number = Input.getIntValue();

        rest = number % 2;

        if (rest == 0) {
            System.out.println(number + " ES PAR");
        } else {
            System.out.println(number + " ES IMPAR");
        }
    }

    public static void listOddNumbers() {
        for (int i = 1; i < 51; i++) {
            System.out.print(i + " | ");
            i++;
        }
        System.out.println();
    }
}
