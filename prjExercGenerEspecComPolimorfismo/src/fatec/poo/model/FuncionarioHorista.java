package fatec.poo.model;

/**
 *
 * @author grazi
 */
public class FuncionarioHorista extends Funcionario {

    private double valHorTrab;
    private int qtdeHorTrab;

    //int registro, String nome, String dtAdmissao
    public FuncionarioHorista(int registro, String nome, String dtAdmissao, double valHorTrab) {
        super(registro, nome, dtAdmissao);
        this.valHorTrab = valHorTrab;

    }

    public void setQtdHorTrab(int qtdeHorTrab) {
        this.qtdeHorTrab = qtdeHorTrab;
    }
    
   
    public void setQtdeHorTrab(int qtdeHorTrab) {
        this.qtdeHorTrab = qtdeHorTrab;
    }
    
    //Aplicação do polimorfismo fez o calculo, pois na superclasse nao tinha.
    public double calcSalBruto(){
        return(valHorTrab * qtdeHorTrab);
    }
    
    public double calcGratificacao(){
        return(0.075 * calcSalBruto());
    }
    
    //Aplicação do polimorfismo mudou como e feito o calculo
    public double calcSalLiquido(){
       return(super.calcSalLiquido() + calcGratificacao());  
    }

}
