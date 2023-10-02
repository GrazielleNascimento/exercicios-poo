package fatec.poo.model;

/**
 *
 * @author grazi
 */
public class Rica extends Pessoa {

    private double dinheiro;

    public Rica() {
    }

    public Rica(String nome, int idade, double dinheiro) {
        super(nome, idade);
        this.dinheiro = dinheiro;

    }

    public void fazCompras() {
        System.out.println("A pessoa rica faz compras");
    }

    public double getDinheiro() {
        return dinheiro;
    }

    public void setDinheiro(double dinheiro) {
        this.dinheiro = dinheiro;
    }

    @Override
    public String toString() {
        return "Nome: " + this.getNome() + "\n" + "Idade: " + this.getIdade()
                + "\n" + "Fortuna: R$ " + this.getDinheiro();
    }
}
