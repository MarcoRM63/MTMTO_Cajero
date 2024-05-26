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
    	/*
    			 System.out.print("Cuanto deseas retirar: ");
    		        Retiro();
    		        if (retiro <= getSaldo()) {
    		            //transacciones = getSaldo();
    		            setSaldo(transacciones - retiro);
    		            System.out.println("====================================");
    		            System.out.println("=================BBVA===============");
    		            System.out.println("				Debito				");
    		            System.out.println("Se relalizo una Consulta el 31/10/2023");
    		            System.out.println("Retiraste : " + retiro);
    		            System.out.println("Tu saldo actual es: " + getSaldo());
    		            System.out.println("====================================");
    		        } else {
    		            System.out.println("=====================");
    		            System.out.println("Saldo insuficiente.");
    		            System.out.println("=====================");


    }*/
        String respuesta="";
        if(cuentaPrincipal.getSaldo()< monto){
            respuesta = "=====================\n" +
                    "Saldo insuficiente \n" +
                    "=====================";
        }else{

            cuentaPrincipal.setSaldo(cuentaPrincipal.getSaldo()-monto);
            respuesta= "Transferencia realizada de "+monto+" de la cuenta: " + cuentaPrincipal.getNumeroCuenta() +"\n" +
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
