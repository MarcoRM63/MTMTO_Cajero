package com.company;

public interface Transaccionable {

    void retiro(Cuenta c,int tipo, int monto);
    void transferir(Cuenta origen, int tipo, Cuenta destino, int monto);
}
