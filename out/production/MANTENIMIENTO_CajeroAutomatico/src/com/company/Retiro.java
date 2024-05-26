package com.company;


public class Retiro extends Operaciones {
    private Cuenta cuentaPrincipal;
    private int tipo;
    private int monto;

    public Retiro(Cuenta cuentaPrincipal,int tipo, int monto){
        this.cuentaPrincipal=cuentaPrincipal;
        this.tipo=tipo;
        this.monto=monto;
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
        if(cuentaOrigen.getSaldo()< monto){
            respuesta = "=====================\n" +
                    "Saldo insuficiente \n" +
                    "=====================";
        }else{
            this.cuentaPrincipal.setSaldo(cuentaPrincipal.getSaldo()-monto);
            respuesta= "Retiro realizado de "+monto+" de la cuenta: " + cuentaPrincipal.getNumeroCuenta() +"\n" +
                    " Saldo restante:"+ cuentaOrigen.getSaldo();
        }
        return respuesta;
    }
    public Cuenta getCuentaPrincipal() {    return CuentaPrincipal;    }

    public void setCuentaPrincipal(Cuenta cuentaPrincipal) {     CuentaPrincipal = cuentaPrincipal;  }

    public int getTipo() {  return Tipo;    }

    public void setTipo(int tipo) {     Tipo = tipo;    }

    public int getMonto() {      return Monto;   }

    public void setMonto(int monto) {       Monto = monto;      }

}
