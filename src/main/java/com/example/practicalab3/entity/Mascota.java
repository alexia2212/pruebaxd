package com.example.practicalab3.entity;

import jakarta.persistence.*;

@Entity
public class Mascota {
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Id
    @Column(name = "idmascota")
    private int idmascota;
    @Basic
    @Column(name = "nombre")
    private String nombre;
    @Basic
    @Column(name = "anho")
    private String anho;
    @Basic
    @Column(name = "historia")
    private String historia;
    @Basic
    @Column(name = "observaciones")
    private String observaciones;
    @Basic
    @Column(name = "sexo")
    private String sexo;
    @Basic
    @Column(name = "raza_otros")
    private String razaOtros;
    @Basic
    @Column(name = "raza_especie_idraza_especie")
    private int razaEspecieIdrazaEspecie;
    @Basic
    @Column(name = "cuenta_idcuenta")
    private Integer cuentaIdcuenta;

    public int getIdmascota() {
        return idmascota;
    }

    public void setIdmascota(int idmascota) {
        this.idmascota = idmascota;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public String getAnho() {
        return anho;
    }

    public void setAnho(String anho) {
        this.anho = anho;
    }

    public String getHistoria() {
        return historia;
    }

    public void setHistoria(String historia) {
        this.historia = historia;
    }

    public String getObservaciones() {
        return observaciones;
    }

    public void setObservaciones(String observaciones) {
        this.observaciones = observaciones;
    }

    public String getSexo() {
        return sexo;
    }

    public void setSexo(String sexo) {
        this.sexo = sexo;
    }

    public String getRazaOtros() {
        return razaOtros;
    }

    public void setRazaOtros(String razaOtros) {
        this.razaOtros = razaOtros;
    }

    public int getRazaEspecieIdrazaEspecie() {
        return razaEspecieIdrazaEspecie;
    }

    public void setRazaEspecieIdrazaEspecie(int razaEspecieIdrazaEspecie) {
        this.razaEspecieIdrazaEspecie = razaEspecieIdrazaEspecie;
    }

    public Integer getCuentaIdcuenta() {
        return cuentaIdcuenta;
    }

    public void setCuentaIdcuenta(Integer cuentaIdcuenta) {
        this.cuentaIdcuenta = cuentaIdcuenta;
    }

}
