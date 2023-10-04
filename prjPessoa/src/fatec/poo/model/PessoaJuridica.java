package fatec.poo.model;

public class PessoaJuridica extends Pessoa {

    private String CGC;
    private double TaxaIncentivo;

    public PessoaJuridica(String Nome, String CGC, int AnoInscricao) {
        super(Nome, AnoInscricao);
        this.CGC = CGC;

    }

    @Override
    public double calcBonus(int AnoAtual) {
        return (TaxaIncentivo / 100 * getTotalCompras()) * (AnoAtual - getAnoInscricao());

    }

    public void setTaxaIncentivo(double TaxaIncentivo) {
        this.TaxaIncentivo = TaxaIncentivo;

    }

    public String getCGC() {
        return CGC;

    }

    public double getTaxaIncentivo() {
        return TaxaIncentivo;

    }
}
