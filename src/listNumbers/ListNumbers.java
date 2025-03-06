package listNumbers;

public class ListNumbers {

    public static void listNumbersWithFor() {
        System.out.println("LISTA CON BUCLE FOR");
        for (int i = 1; i < 101; i++) {
            System.out.print(i + " | ");
        }
        System.out.println();
    }

    public static void listNumbersWithWhile() {
        int i = 1;
        System.out.println("LISTA CON BUCLE WHILE");
        while (i < 101) {
            System.out.print(i + " | ");
            i++;
        }
        System.out.println();
    }

}
