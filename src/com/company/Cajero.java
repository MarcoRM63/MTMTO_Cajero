package com.company;

import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.Scanner;

public class Cajero implements  Transaccionable{
   private Banco banco;
   Scanner entrada = new Scanner(System.in);
   int numTransaccion = 0;
   int tipo;
    public Cajero(Banco banco) {
        this.banco = banco;
    }

    public void operaciones(TarjetaDebito t) {
        if (banco.getClientes().containsKey(t.getCuenta().getNumeroCuenta())) {
            System.out.println("Introduce el nip de tu tarjeta:");
            final String NIP  = entrada.nextLine();
            if(t.getNip().equals(NIP)) {
                do{
                    System.out.println("Tipo de cuenta (1.-Ahorro) o (2.-Cheque )");
                    tipo = entrada.nextInt();
                }while (tipo>2);
                int bandera = 0;
                int seleccion = 0;
                do {
                    do {
                        System.out.println(" Buenas tardes esta en un cajero automatico de " +banco.getNombre());
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
                        String cta = Keyboard.readString();
                        if(banco.getClientes().containsKey(cta)){
                            System.out.println("Monto a transferir:");
                            int monto = entrada.nextInt();
                            transferir(t.getCuenta(),t.getCuenta().getTipo(),banco.getClientes().get(cta),monto);
                        }else{
                            System.out.println("Cuenta no existente");
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
                operaciones(t);
            }
        }else{
            System.out.println("Esta tarjeta no pertenece a este banco, terminando transaccion");

        }

    }

    @Override
    public void retiro(Cuenta c, int tipo, int monto) {
    Operaciones op=new Retiro(c,tipo,monto);
    String respuesta=op.infoTransaccion();
    ticketTransaccion(respuesta);
    }

    @Override
    public void transferir(Cuenta origen, int tipo, Cuenta destino, int monto) {
        Operaciones op = new Transferencia(origen,tipo,destino,monto);
        String respuesta = op.infoTransaccion();
        ticketTransaccion(respuesta);
    }
    public void ticketTransaccion(String infoTransaccion){
        Date myDate = new Date();

//Aquí obtienes el formato que deseas

        System.out.println("====================================");
        System.out.println("================="+banco.getNombre()+"===============");
        System.out.println("=================       Debito  =================");
        System.out.println("Fecha: "+new SimpleDateFormat("dd-MM-yyyy").format(myDate));
        System.out.println();
        System.out.println(infoTransaccion);
        System.out.println("----------------------------------------------------");
        System.out.println();
    }
}
