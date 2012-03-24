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

    public void setNombre(final String nombre) {
        this.nombre = nombre;
    }

    public String getNombre() {
        return nombre;
    }

    public Date getFechaCreacion() {
        return fechaCreacion;
    }

    public void setFechaCreacion(final Date fechaCreacion) {
        this.fechaCreacion = fechaCreacion;
    }

    public EstadoProyecto getEstado() {
        return estado;
    }

    public void setEstado(final EstadoProyecto estado) {
        this.estado = estado;
    }

    public Integer getDuracionDelSprint() {
        return duracionDelSprint;
    }

    public void setDuracionDelSprint(final Integer duracionDelSprint) {
        this.duracionDelSprint = duracionDelSprint;
    }

    public List<Sprint> getSprints() {
        return sprints;
    }

    public void setSprints(final List<Sprint> sprints) {
        this.sprints = sprints;
    }

    public List<UserStories> getUserStories() {
        return userStories;
    }

    public void setUserStories(final List<UserStories> userStories) {
        this.userStories = userStories;
    }

}
