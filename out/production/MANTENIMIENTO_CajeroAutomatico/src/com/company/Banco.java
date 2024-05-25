package com.company;

import java.util.ArrayList;

public class Banco {
    private String nombre;
    private String localizacion;
    private ArrayList<Cliente> clientes;

    public Banco(String nombre, String localizacion, ArrayList<Cliente> clientes) {
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

    public ArrayList<Cliente> getClientes() {
        return clientes;
    }

    public void setClientes(ArrayList<Cliente> clientes) {
        this.clientes = clientes;
    }
}
