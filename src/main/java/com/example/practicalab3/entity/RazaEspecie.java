package com.example.practicalab3.entity;

import jakarta.persistence.*;

@Entity
@Table(name = "raza_especie", schema = "mydb", catalog = "")
public class RazaEspecie {
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Id
    @Column(name = "idraza_especie")
    private int idrazaEspecie;
    @Basic
    @Column(name = "descripcion")
    private String descripcion;

    public int getIdrazaEspecie() {
        return idrazaEspecie;
    }

    public void setIdrazaEspecie(int idrazaEspecie) {
        this.idrazaEspecie = idrazaEspecie;
    }

    public String getDescripcion() {
        return descripcion;
    }

    public void setDescripcion(String descripcion) {
        this.descripcion = descripcion;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;

        RazaEspecie that = (RazaEspecie) o;

        if (idrazaEspecie != that.idrazaEspecie) return false;
        if (descripcion != null ? !descripcion.equals(that.descripcion) : that.descripcion != null) return false;

        return true;
    }

    @Override
    public int hashCode() {
        int result = idrazaEspecie;
        result = 31 * result + (descripcion != null ? descripcion.hashCode() : 0);
        return result;
    }
}
