package com.company;

public class TarjetaDebito {
    private  String numero_Tarjeta;
    private Cuenta cuenta;
    final private  String nip;
    public TarjetaDebito(String numero_Tarjeta, Cuenta cuenta,String nip) {
        this.numero_Tarjeta = numero_Tarjeta;
        this.cuenta = cuenta;
        this.nip = nip;
    }

    public String getNip() {
        return nip;
    }

    public String getNumero_Tarjeta() {
        return numero_Tarjeta;
    }

    public void setNumero_Tarjeta(String numero_Tarjeta) {
        this.numero_Tarjeta = numero_Tarjeta;
    }

    public Cuenta getCuenta() {
        return cuenta;
    }

    public void setCuenta(Cuenta cuenta) {
        this.cuenta = cuenta;
    }
}
