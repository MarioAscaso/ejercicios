package person;

// ✅
public class Person {

    String nombre;
    String apellido;
    int edad;

    public Person(String nombre, String apellido, int edad) {
        this.nombre = nombre;
        this.apellido = apellido;
        this.edad = edad;
    }

    // puedes nombrar este método de mil maneras; una de ellas es: public String firstName()...
    public String getFirstName() {
        return nombre;
    }

    public String getLastName() {
        return apellido;
    }

    public int getAge() {
        return edad;
    }

    @Override
    public String toString() {
        return "%-10d" + nombre + "%-10d" + apellido + "&-2d" + edad;
    }
}
