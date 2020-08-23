package appLayer;

public class Libro {
    private Autor autor = null;
    private String idLibro = "";
    private String descripcion = "";
    private int cantidad;
    private boolean disponibilidad = false;

    public Libro (Autor autor, String idLibro, String descripcion, int cantidad, boolean disponibilidad) {
        this.autor = autor;
        this.idLibro = idLibro;
        this.descripcion = descripcion;
        this.cantidad = cantidad;
        this.disponibilidad = disponibilidad;
    }

    public Autor getAutor() {
        return autor;
    }

    public void setAutor(Autor autor) {
        this.autor = autor;
    }

    public String getIdLibro() {
        return idLibro;
    }

    public void setIdLibro(String idLibro) {
        this.idLibro = idLibro;
    }

    public String getDescripcion() {
        return descripcion;
    }

    public void setDescripcion(String descripcion) {
        this.descripcion = descripcion;
    }

    public int getCantidad() {
        return cantidad;
    }

    public void setCantidad(int cantidad) {
        this.cantidad = cantidad;
    }

    public boolean isDisponibilidad() {
        return disponibilidad;
    }

    public void setDisponibilidad(boolean disponibilidad) {
        this.disponibilidad = disponibilidad;
    }
}
