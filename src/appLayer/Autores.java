package appLayer;

import java.util.ArrayList;

public class Autores {

    private ArrayList<Autor> autores;

    public Autores() {
        autores = new ArrayList<>();
    }

    public void agregarAutor(Autor autor){
        autores.add(autor);
    }

    public ArrayList<Autor> obtenerActores(){
        return autores;
    }

}
