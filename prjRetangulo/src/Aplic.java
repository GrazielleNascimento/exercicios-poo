
import fatec.poo.model.Retangulo;
import java.util.Scanner;

/**
 *
 * @author grazi
 */
public class Aplic {

    public static void main(String[] args) {

        Retangulo objRetangulo = new Retangulo();
        Scanner sc = new Scanner(System.in);

        System.out.println("Digite a altura: ");
        double altura = sc.nextDouble();
        objRetangulo.setAltura(altura);

        System.out.println("Digite a base: ");
        double base = sc.nextDouble();
        objRetangulo.setBase(base);

        double area = objRetangulo.calcArea();

        double perimetro = objRetangulo.calcPerimetro();

        System.out.println("A Area e:  " + area);

        System.out.println("O perimetro e: " + perimetro);
        

        Retangulo objRetangulo2 = new Retangulo();
        
        System.out.println("digite a altura 2: ");
        objRetangulo2.setAltura(sc.nextDouble());
        
        System.out.println("digite a base 2: ");
        objRetangulo2.setBase(sc.nextDouble());
        
        System.out.println("A Area e:  " + objRetangulo2.calcArea() );

        System.out.println("O perimetro e: " + objRetangulo2.calcPerimetro() );
        
        

    }

}
