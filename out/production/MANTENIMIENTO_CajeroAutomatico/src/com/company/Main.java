package com.company;
import java.util.ArrayList;
import java.util.Scanner;

public class Main {
	static Scanner entrada = new Scanner(System.in);
    public static void main(String[] args) {

        Cliente juan = new Cliente(1233,"Juan Perez","Col Centro");
        Cliente pedro = new Cliente(1234,"Pedro","Col NvoCuliacan");
        Cuenta cJuan = new Cuenta(juan,"12131416",Cuenta.AHORRO);
        Cuenta cPedro = new Cuenta(juan,"1245455",Cuenta.AHORRO);
        ArrayList<Cuenta>cuentasBBVA = new ArrayList<>();
        cuentasBBVA.add(cJuan);
        cuentasBBVA.add(cJuan);
        cuentasBBVA.add(cPedro);
        TarjetaDebito tarjetaJuan = new TarjetaDebito("1345554",cJuan,"123");
        Banco bbva  = new Banco("BBVA","Emiliano zapata",cuentasBBVA);
        Cajero caj1 = new Cajero(bbva);


        caj1.operaciones(tarjetaJuan);
        /*
        System.out.println("----------------------------------------------------");
        System.out.print("Ingrese su Nombre:	(Catalina)");
        String Nombre = entrada.nextLine();
        System.out.print("Ingrese su Numero de cuenta:	(23140972)");
        String Num_cuenta = entrada.nextLine();
        System.out.print("Ingrese su Nip:		(8002)");
        int Nip = entrada.nextInt();
        System.out.println("----------------------------------------------------");
        if(Nombre.equals("Catalina") && Num_cuenta.equals("23140972") && Nip==8002) {
        	System.out.println("===============================================");
        	System.out.print(Nombre);
            Operaciones mesajero = new Consulta();
            mesajero.setSaldo(1700);

        }else {
        	System.out.println("===============================================");
            System.out.println("Alguno de sus datos es erroneo, intente denuevo");
        	System.out.println("===============================================");
   
        } */
    }


    public String getNombre(){
        return getNombre();
    }
}

