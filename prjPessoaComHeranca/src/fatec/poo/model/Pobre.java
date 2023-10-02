
package fatec.poo.model;

/**
 *
 * @author grazi
 */
public class Pobre extends Pessoa {
    
    public Pobre(String nome, int idade){
        super(nome, idade);
        
    }
    
    public void trabalha(){
        System.out.println("A pessoa pobre trabalha!");
    }
    
     @Override
    public String toString() {
        return "Nome: " + this.getNome() + "\n" + "Idade: " + this.getIdade();
    }
    
            
            
    
}
