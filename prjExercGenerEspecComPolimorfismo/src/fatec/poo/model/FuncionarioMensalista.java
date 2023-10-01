package fatec.poo.model;

/**
 *
 * @author grazi
 */
public class FuncionarioMensalista extends Funcionario {

    private double valSalMin;
    private double numSalMin;

    //int registro, String nome, String
    public FuncionarioMensalista(int registro, String nome, String dtAdmissao, double valSalMin) {
        super(registro, nome, dtAdmissao);
        this.valSalMin = valSalMin;

    }

    public void setNumSalMin(double numSalMin) {
        this.numSalMin = numSalMin;
    }
    
    
    @Override
    //Aplicação do polimorfismo
    public double calcSalBruto() {
        return (valSalMin * numSalMin);

    }

}
