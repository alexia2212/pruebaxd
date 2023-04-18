package com.example.practicalab3.entity;

import jakarta.persistence.*;

@Entity
public class Responsable {
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Id
    @Column(name = "idresponsable")
    private int idresponsable;
    @Basic
    @Column(name = "nombre")
    private String nombre;

    public int getIdresponsable() {
        return idresponsable;
    }

    public void setIdresponsable(int idresponsable) {
        this.idresponsable = idresponsable;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;

        Responsable that = (Responsable) o;

        if (idresponsable != that.idresponsable) return false;
        if (nombre != null ? !nombre.equals(that.nombre) : that.nombre != null) return false;

        return true;
    }

    @Override
    public int hashCode() {
        int result = idresponsable;
        result = 31 * result + (nombre != null ? nombre.hashCode() : 0);
        return result;
    }
}
