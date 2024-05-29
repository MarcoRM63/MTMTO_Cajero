package com.company;
import java.util.ArrayList;
import java.util.Scanner;

public class Main {
    static Scanner entrada = new Scanner(System.in);

    public static void main(String[] args) {

        Cliente juan = new Cliente(1233, "Juan Perez", "Col Centro");
        Cliente pedro = new Cliente(1234, "Pedro", "Col NvoCuliacan");
        Cuenta cJuan = new Cuenta(juan, "12131416", Cuenta.AHORRO, 1500);
        Cuenta cPedro = new Cuenta(pedro, "1245455", Cuenta.AHORRO, 0);
        TarjetaDebito tarjetaJuan = new TarjetaDebito("1345554", cJuan, "123");
        TarjetaDebito tarjetaPedro= new TarjetaDebito("123456", cPedro, "123");

        Banco bbva = new Banco("BBVA", "Emiliano zapata");
        bbva.addCuenta(cJuan);
        bbva.addCuenta(cPedro);

        Cajero caj1 = new Cajero(bbva);
        caj1.operaciones(tarjetaJuan);
        caj1.operaciones(tarjetaPedro);
    }




    public String getNombre(){
        return getNombre();
    }
}


