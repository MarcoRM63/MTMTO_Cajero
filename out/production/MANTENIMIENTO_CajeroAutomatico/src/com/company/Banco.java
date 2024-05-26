package com.company;

import java.util.ArrayList;
import java.util.HashMap;

public class Banco {
    private String nombre;
    private String localizacion;
    private HashMap<String, Cuenta> clientes = new HashMap<>();

    public Banco(String nombre, String localizacion) {
        this.nombre = nombre;
        this.localizacion = localizacion;
    }

    public HashMap<String, Cuenta> getClientes() {
        return clientes;
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

    public void addCuenta(Cuenta c){
        clientes.put(c.getNumeroCuenta(),c);
    }
}
