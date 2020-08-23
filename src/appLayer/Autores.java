package appLayer;

import java.util.ArrayList;

public class Autores {

    public ArrayList<Autor> autores;

    public Autores() {
        autores = new ArrayList<>();
    }

    public void agregarAutor(Autor autor){
        autores.add(autor);
    }

}
