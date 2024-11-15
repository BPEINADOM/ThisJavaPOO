import Domain.Model.Estudiante;
import Domain.Model.Producto;

public class Principal {

    public static void main(String[] args) {  

        System.out.println("*****************7502410037******************");
        System.out.println("********BILLY JEAN YER PEINADO MADERA********");
        System.out.println("*********************************************");

        // Objeto del estudiante
        Estudiante estudianteDatos = new Estudiante();
        System.out.println("Datos del estudiante:");
        estudianteDatos.datosEstudiante();
        System.out.println("*********************************************");

        // Objeto del producto
        Producto productoDetalles = new Producto("Clorox", 15000.0);
        System.out.println("Detalles del producto:");
        productoDetalles.mostrarProducto();
        System.out.println("*********************************************");

    }

}
