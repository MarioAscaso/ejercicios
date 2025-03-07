package validator;

import main.Main;

public class Validator {

    static boolean inRange;
    static boolean wantsToExit;

    public static boolean validateOptionMenu(int optionMenu) {
        inRange = true;
        if (optionMenu < 1 || optionMenu > 20) {
            inRange = false;
            System.out.println("OPCIÓN SELECCIONADA FUERA DE RANGO"); // 🙏❗ Por favor, no lo hagas en una función.
        }
        return inRange;

        // Mejor así: return (optionMenu >= Main.RECTANGLE_AREA_CALCULATION || optionMenu <= Main.EXIT)
    }

    public static boolean userWantsToExit(int optionMenu) {
        return (optionMenu == Main.EXIT);
    }

    /**
     * Si lives es menor que 0, según tu función esa persona está viva. 😉
     */
    public static boolean isAlive(int lives){
        return lives != 0; // mejor: lives > 0 (las vidas no pueden ser negativas).
    }

}
