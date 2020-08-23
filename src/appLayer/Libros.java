package appLayer;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public enum Libros {

    instance;

    private Map<String, Libro> contentProvider = new HashMap<>();

    private Libros(){}

    public void agregarLibro(Libro libro){
        contentProvider.put(libro.getIdLibro(), libro);
    }

    public void borrarLibro(String idLibro){
        contentProvider.remove(idLibro);
    }

    public List<Libro> buscarLibrosPorAutor(String idAutor){
        List<Libro> resultado = new ArrayList<>();
        List<Libro> libros = new ArrayList<>();
        libros.addAll(Libros.instance.getModel().values());

        for(int i = 0; i < libros.size(); i ++){
            if(libros.get(i).getIdAutor().equals(idAutor)) {
                resultado.add(libros.get(i));
            }
        }

        return resultado;
    }

    public Map<String, Libro> getModel(){
        return contentProvider;
    }

}
