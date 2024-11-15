package Domain.Model;

public class Producto {
    private String nombre;
    private double precio;

    // Constructor por defecto
    public Producto(String nombre, double precio) {
        this.nombre = nombre;
        this.precio = precio;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public void setPrecio(double precio) {
        this.precio = precio;
    }

    //Uso incorrecto del this

    // public static void mostrarProducto() {
    //     System.out.println(this.nombre);
    //     System.out.println(this.precio);
    // }

    public void mostrarProducto() {
        System.out.println("Nombre del producto: " + nombre);
        System.out.println("Precio del producto: " + precio);
    }

}
