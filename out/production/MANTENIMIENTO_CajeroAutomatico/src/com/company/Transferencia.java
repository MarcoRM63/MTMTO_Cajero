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

    public String infoTransaccion() {
        String respuesta="";
        if(cuentaOrigen.getSaldo()< monto){
            respuesta = "=====================\n" +
                        "Saldo insuficiente \n" +
                        "=====================";
        }else{

            cuentaOrigen.setSaldo(cuentaOrigen.getSaldo()-monto);
            cuentaDestino.setSaldo(cuentaDestino.getSaldo()+monto);
            respuesta= "Transferencia realizada de "+monto+" de la cuenta: " + cuentaOrigen.getNumeroCuenta() +
                    " a la cuenta: " + cuentaDestino.getNumeroCuenta() +"\n" +
                    " Saldo restante:"+ cuentaOrigen.getSaldo();
        }
        return respuesta;
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