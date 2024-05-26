package com.company;

public class Cuenta {
    private Cliente cliente;
    private String numeroCuenta;
    private  int tipo;
    private double saldo;
    final public static int AHORRO = 1;
    final public static int CHEQUES = 2;

    public Cuenta(Cliente cliente, String numeroCuenta, int tipo) {
        this.cliente = cliente;
        this.numeroCuenta = numeroCuenta;
        this.tipo = tipo;
    }

    public Cliente getCliente() {
        return cliente;
    }

    public void setCliente(Cliente cliente) {
        this.cliente = cliente;
    }

    public String getNumeroCuenta() {
        return numeroCuenta;
    }

    public void setNumeroCuenta(String numeroCuenta) {
        this.numeroCuenta = numeroCuenta;
    }

    public int getTipo() {
        return tipo;
    }

    public void setTipo(int tipo) {
        this.tipo = tipo;
    }
}
