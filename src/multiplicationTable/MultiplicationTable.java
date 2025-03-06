package multiplicationTable;

import input.Input;
import output.Output;

public class MultiplicationTable {

    static int number;

    public static void showMultiplicationTable() {
        Output.askIntValue();
        number = Input.getIntValue();

        for (int i = 1; i < 11; i++) {
            System.out.printf("%-2d x %-2d = %-3d%n", number, i, (number * i));
        }


    }

}
