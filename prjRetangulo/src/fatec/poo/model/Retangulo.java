package fatec.poo.model;

/**
 *
 * @author grazi
 */
public class Retangulo {

    private double altura;
    private double base;

    //metodo publico que nao retorna nada void, nome setAltura assinatura( oq o metodo vai receber), ele vai receber uma altura do tipo double
    //+ setAltura(double) : void
    public void setAltura(double a) { // pega o valor da assinatura ex: a, e seta no atributo por ex: altura

        altura = a;
        // o valor da altura, e recebido no metodo   
    }
    //+setBase(double): void

    public void setBase(double b) {
        base = b;
    }
    //+calcArea() : double

    public double calcArea() { //quando n tem void, tem q ter return no metodo
        double area = base * altura;
        return area;
    }
    //+calcPerimetro(): double
    
    public double calcPerimetro() {
        double perimetro = 2 * (base + altura);
        return perimetro;
    }

}
