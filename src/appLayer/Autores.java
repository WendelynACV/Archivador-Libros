package appLayer;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.Map;

public enum Autores {

    instance;

    private Map<String, Autor> contentProvider = new HashMap<>();

    private Autores(){}

    public void agregarAutor(Autor autor){
        contentProvider.put(autor.getIdAutor(), autor);
    }

    public void borrarAutor(Autor autor){
        contentProvider.remove(autor.getIdAutor(), autor);
    }

    public Map<String, Autor> getModel(){
        return contentProvider;
    }

}
