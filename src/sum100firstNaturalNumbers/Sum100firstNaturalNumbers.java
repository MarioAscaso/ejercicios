package sum100firstNaturalNumbers;

public class Sum100firstNaturalNumbers {

    public static void sum100firstNaturalNumbers() {
        int i;
        int sum = 0;
        for (i = 1; i < 101; i++) {
            sum += i;
        }
        System.out.println("LA SUMA DE LOS 100 PRIMEROS NUMEROS NATURALES ES: " + sum);
    }

}
