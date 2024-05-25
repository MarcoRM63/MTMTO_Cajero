package com.company;

public interface Movimientos {

    void retiro(Cuenta c,int tipo, int monto);
    void transferir(Cuenta origen, int tipo, Cuenta destino, int monto);
}
