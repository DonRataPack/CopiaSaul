package parte_2.programas_poo.almacen_y_verduleria.domain;

public class Producto {
    private String nombre;
    private double precio;
    public Producto() {
    }
    public Producto(String nombre, double precio) {
        this.nombre = nombre;
        this.precio = precio;
    }
    public String getNombre() {
        return nombre;
    }
    public void setNombre(String nombre) {
        this.nombre = nombre;
    }
    @Override
    public String toString() {
        final StringBuffer sb = new StringBuffer();
        sb.append("nombre = ").append(nombre);
        sb.append(", precio = ").append(precio);
        return sb.toString();
    }
}
