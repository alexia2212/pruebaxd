package com.example.practicalab3.entity;

import jakarta.persistence.*;

@Entity
public class Cuenta {
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Id
    @Column(name = "idcuenta")
    private int idcuenta;
    @Basic
    @Column(name = "correo")
    private String correo;
    @Basic
    @Column(name = "direccion")
    private String direccion;
    @Basic
    @Column(name = "password")
    private String password;
    @Basic
    @Column(name = "telefono")
    private String telefono;
    @Basic
    @Column(name = "admin")
    private Integer admin;

    public int getIdcuenta() {
        return idcuenta;
    }

    public void setIdcuenta(int idcuenta) {
        this.idcuenta = idcuenta;
    }

    public String getCorreo() {
        return correo;
    }

    public void setCorreo(String correo) {
        this.correo = correo;
    }

    public String getDireccion() {
        return direccion;
    }

    public void setDireccion(String direccion) {
        this.direccion = direccion;
    }

    public String getPassword() {
        return password;
    }

    public void setPassword(String password) {
        this.password = password;
    }

    public String getTelefono() {
        return telefono;
    }

    public void setTelefono(String telefono) {
        this.telefono = telefono;
    }

    public Integer getAdmin() {
        return admin;
    }

    public void setAdmin(Integer admin) {
        this.admin = admin;
    }

}
