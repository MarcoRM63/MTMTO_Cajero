package com.company;

import java.util.Scanner;

public class Cajero implements  Transaccionable{
   private Banco banco;
   Scanner entrada = new Scanner(System.in);
   int numTransaccion = 1;
    public Cajero(Banco banco) {
        this.banco = banco;
    }

    public void operaciones(TarjetaDebito t) {
        System.out.println("Bienvenido al cajero de " + banco.getNombre() + " :)");
        if (banco.getClientes().containsKey(t.getCuenta())) {
            System.out.println("Introduce el nip de tu tarjeta:");
            final String NIP  = entrada.nextLine();
            if(t.getNip().equals(NIP)) {
                int bandera = 0;
                int seleccion = 0;
                do {
                    do {
                        System.out.println(" Buenas tardes esta en un cajero automatico de BBVA");
                        System.out.println(" Hoy es 31/10/2023");
                        System.out.println(" Porfavor seleccione una opción:");
                        System.out.println("    1. Retiro de efectivo.");
                        System.out.println("    2. Hacer una transferencia");
                        System.out.println("    3. Salir.");
                        seleccion = entrada.nextInt();
                        if (seleccion >= 1 && seleccion <= 3) {
                            bandera = 1;
                        } else {
                            System.out.println("=================================================");
                            System.out.println("Opción no disponible, vuelva a intentar porfavor.");
                            System.out.println("=================================================");
                        }
                    } while (bandera == 0);
                    if (seleccion == 1) {

                    } else if (seleccion == 2) {
                        System.out.println("Introduce el numero de cuenta al que quieres realizar la transaccion:");
                        String cta = entrada.nextLine();
                        if(banco.getClientes().containsKey(cta)){
                            System.out.println("Monto a transferir:");
                            int monto = entrada.nextInt();
                            numTransaccion = numTransaccion +1;
                            transferir(t.getCuenta(),t.getCuenta().getTipo(),banco.getClientes().get(cta),monto);
                        }


                    } else if (seleccion == 3) {
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
        Operaciones op = new Transferencia(origen,tipo,destino,monto);
        op.Transaccion(Integer.toString(numTransaccion),"11/11/2024");
    }
}
