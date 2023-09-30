
import fatec.poo.java.Retangulo;
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
        Retangulo objRetangulo = new Retangulo();
        Scanner sc = new Scanner(System.in);

        System.out.println("Informe a altura: ");
        double altura = sc.nextDouble();
        objRetangulo.setAltura(altura);

        System.out.println("Informe a base: ");
        double base = sc.nextDouble();
        objRetangulo.setBase(base);

        int opcao = 0;

        do {
            System.out.println("\n\n1-Consultar altura do retângulo");
            System.out.println("2-Consultar base do retângulo");
            System.out.println("3-Consultar área do retângulo");
            System.out.println("4-Consultar perímetro do retângulo");
            System.out.println("5-Consultar diagonal do retângulo");
            System.out.println("6-Sair");
            System.out.print("\n\tDigite a opção: ");

            opcao = sc.nextInt();

            if (opcao == 1) {
                System.out.println("A Altura do retangulo e: " + objRetangulo.getAltura());
            } else if (opcao == 2) {
                System.out.println("A base do retangulo e: " + objRetangulo.getBase());
            } else if (opcao == 3) {
                System.out.println("A area do retangulo e: " + objRetangulo.calcArea());
            } else if (opcao == 4) {
                System.out.println("O perimetro do retangulo e: " + objRetangulo.calcPerimetro());
            } else if (opcao == 5) {
                System.out.println("A Diagonal do retangulo e: " + objRetangulo.calcDiagonal());

            } else if (opcao ==6) {
                break;
                
            }else{
                System.out.println("opcao invalida");
            }
        

        } while (opcao >=1 && opcao < 6);

    }

}
