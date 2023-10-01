package fatec.poo.model;

/**
 *
 * @author grazi
 */
public class ContaCorrente {

    private int numero;
    private double saldo;

    public ContaCorrente(int numero, double saldo) {
        this.numero = numero;
        this.saldo = saldo;

    }

    public int getNumero() {
        return numero;
    }

    public double getSaldo() {
        return saldo;
    }

    public void sacar(double valor) {
        saldo = saldo - valor;
    }

    public void depositar(double valor) {
        saldo = saldo + valor;

    }

}
