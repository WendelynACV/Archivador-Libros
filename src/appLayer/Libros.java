package appLayer;

import java.util.ArrayList;

public class Libros {

    public ArrayList<Libro> libros;

    public Libros() {
        libros = new ArrayList<>();
    }

    public void agregarLibro(Libro libro){
        libros.add(libro);
    }

}
