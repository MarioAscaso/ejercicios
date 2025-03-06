package chooseRandomPerson;

import input.Input;
import output.Output;
import person.Person;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import java.util.Random;

public class ChooseRandomPerson {

    static Person person0 = new Person("MARIO", "ASCASO", 23);
    static Person person1 = new Person("DAVID", "ASCASO", 45);
    static Person person2 = new Person("ADOLFO", "TROCOLI", 22);
    static Person person3 = new Person("MARCO", "DE LUCA", 23);
    static Person person4 = new Person("HARRY", "VILLANUEVA", 28);
    static Person person5 = new Person("ABELARDO", "LEON", 56);
    static Person person6 = new Person("MARIA", "VICENTE", 22);
    static Person person7 = new Person("ALBERTO", "PEREZ", 25);
    static Person person8 = new Person("CRISTINA", "CRUZ", 25);
    static Person person9 = new Person("LUCIA", "CASADO", 26);
    static Person person10 = new Person("NICO", "MAECHA", 29);
    static Person person11 = new Person("PAULA", "MOSQUERA", 33);

    static List<Person> listPersons = new ArrayList<>();
    static Iterator<Person> iterator;
    static Random rand = new Random();


    public static void chooseRandomPersonFromList() {
        listPersons.add(person0);
        listPersons.add(person1);
        listPersons.add(person2);
        listPersons.add(person3);
        listPersons.add(person4);
        listPersons.add(person5);
        listPersons.add(person6);
        listPersons.add(person7);
        listPersons.add(person8);
        listPersons.add(person9);
        listPersons.add(person10);
        listPersons.add(person11);

        System.out.printf("%-15s %-20s %-5s\n", "NOMBRE", "APELLIDO", "EDAD");
        System.out.println("----------------------------------------");

        iterator = listPersons.iterator();
        while (iterator.hasNext()) {
            Person person = iterator.next();
            System.out.printf("%-15s %-20s %-5d\n", person.getFirstName(), person.getLastName(), person.getAge());
        }

        Person randomPerson = listPersons.get(rand.nextInt(listPersons.size()));
        System.out.println("\nPERSONA SELECCIONADA ALEATORIAMENTE:");
        System.out.printf("NOMBRE: %s, APELLIDO: %s, EDAD: %d\n", randomPerson.getFirstName(), randomPerson.getLastName(), randomPerson.getAge());

    }

}
