package proyecto;

import persona.Empleado;

/**
 * TODO: description
 */
public class Tareas {

    private Integer peso;

    private Empleado desarrollador;

    private EstadoTarea estado;

    public Integer getPeso() {
        return peso;
    }

    public void setPeso(final Integer peso) {
        this.peso = peso;
    }

    public Empleado getDesarrollador() {
        return desarrollador;
    }

    public void setDesarrollador(final Empleado desarrollador) {
        this.desarrollador = desarrollador;
    }

    public EstadoTarea getEstado() {
        return estado;
    }

    public void setEstado(final EstadoTarea estado) {
        this.estado = estado;
    }
}
