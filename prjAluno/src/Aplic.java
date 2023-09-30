
import fatec.poo.model.Aluno;
import java.util.Scanner;

/**
 *
 * @author grazi
 */
public class Aplic {

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        Aluno objAluno = new Aluno();
        int opcao = 0;

        System.out.print("Digite o seu RA: ");
        objAluno.setRA(sc.nextInt());

        System.out.print("Digite a nota da P1: ");
        objAluno.setNtPrv1(sc.nextDouble());

        System.out.print("Digite a nota da P2: ");
        objAluno.setNtPrv2(sc.nextDouble());

        System.out.print("Digite a nota do Trab1: ");
        objAluno.setNtTrab1(sc.nextDouble());

        System.out.print("Digite a nota do Trab2: ");
        objAluno.setNtTrab2(sc.nextDouble());

        do {

            System.out.println("\n--------------MENU----------------\n");
            System.out.println("1-Exibir Nota das Provas/Trabalhos");
            System.out.println("2-Exibir Média dos Trabalhos/Provas");
            System.out.println("3-Exibir Média Final");
            System.out.println("4-Sair");
            System.out.print("\tDigite a opcao: ");
            opcao = sc.nextInt();

            if (opcao == 1) {

                System.out.println("Nota P1: " + objAluno.getNtPrv1());
                System.out.println("Nota P2: " + objAluno.getNtPrv2());
                System.out.println("Nota Trab1: " + objAluno.getNtTrab1());
                System.out.println("Nota Trab2: " + objAluno.getNtTrab2());
            } else if (opcao == 2) {
                System.out.println("Media das provas: " + objAluno.calcMediaProva());
                System.out.println("Media dos Trabalhos: " + objAluno.calcMediaTrab());
            } else if (opcao == 3) {
                System.out.println("Aluno do RA  " + objAluno.getRA());
                System.out.println("Media Final: " + objAluno.calcMediaFinal());
                System.out.println("Situacao: " + (objAluno.calcMediaFinal() >= 6 ? "ALUNO APROVADO" :"REPROVADO"  )); //if ternario
               /* if (objAluno.calcMediaFinal() >= 6) {
                    System.out.println("\nALUNO APROVADO");
                } else {
                    System.out.println("\nREPROVADO");
                }*/
            }
            else if (opcao < 1 || opcao > 4){
                System.out.println("\nOPCAO INVALIDA");
            }
                

        } while (opcao != 4);

    }

}
