package output;

import person.Person;

public class Output {

    public static void showMenu(){
        System.out.print("""
                
                1. - AREA RECTÁNGULO
                2. - CELSIUS -> FAHRENHEIT
                3. - LISTAR NÚMEROS
                4. - PAR O IMPAR
                5. - LISTAR NÚMEROS IMPARES
                6. - SUMA DE LOS 100 PRIMEROS NÚMEROS
                7. - TABLA DE MULTIPLICAR
                8. - CUENTA DÍGITOS
                9. - ELEGIR PERSONA AL AZAR
                10. - AHORCADO
                
                20.- EXIT
                ¿QUE OPCIÓN QUIERES HACER? ->\s""");
    }

    public static void askHeight(){System.out.print("Introduce el largo del rectángulo: ");}
    public static void askWidth(){System.out.print("Introduce el ancho del rectángulo: ");}

    public static void askCelsius(){System.out.print("Introduce los grados en Celsius: ");}

    public static void askIntValue(){System.out.print("Introduce un numero entero: ");}

    public static void askLetter(){System.out.print("INTRODUCE LETRA: ");}

    public static void byeBye(){System.out.println("HASTA PRONTO");}
}
