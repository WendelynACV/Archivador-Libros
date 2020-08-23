package webapp;

import appLayer.Libro;
import appLayer.Libros;

import javax.ws.rs.*;
import java.util.ArrayList;
import java.util.List;

@Path("/libros")
public class ControladorDeLibros {

    @GET
    @Path("/obtenerLibros")
    @Produces("application/json")
    public List<Libro> getBooks() {
        List<Libro> libros = new ArrayList<>();
        libros.addAll(Libros.instance.getModel().values());
        return libros;
    }

    @POST
    @Path("/guardarLibro")
    @Produces("application/json")
    @Consumes("application/json")
    public Libro guardarLibro(Libro libro) {
        Libros.instance.agregarLibro(libro);
        return libro;
    }

    @DELETE
    @Path("/borrarLibro/{idLibro}")
    @Produces("application/json")
    public String borrarLibro(@PathParam("idLibro") String idLibro) {
        Libros.instance.borrarLibro(idLibro);
        return "El libro se borro exitosamente.";
    }

    @GET
    @Path("/buscarLibroPorAutor/{idAutor}")
    @Produces("application/json")
    public List<Libro> buscarLibroPorAutor(@PathParam("idAutor") String idAutor) {
        return Libros.instance.buscarLibrosPorAutor(idAutor);
    }

}
