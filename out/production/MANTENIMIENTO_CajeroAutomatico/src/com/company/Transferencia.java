package com.company;

import java.util.Scanner;

public class Transferencia extends Operaciones implements Movimientos{

    public void retiro(Cuenta c,int tipo, int monto){
    }
    //idea de como hacer
    public void transferir(Cuenta origen, int tipo, Cuenta destino, int monto){
        Scanner entrada=new Scanner(System.in);
        tipo=destino.getTipo();
        System.out.println("Dame el numero de cuenta a la que vas a transferir");
        String cuentaDestino=entrada.nextLine();
        destino.setNumeroCuenta(cuentaDestino);
        System.out.print("Cuanto quieres Transferir: ");
        Transferencia();
        System.out.println("Los datos de la transferencia: Cuenta destino "+destino.getNumeroCuenta()+" tipo de cuenta: "+tipo+", de la " +
                "cuenta origen:"+origen.getNumeroCuenta()+"por el monto de :"+transferencia);
    }
    @Override
    public void Transacciones() {
                if (transferencia <= getSaldo()) {
                    transacciones = getSaldo();
                    setSaldo(transacciones - transferencia);
                    System.out.println("====================================");
                    System.out.println("=================BBVA===============");
                    System.out.println("				Debito				");
                    System.out.println("Se relalizo una Tranferencia el 31/10/2023");
                    System.out.println("A la cuenta "+ numero_cuenta);
                    System.out.println("transferiste : " + transferencia);
                    System.out.println("Tu saldo actual es: " + getSaldo());
                    System.out.println("====================================");
                } else {
                    System.out.println("=====================");
                    System.out.println("Saldo insuficiente");
                    System.out.println("=====================");
               
        	
                }
    			
    }
}