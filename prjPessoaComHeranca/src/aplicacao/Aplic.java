
package aplicacao;

import fatec.poo.model.Miseravel;
import fatec.poo.model.Pobre;
import fatec.poo.model.Rica;
import java.text.DecimalFormat;

/**
 *
 * @author grazi
 */
public class Aplic {

  
    public static void main(String[] args) {
        
        DecimalFormat df = new DecimalFormat();

        Rica objRica = new Rica("Laila II", 27, 438900000000.00);
        Pobre objPobre = new Pobre("João Silva", 39);
        Miseravel objMiserave1 = new Miseravel("Givaldo Alves", 48);
        
        System.out.println("**PESSOA RICA**");
        System.out.println(objRica.toString());
        objRica.fazCompras();
        System.out.println("");
        
        System.out.println("**PESSOA POBRE**");
        System.out.println(objPobre.toString());
        objPobre.trabalha();
        System.out.println("");
        
        System.out.println("**PESSOA RICA**");
        System.out.println(objMiserave1.toString());
       objMiserave1.mendiga();
        System.out.println("");
       
       
    }
    
}
