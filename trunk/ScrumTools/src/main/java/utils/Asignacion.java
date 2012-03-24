package utils;

import java.util.Date;

import persona.Persona;
import proyecto.Proyecto;

/**
 * TODO: description
 */
public class Asignacion {

    private Persona persona;

    private Proyecto proyecto;

    private Rol rol;

    public Persona getPersona() {
        return persona;
    }

    public void setPersona(final Persona persona) {
        this.persona = persona;
    }

    public Proyecto getProyecto() {
        return proyecto;
    }

    public void setProyecto(final Proyecto proyecto) {
        this.proyecto = proyecto;
    }

    public Rol getRol() {
        return rol;
    }

    public void setRol(final Rol rol) {
        this.rol = rol;
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

    private Date fechaInicio;

    private Date fechaFin;
}
