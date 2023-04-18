package com.example.practicalab3.entity;

import jakarta.persistence.*;

@Entity
public class Opcion {
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Id
    @Column(name = "idopcion")
    private int idopcion;
    @Basic
    @Column(name = "descripcion")
    private String descripcion;
    @Basic
    @Column(name = "tiempo_minutos")
    private int tiempoMinutos;
    @Basic
    @Column(name = "precio")
    private double precio;

    public int getIdopcion() {
        return idopcion;
    }

    public void setIdopcion(int idopcion) {
        this.idopcion = idopcion;
    }

    public String getDescripcion() {
        return descripcion;
    }

    public void setDescripcion(String descripcion) {
        this.descripcion = descripcion;
    }

    public int getTiempoMinutos() {
        return tiempoMinutos;
    }

    public void setTiempoMinutos(int tiempoMinutos) {
        this.tiempoMinutos = tiempoMinutos;
    }

    public double getPrecio() {
        return precio;
    }

    public void setPrecio(double precio) {
        this.precio = precio;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;

        Opcion opcion = (Opcion) o;

        if (idopcion != opcion.idopcion) return false;
        if (tiempoMinutos != opcion.tiempoMinutos) return false;
        if (Double.compare(opcion.precio, precio) != 0) return false;
        if (descripcion != null ? !descripcion.equals(opcion.descripcion) : opcion.descripcion != null) return false;

        return true;
    }

    @Override
    public int hashCode() {
        int result;
        long temp;
        result = idopcion;
        result = 31 * result + (descripcion != null ? descripcion.hashCode() : 0);
        result = 31 * result + tiempoMinutos;
        temp = Double.doubleToLongBits(precio);
        result = 31 * result + (int) (temp ^ (temp >>> 32));
        return result;
    }
}
