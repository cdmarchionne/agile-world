package proyecto;

import java.util.Date;
import java.util.List;

/**
 * TODO: description
 */
public class Proyecto {

    private String nombre;

    private Date fechaCreacion;

    private EstadoProyecto estado;

    private Integer duracionDelSprint;

    private List<Sprint> sprints;

    // Usamos Listas de elementos que no se repiten (Set) o Listas Comunes
    private List<UserStories> userStories;

}
