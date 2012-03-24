package proyecto;

import java.util.List;

import utils.Comentarios;

/**
 * TODO: description
 */
public class UserStories {

    private String nombre;

    private String descripcion;

    private List<Comentarios> comentarios;

    private List<Tareas> userStories;

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

    public List<Comentarios> getComentarios() {
        return comentarios;
    }

    public void setComentarios(final List<Comentarios> comentarios) {
        this.comentarios = comentarios;
    }

    public List<Tareas> getUserStories() {
        return userStories;
    }

    public void setUserStories(final List<Tareas> userStories) {
        this.userStories = userStories;
    }

}
