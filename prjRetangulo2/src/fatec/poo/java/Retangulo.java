
package fatec.poo.java;

/**
 *
 * @author grazi
 */
public class Retangulo {
    
    private double altura;
    private double base;
    
    public void setAltura(double a){
        
        altura = a;
    }
    
    public void setBase(double b){
        base = b;
    }
    
    public double getAltura(){
        return altura;
    }
    public double getBase(){
        return base;
    }
    
    public double calcArea(){
      double area = base * altura;
      return area;     
    }
    
    public double calcPerimetro(){
        double perimetro = 2 * (base + altura);
        return perimetro;
    }
    
    public double calcDiagonal(){
        return(Math.sqrt(Math.pow(base, 2) + Math.pow(altura, 2)));
        
    }
    
    
    
}
