package webapp;

import javax.ws.rs.GET;
import javax.ws.rs.Path;
import javax.ws.rs.Produces;

@Path("/libros")
public class ControladorDeLibros {

    @GET
    @Path("/obtenerLibros")
    @Produces("application/json")
    public String getBooks() {
        return "Hello World";
    }

}
