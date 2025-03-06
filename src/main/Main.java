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

    public static void main(String[] args) {

        int optionmenu;

        do {
            Output.showMenu();
            optionmenu = Input.getIntValue();
            actionToPerform(optionmenu);
        } while (!userWantsToExit(optionmenu) || !optionMenuInRange(optionmenu));
        Output.byeBye();
    }

    public static void actionToPerform(int optionMenu) {
        switch (optionMenu) {
            case 1:
                AreaRectangle.RectangleAreaCalculation();
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
            default:
        }
    }

    public static boolean userWantsToExit(int optionMenu) {
        return Validator.userWantsToExit(optionMenu);
    }

    public static boolean optionMenuInRange(int optionMenu) {
        return Validator.validateOptionMenu(optionMenu);
    }

}
