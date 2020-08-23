package appLayer;

import java.util.HashMap;
import java.util.Map;

public enum Libros {

    instance;

    private Map<String, Libro> contentProvider = new HashMap<>();

    private Libros(){}

    public void agregarLibro(Libro libro){
        contentProvider.put(libro.getIdLibro(), libro);
    }

    public void borrarLibro(Libro libro){
        contentProvider.remove(libro.getIdLibro(), libro);
    }

    public Map<String, Libro> getModel(){
        return contentProvider;
    }

}
