package validator;

public class Validator {

    static boolean inRange;
    static boolean wantsToExit;

    public static boolean validateOptionMenu(int optionMenu) {
        inRange = true;
        if (optionMenu < 1 || optionMenu > 20) {
            inRange = false;
            System.out.println("OPCIÓN SELECCIONADA FUERA DE RANGO");
        }
        return inRange;
    }

    public static boolean userWantsToExit(int optionMenu) {
        wantsToExit = optionMenu == 20;
        return wantsToExit;
    }

    public static boolean isAlive(int lives){
        return lives != 0;
    }

}
