package webapp;

import appLayer.Autor;

import javax.ws.rs.GET;
import javax.ws.rs.Path;
import javax.ws.rs.Produces;

@Path("/obtenerAutores")
public class ControladorDeAutores {

    @GET
    @Produces("application/json")
    public Autor getAuthor() {
        Autor autor = new Autor("1", "Sergio", "Tico");
        return autor;
    }

}
