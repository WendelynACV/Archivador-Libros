package webapp;

import appLayer.Autor;
import appLayer.Autores;

import javax.ws.rs.*;
import javax.ws.rs.core.Configuration;
import javax.ws.rs.core.Context;
import javax.ws.rs.core.Request;
import javax.ws.rs.core.UriInfo;
import java.util.ArrayList;
import java.util.List;

@Path("/autores")
public class ControladorDeAutores {

    @Context
    UriInfo uriInfo;
    @Context
    Request request;
    String id;

    @GET
    @Path("/obtenerAutores")
    @Produces("application/json")
    public List<Autor> obtenerAutores() {
        List<Autor> autores = new ArrayList<>();
        autores.addAll(Autores.instance.getModel().values());
        return autores;
    }

    @POST
    @Path("/guardarAutor")
    @Produces("application/json")
    @Consumes("application/json")
    public Autor guardarAutor(Autor autor) {
        Autores.instance.agregarAutor(autor);
        return autor;
    }

}
