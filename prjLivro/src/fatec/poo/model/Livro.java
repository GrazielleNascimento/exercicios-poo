
package fatec.poo.model;

/**
 *
 * @author grazi
 */
public class Livro {
    
    private int identificacao;
    private boolean situacao;
    private double valMultaDiaria;
    
    public Livro(int identificacao){
        this.identificacao = identificacao;
    }
    
    public void setValMultaDiaria(double valMultaDiaria){
        this.valMultaDiaria = valMultaDiaria;
    }
    
    public boolean getSituacao(){
        return situacao;
    }
    
    public void emprestar(){ //livro emprestado
        
        situacao = true;
    }
    
    public double devolver(int qtdDiasAtraso ){ // livro devolvido/ disponivel
        
        situacao = false;
        return qtdDiasAtraso * valMultaDiaria;
    }
         
}
