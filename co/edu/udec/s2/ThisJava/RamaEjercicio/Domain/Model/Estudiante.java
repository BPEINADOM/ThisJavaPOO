package Domain.Model;

public class Estudiante {
    private String nombre;
    private int edad;

    // Constructor por defecto
    public Estudiante() {
        this("Jose Antonio", 20);
    }

    public Estudiante(String nombre, int edad) {
        this.nombre = nombre;
        this.edad = edad;
    }

    // Metodo
    public void datosEstudiante() {
        System.out.println("Nombre: " + nombre);
        System.out.println("Edad: " + edad + " años");
    }
}
