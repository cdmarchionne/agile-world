package proyecto;

import java.util.Date;
import java.util.List;

/**
 * TODO: description
 */
public class Sprint {

    private String nombre;

    private String descripcion;

    private Date fechaInicio;

    private Date fechaFin;

    private List<UserStories> userStories;

    public EstadoBinario getEstado() {
        return null;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(final String nombre) {
        this.nombre = nombre;
    }

    public String getDescripcion() {
        return descripcion;
    }

    public void setDescripcion(final String descripcion) {
        this.descripcion = descripcion;
    }

    public Date getFechaInicio() {
        return fechaInicio;
    }

    public void setFechaInicio(final Date fechaInicio) {
        this.fechaInicio = fechaInicio;
    }

    public Date getFechaFin() {
        return fechaFin;
    }

    public void setFechaFin(final Date fechaFin) {
        this.fechaFin = fechaFin;
    }

    public List<UserStories> getUserStories() {
        return userStories;
    }

    public void setUserStories(final List<UserStories> userStories) {
        this.userStories = userStories;
    }

}
