package appLayer;

import javax.xml.bind.annotation.XmlRootElement;

@XmlRootElement
public class Libro {

    private String idAutor;
    private String idLibro;
    private String descripcion;
    private int cantidad;
    private boolean disponibilidad;

    public Libro() {
        this.idAutor = "";
        this.idLibro = "";
        this.descripcion = "";
        this.cantidad = 0;
        this.disponibilidad = false;
    }

    public Libro(String idAutor, String idLibro, String descripcion, int cantidad, boolean disponibilidad) {
        this.idAutor = idAutor;
        this.idLibro = idLibro;
        this.descripcion = descripcion;
        this.cantidad = cantidad;
        this.disponibilidad = disponibilidad;
    }

    public String getIdAutor() {
        return idAutor;
    }

    public void setIdAutor(String idAutor) {
        this.idAutor = idAutor;
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
