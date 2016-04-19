package co.edu.uelbosque.adc.entidades;

public class Producto {
    private String nombre;
    private Double precio;
    private String descripcion;
    private int disponibles;
    private String imagen;
    
    public Producto(String nombre, String descripcion, Double precio, int disponibles, String imagen){
        this.nombre = nombre;
        this.descripcion = descripcion;
        this.precio = precio;
        this.disponibles = disponibles;
        this.imagen = imagen;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public Double getPrecio() {
        return precio;
    }

    public void setPrecio(Double precio) {
        this.precio = precio;
    }

    public String getDescripcion() {
        return descripcion;
    }

    public void setDescripcion(String descripcion) {
        this.descripcion = descripcion;
    }

    public int getDisponibles() {
        return disponibles;
    }

    public void setDisponibles(int disponibles) {
        this.disponibles = disponibles;
    }
    
    public String getImagen() {
        return imagen;
    }

    public void setImagen(String imagen) {
        this.imagen = imagen;
    }
}
