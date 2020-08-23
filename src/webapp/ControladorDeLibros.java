package webapp;

import javax.ws.rs.GET;
import javax.ws.rs.Path;
import javax.ws.rs.Produces;

@Path("/obtenerLibros")
public class ControladorDeLibros {

    @GET
    @Produces("application/json")
    public String getBooks() {
        return "Hello World";
    }

}
