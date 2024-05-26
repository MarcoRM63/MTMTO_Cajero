package com.company;

public class Transferencia extends Operaciones {
    private Cuenta cuentaOrigen;
    private Cuenta cuentaDestino;
    int monto;
    public Transferencia( Cuenta cuentaOrigen,int tipo,Cuenta cuentaDestino, int monto) {
        this.cuentaOrigen = cuentaOrigen;
        this.cuentaDestino = cuentaDestino;
        this.monto = monto;
    }

    public void Transaccion(String id, String fecha) {
        if(cuentaOrigen.getSaldo()< monto){
            System.out.println("=====================");
            System.out.println("Saldo insuficiente.");
            System.out.println("=====================");
        }else{
            System.out.println("Transferencia realizada de "  + " de la cuenta: " + cuentaOrigen.getNumeroCuenta() +
                    " a la cuenta: " + cuentaDestino.getNumeroCuenta());
        }

    }

    // Getters y Setters
    public Cuenta getCuentaOrigen() {
        return cuentaOrigen;
    }

    public void setCuentaOrigen(Cuenta cuentaOrigen) {
        this.cuentaOrigen = cuentaOrigen;
    }

    public Cuenta getCuentaDestino() {
        return cuentaDestino;
    }

    public void setCuentaDestino(Cuenta cuentaDestino) {
        this.cuentaDestino = cuentaDestino;
    }
}