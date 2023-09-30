
import fatec.poo.model.Circulo;
import java.util.Scanner;

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
/**
 *
 * @author grazi
 */
public class Aplic {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        Circulo objCirculo = new Circulo();
        int opcao;

        System.out.println("Informe o valor do raio: ");
        objCirculo.setRaio(sc.nextDouble());

        do {
            System.out.println("-----------Menu Circulo------------------");
            System.out.println("1-Para consultar o raio do circulo");
            System.out.println("2-Para consultar a area do circulo");
            System.out.println("3-Para consultar o Perimetro do circulo");
            System.out.println("4-Para consultar o Diametro do circulo");
            System.out.println("5-Para sair");
            System.out.println("Informe a Opcao desejada: ");
            opcao = sc.nextInt();

            if (opcao == 1) {
                System.out.println("O raio e: " + objCirculo.getRaio());

            } else if (opcao == 2) {
                System.out.println("A area e: " + objCirculo.calcArea());

            } else if (opcao == 3) {
                System.out.println("O perimetro e: " + objCirculo.calcPerimetro());
            } else if (opcao == 4) {
                System.out.println("O diametro e: " + objCirculo.calcDiametro());
            } else if (opcao < 1 || opcao > 5 ){
                System.out.println("opcao invalida");

            }

        } while (opcao != 5);
        
    }

}
