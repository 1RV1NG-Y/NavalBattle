package com.example.proyecto;

public class Usuario {
    private String nombre;
    private String pass;
    private Integer victorias;

    public Usuario() {
    }

    public Usuario(String nombre, String pass, Integer victorias) {
        this.nombre = nombre;
        this.pass = pass;
        this.victorias = victorias;
    }

    public Integer getVictorias() {
        return victorias;
    }

    public void setVictorias(Integer victorias) {
        this.victorias = victorias;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public String getPass() {
        return pass;
    }

    public void setPass(String pass) {
        this.pass = pass;
    }
}
