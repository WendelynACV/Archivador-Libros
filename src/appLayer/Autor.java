package appLayer;

public class Autor {
    private String idAutor;
    private String nombreAutor= "";
    private String nacionalidad ="";

    public Autor (String idAutor, String nombreAutor, String nacionalidad) {
        this.idAutor = idAutor;
        this.nombreAutor = nombreAutor;
        this.nacionalidad = nacionalidad;
    }

    public String getIdAutor() {
        return idAutor;
    }

    public void setIdAutor(String idAutor) {
        this.idAutor = idAutor;
    }

    public String getNombreAutor() {
        return nombreAutor;
    }

    public void setNombreAutor(String nombreAutor) {
        this.nombreAutor = nombreAutor;
    }

    public String getNacionalidad() {
        return nacionalidad;
    }

    public void setNacionalidad(String nacionalidad) {
        this.nacionalidad = nacionalidad;
    }
}
