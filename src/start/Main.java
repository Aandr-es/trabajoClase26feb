package start;

import Banco.Cuenta;

public class Main {
    public static void main(String[] args) {
        Cuenta cuenta1 = new Cuenta(1,"Carlos", "1609", 0);

        System.out.println("Cuenta creada");
        System.out.println(cuenta1);

        cuenta1.abonar(115);
        System.out.println("Se abonaron 115");

        cuenta1.retirar(75);
        System.out.println("Se retiraron 75");

        System.out.println("Saldo actual:");
        System.out.println(cuenta1.getSaldo());



    }

}
