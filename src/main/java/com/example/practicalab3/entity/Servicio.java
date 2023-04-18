package com.example.practicalab3.entity;

import jakarta.persistence.*;

import java.sql.Timestamp;

@Entity
public class Servicio {
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Id
    @Column(name = "idservicio")
    private int idservicio;
    @Basic
    @Column(name = "hora_inicio")
    private Timestamp horaInicio;
    @Basic
    @Column(name = "duracion")
    private int duracion;
    @Basic
    @Column(name = "entrega")
    private String entrega;
    @Basic
    @Column(name = "responsable_idresponsable")
    private int responsableIdresponsable;
    @Basic
    @Column(name = "mascota_idmascota")
    private int mascotaIdmascota;
    @Basic
    @Column(name = "cuenta_idcuenta")
    private int cuentaIdcuenta;

    public int getIdservicio() {
        return idservicio;
    }

    public void setIdservicio(int idservicio) {
        this.idservicio = idservicio;
    }

    public Timestamp getHoraInicio() {
        return horaInicio;
    }

    public void setHoraInicio(Timestamp horaInicio) {
        this.horaInicio = horaInicio;
    }

    public int getDuracion() {
        return duracion;
    }

    public void setDuracion(int duracion) {
        this.duracion = duracion;
    }

    public String getEntrega() {
        return entrega;
    }

    public void setEntrega(String entrega) {
        this.entrega = entrega;
    }

    public int getResponsableIdresponsable() {
        return responsableIdresponsable;
    }

    public void setResponsableIdresponsable(int responsableIdresponsable) {
        this.responsableIdresponsable = responsableIdresponsable;
    }

    public int getMascotaIdmascota() {
        return mascotaIdmascota;
    }

    public void setMascotaIdmascota(int mascotaIdmascota) {
        this.mascotaIdmascota = mascotaIdmascota;
    }

    public int getCuentaIdcuenta() {
        return cuentaIdcuenta;
    }

    public void setCuentaIdcuenta(int cuentaIdcuenta) {
        this.cuentaIdcuenta = cuentaIdcuenta;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;

        Servicio servicio = (Servicio) o;

        if (idservicio != servicio.idservicio) return false;
        if (duracion != servicio.duracion) return false;
        if (responsableIdresponsable != servicio.responsableIdresponsable) return false;
        if (mascotaIdmascota != servicio.mascotaIdmascota) return false;
        if (cuentaIdcuenta != servicio.cuentaIdcuenta) return false;
        if (horaInicio != null ? !horaInicio.equals(servicio.horaInicio) : servicio.horaInicio != null) return false;
        if (entrega != null ? !entrega.equals(servicio.entrega) : servicio.entrega != null) return false;

        return true;
    }

    @Override
    public int hashCode() {
        int result = idservicio;
        result = 31 * result + (horaInicio != null ? horaInicio.hashCode() : 0);
        result = 31 * result + duracion;
        result = 31 * result + (entrega != null ? entrega.hashCode() : 0);
        result = 31 * result + responsableIdresponsable;
        result = 31 * result + mascotaIdmascota;
        result = 31 * result + cuentaIdcuenta;
        return result;
    }
}
