package webapp;

import appLayer.Autor;
import appLayer.Autores;

import javax.ws.rs.*;
import javax.ws.rs.core.Configuration;
import javax.ws.rs.core.Context;
import java.util.ArrayList;

@Path("/actores")
public class ControladorDeAutores {

    private Autores actores = new Autores();

    @GET
    @Path("/obtenerAutores")
    @Produces("application/json")
    public ArrayList<Autor> obtenerAutores() {
        return actores.obtenerActores();
    }

    @POST
    @Path("/guardarAutores")
    @Produces("application/json")
    @Consumes("application/json")
    public Autor guardarAutores(Autor autor) {
        this.actores.agregarAutor(autor);
        return autor;
    }

}
