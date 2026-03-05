package Banco;

public class Cuenta {
    private int id_cuenta;
    private String titular;
    private String num_cuenta;
    private double saldo;

    public Cuenta(int id, String titular, String num_cuenta, double saldo){
        this.id_cuenta = id;
        this.titular = titular;
        this.num_cuenta = num_cuenta;
        this.saldo = saldo;
    }
    public double getSaldo(){
        return saldo;
    }
    public void abonar(double cantidad){saldo = saldo + cantidad;
    }

    public void retirar(double cantidad){if (cantidad <= saldo){
            saldo = saldo - cantidad;
        } else {
            System.out.println("Saldo insuficiente");
        }
    }
    @Override
    public String toString() { return this.id_cuenta + " " + titular + " " + num_cuenta + " " + saldo;}
}

