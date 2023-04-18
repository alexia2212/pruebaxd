package com.example.practicalab3.entity;

import jakarta.persistence.*;

@Entity
@Table(name = "opciones_servicio", schema = "mydb", catalog = "")
public class OpcionesServicio {
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Id
    @Column(name = "idopciones_servicio")
    private int idopcionesServicio;
    @Basic
    @Column(name = "servicio_idservicio1")
    private int servicioIdservicio1;
    @Basic
    @Column(name = "opcion_idopcion")
    private int opcionIdopcion;

    public int getIdopcionesServicio() {
        return idopcionesServicio;
    }

    public void setIdopcionesServicio(int idopcionesServicio) {
        this.idopcionesServicio = idopcionesServicio;
    }

    public int getServicioIdservicio1() {
        return servicioIdservicio1;
    }

    public void setServicioIdservicio1(int servicioIdservicio1) {
        this.servicioIdservicio1 = servicioIdservicio1;
    }

    public int getOpcionIdopcion() {
        return opcionIdopcion;
    }

    public void setOpcionIdopcion(int opcionIdopcion) {
        this.opcionIdopcion = opcionIdopcion;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;

        OpcionesServicio that = (OpcionesServicio) o;

        if (idopcionesServicio != that.idopcionesServicio) return false;
        if (servicioIdservicio1 != that.servicioIdservicio1) return false;
        if (opcionIdopcion != that.opcionIdopcion) return false;

        return true;
    }

    @Override
    public int hashCode() {
        int result = idopcionesServicio;
        result = 31 * result + servicioIdservicio1;
        result = 31 * result + opcionIdopcion;
        return result;
    }
}
