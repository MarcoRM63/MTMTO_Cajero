package com.company;

public class TarjetaDebito {
    private  int numero_Tarjeta;
    private Cliente cliente;
    private Cuenta cuenta;

    public int getNumero_Tarjeta() {
        return numero_Tarjeta;
    }

    public void setNumero_Tarjeta(int numero_Tarjeta) {
        this.numero_Tarjeta = numero_Tarjeta;
    }

    public Cliente getCliente() {
        return cliente;
    }

    public void setCliente(Cliente cliente) {
        this.cliente = cliente;
    }

    public Cuenta getCuenta() {
        return cuenta;
    }

    public void setCuenta(Cuenta cuenta) {
        this.cuenta = cuenta;
    }
}
