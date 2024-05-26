package com.company;

import java.util.Scanner;

public class Cajero  implements Movimientos{
   private Banco banco;
   Scanner entrada = new Scanner(System.in);

    public Cajero(Banco banco) {
        this.banco = banco;
    }

    public void operaciones(TarjetaDebito t) {
        System.out.println("Bienvenido al cajero de " + banco.getNombre() + " :)");
        if (banco.getClientes().contains(t.getCuenta())) {

            System.out.println("Introduce el nip de tu tarjeta:");
            final String NIP  = entrada.nextLine();
            if(t.getNip().equals(NIP)) {
                int bandera = 0;
                int seleccion = 0;
                String Nombre = "";
                do {
                    do {
                        System.out.println(" Buenas tardes esta en un cajero automatico de BBVA");
                        System.out.println(" Hoy es 31/10/2023");
                        System.out.println(" Porfavor seleccione una opción:");
                        System.out.println("    1. Consulta de saldo.");
                        System.out.println("    2. Retiro de efectivo.");
                        System.out.println("    3. Deposito de efectivo.");
                        System.out.println("    4. Hacer una transferencia");
                        System.out.println("    5. Salir.");
                        seleccion = entrada.nextInt();

                        if (seleccion >= 1 && seleccion <= 5) {
                            bandera = 1;
                        } else {
                            System.out.println("=================================================");
                            System.out.println("Opción no disponible, vuelva a intentar porfavor.");
                            System.out.println("=================================================");
                        }
                    } while (bandera == 0);

                    if (seleccion == 1) {
                        Operaciones mensajero = new Consulta();
                        mensajero.Transacciones();
                    } else if (seleccion == 2) {
                        Operaciones mensajero = new Retiro();
                        mensajero.Transacciones();
                    } else if (seleccion == 3) {
                        Operaciones mensajero = new Deposito();
                        mensajero.Transacciones();
                    } else if (seleccion == 4) {
                        Operaciones mensajero = new Transferencia();
                        mensajero.Transacciones();
                    } else if (seleccion == 5) {
                        System.out.println("==========================");
                        System.out.println("Gracias, vuelva pronto.");
                        System.out.println("==========================");
                        bandera = 2;
                    }
                } while (bandera != 2);
            }else{
                System.out.println("NIP incorrecto, terminando transaccion");
            }
        }else{
            System.out.println("Esta tarjeta no pertenece a este banco, terminando transaccion");
        }

    }
    @Override
    public void retiro(Cuenta c, int tipo, int monto) {

    }

    @Override
    public void transferir(Cuenta origen, int tipo, Cuenta destino, int monto) {

    }
}
