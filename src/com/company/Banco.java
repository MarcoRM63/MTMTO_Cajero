package com.company;

import java.util.ArrayList;

public class Banco {
    private String nombre;
    private String localizacion;
    private ArrayList<Cuenta> clientes;

    public Banco(String nombre, String localizacion, ArrayList<Cuenta> clientes) {
        this.nombre = nombre;
        this.localizacion = localizacion;
        this.clientes = clientes;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public String getLocalizacion() {
        return localizacion;
    }

    public void setLocalizacion(String localizacion) {
        this.localizacion = localizacion;
    }

    public ArrayList<Cuenta> getClientes() {
        return clientes;
    }

    public void setClientes(ArrayList<Cuenta> clientes) {
        this.clientes = clientes;
    }
}
