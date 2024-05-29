package com.company;


public class Retiro extends Operaciones {
    private Cuenta cuentaPrincipal;
    private int tipo;
    private  int monto;

    public Retiro(Cuenta cuentaPrincipal, int tipo, int monto) {
        this.cuentaPrincipal = cuentaPrincipal;
        this.tipo = tipo;
        this.monto = monto;
    }
    //
    public String infoTransaccion() {
        String respuesta="";
        if(cuentaPrincipal.getSaldo()< monto){
            respuesta = "=====================\n" +
                    "Saldo insuficiente \n" +
                    "=====================";
        }else{

            cuentaPrincipal.setSaldo(cuentaPrincipal.getSaldo()-monto);
            respuesta= "Retiro realizado de "+monto+" de la cuenta: " + cuentaPrincipal.getNumeroCuenta() +"\n" +
                    " Saldo restante:"+ cuentaPrincipal.getSaldo();
        }
        return respuesta;
    }

    public Cuenta getCuentaPrincipal() {    return cuentaPrincipal; }

    public void setCuentaPrincipal(Cuenta cuentaPrincipal) {    this.cuentaPrincipal = cuentaPrincipal; }

    public int getTipo() {  return tipo;    }

    public void setTipo(int tipo) { this.tipo = tipo;   }

    public int getMonto() { return monto;   }

    public void setMonto(int monto) {   this.monto = monto; }
}
