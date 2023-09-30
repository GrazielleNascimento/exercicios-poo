
package fatec.poo.model;

/**
 *
 * @author grazi
 */
public class Circulo {
    
    private double raio;
    
    public void setRaio (double r){
        raio = r;
    }
    public double getRaio(){
        return raio;
    }
    public double calcArea(){
     return (3.1416 * Math.pow(raio, 2));
    }
    public double calcPerimetro(){
        double perimetro = (2 * 3.14 * raio);
        return perimetro;
    }
    public double calcDiametro(){
        double diametro = ( 2 * raio);
        return diametro;
    }
}
