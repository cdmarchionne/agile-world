package utils;

import java.util.Date;

import persona.Persona;

/**
 * TODO: description
 */
public class Comentarios {

    private Persona persona;

    private Date fechaCreacion;

    public Persona getPersona() {
        return persona;
    }

    public void setPersona(final Persona persona) {
        this.persona = persona;
    }

    public Date getFechaCreacion() {
        return fechaCreacion;
    }

    public void setFechaCreacion(final Date fechaCreacion) {
        this.fechaCreacion = fechaCreacion;
    }

    public String getDescripcion() {
        return descripcion;
    }

    public void setDescripcion(final String descripcion) {
        this.descripcion = descripcion;
    }

    private String descripcion;
}
