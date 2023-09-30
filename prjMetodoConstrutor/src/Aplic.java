
import fatec.poo.model.Retangulo;
import java.util.Scanner;

/**
 *
 * @author grazi
 */
public class Aplic {

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        System.out.print("Digite o valor da unidade de medida: ");
        String unidadeMed = sc.next();

        Retangulo objRetangulo = new Retangulo(unidadeMed);

        int opcao = 0;

        System.out.print("Digite a altura: ");
        objRetangulo.setAltura(sc.nextDouble());

        System.out.print("Digite a base: ");
        objRetangulo.setBase(sc.nextDouble());

        do {
            System.out.println("\n1- ALTURA");
            System.out.println("2- BASE");
            System.out.println("3- UNIDADE MEDIDA");
            System.out.println("4- AREA");
            System.out.println("5- PERIMETRO");
            System.out.println("6- DIAGONAL");
            System.out.println("7- SAIR");
            System.out.print("\n\tESCOLHA UMA OPCAO: \n");
            opcao = sc.nextInt();

            if (opcao == 1) {
                System.out.println("Altura : " + objRetangulo.getAltura());
            } else if (opcao == 2) {
                System.out.println("Base : " + objRetangulo.getBase());

            } else if (opcao == 3) {
                System.out.println("Unidade medida: " + objRetangulo.getUnidadeMedida());
            } else if (opcao == 4) {
                System.out.println("area: " + objRetangulo.calcArea());
            } else if (opcao == 5) {
                System.out.println("Perimetro: " + objRetangulo.calcPerimetro());
            } else if (opcao == 6) {
                System.out.println("Diagonal: " + objRetangulo.calcDiagonal());
            } else if(opcao < 1 || opcao > 7){
                System.out.println("OPCAO INCORRETA");
            }

        } while (opcao != 7);

    }

}
