package fatec.poo.model;

//baby
public class PessoaFisica extends Pessoa {

    private String CPF;
    private double Base;

    public PessoaFisica(String Nome, String CPF, int AnoInscricao) {
        super(Nome, AnoInscricao);
        this.CPF = CPF;

    }

    @Override
    public double calcBonus(int anoAtual) {
        if (getTotalCompras() > 12000) {
            return (anoAtual - getAnoInscricao()) * Base;
        } else {
            return 0;
        }   

    }

    public String getCPF() {
        return CPF;
    }

    public void setBase(double Base) {
        this.Base = Base;
    }

    public double getBase() {
        return Base;

    }
}
