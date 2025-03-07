package main;

import areaRectangle.AreaRectangle;
import celsiusFahrenheitConverter.CelsiusFahrenheitConverter;
import chooseRandomPerson.ChooseRandomPerson;
import digitsNumber.DigitsNumber;
import hanged.Hanged;
import input.Input;
import listNumbers.ListNumbers;
import multiplicationTable.MultiplicationTable;
import output.Output;
import evenOdd.EvenOdd;
import sum100firstNaturalNumbers.Sum100firstNaturalNumbers;
import validator.Validator;

public class Main {

    private static final int RECTANGLE_AREA_CALCULATION = 1;
    public static final int EXIT = 20;
    public static void main(String[] args) {

        int optionMenu;

        do {
            Output.showMenu();
            optionMenu = Input.getIntValue();
            actionToPerform(optionMenu);
        } while (!userWantsToExit(optionMenu) || !optionMenuInRange(optionMenu));
        Output.byeBye();
    }

    public static void actionToPerform(int optionMenu) {
        switch (optionMenu) {
            case RECTANGLE_AREA_CALCULATION: // <- mejor así, como vimos en clase.
                AreaRectangle.rectangleAreaCalculation();
                break;
            case 2:
                CelsiusFahrenheitConverter.celsiusFahrenheitConverter();
                break;
            case 3:
                ListNumbers.listNumbersWithFor();
                ListNumbers.listNumbersWithWhile();
                break;
            case 4:
                EvenOdd.isItEvenOrOdd();
                break;
            case 5:
                EvenOdd.listOddNumbers();
                break;
            case 6:
                Sum100firstNaturalNumbers.sum100firstNaturalNumbers();
                break;
            case 7:
                MultiplicationTable.showMultiplicationTable();
                break;
            case 8:
                DigitsNumber.numberOfDigitsNumber();
                break;
            case 9:
                ChooseRandomPerson.chooseRandomPersonFromList();
                break;
            case 10:
                Hanged.playHanged();
                break;
            default: // no hace falta. La puedes borrar tranquilamente.
        }
    }

    // ✅ Privado mejor.
    public static boolean userWantsToExit(int optionMenu) {
        return Validator.userWantsToExit(optionMenu);
    }

    // ✅ Ídem.
    public static boolean optionMenuInRange(int optionMenu) {
        return Validator.validateOptionMenu(optionMenu);
    }

}
