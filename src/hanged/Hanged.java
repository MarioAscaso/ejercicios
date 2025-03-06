package hanged;

import input.Input;
import output.Output;
import validator.Validator;

import java.util.ArrayList;
import java.util.List;
import java.util.Random;

public class Hanged {

    static List<String> words = new ArrayList<>();
    static Random rand = new Random();

    public static void addWords() {
        words.add("ATLETI");
        words.add("GALICIA");
        words.add("BARCELONA");
        words.add("ORDENADOR");
        words.add("PROGRAMACION");
        words.add("MADRID");
        words.add("VALDEBERNARDO");
        words.add("POKER");
        words.add("RATON");
        words.add("TECLADO");
        words.add("PANTALLA");
        words.add("MESA");
        words.add("FUEGO");
        words.add("TELEFONO");
    }

    public static void playHanged() {

        System.out.println("""
                ESTE ES EL JUEGO DEL AHORCADO
                TIENES QUE ADIVINAR LA PALABRA OCULTA, LETRA A LETRA
                ¡PERO CUIDADO! QUE SOLO TIENES 7 VIDAS
                SI PRUEBAS CON 7 LETRAS QUE NO SE ENCUENTRAN EN LA PALABRA OCULTA...
                SE ACABÓ EL JUEGO
                """);

        String iLetter;
        int countToLives = 0;
        int counterSuccess = 0;
        int lives = 7;

        addWords();
        String randomWord = words.get(rand.nextInt(words.size()));

        char[] letraDeLaPalabra = new char[randomWord.length()];
        boolean[] foundIt = new boolean[randomWord.length()];

        for (int i = 0; i < letraDeLaPalabra.length; i++) {
            letraDeLaPalabra[i] = randomWord.charAt(i);
        }

        System.out.print("PALABRA A ADIVINAR: ");
        for (int i = 0; i < randomWord.length(); i++) {
            System.out.print("_");
            foundIt[i] = false;
        }
        System.out.println();

        do {
            Output.askLetter();
            String letra = Input.getStringValue();

            for (int i = 0; i < randomWord.length(); i++) {
                iLetter = String.valueOf(randomWord.charAt(i));
                if (iLetter.equals(letra)) {
                    foundIt[i] = true;
                    counterSuccess++;
                }else{
                    countToLives ++;
                }
                if(countToLives == randomWord.length()){
                    lives--;
                }
            }

            int i = 0;
            while (i < randomWord.length()) {
                if (foundIt[i]) {
                    System.out.print(letraDeLaPalabra[i]);
                } else {
                    System.out.print("_");
                }
                i++;
            }
            System.out.println();
            if (counterSuccess == (randomWord.length())) {
                System.out.println("¡¡ENHORABUENA!!");
            } else {
                if (lives == 0) {
                    System.out.println("HAS PERDIDO");
                }
            }
        } while (counterSuccess < randomWord.length() && Validator.isAlive(lives));
    }

}
