package fatec.poo.model;

/**
 *
 * @author grazi
 */
public class Miseravel extends Pessoa {

    public Miseravel(String nome, int idade) {
        super(nome, idade);
    }

    public void mendiga() {
        System.out.println("A pessoa miserável mendiga!");
    }

    @Override
    public String toString() {
        return "Nome: " + this.getNome() + "\n" + "Idade: " + this.getIdade();
    }

}
