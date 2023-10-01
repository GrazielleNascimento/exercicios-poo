
import fatec.poo.model.Aluno;
import fatec.poo.model.Professor;
import java.util.Scanner;

/**
 *
 * @author grazi
 */
public class Aplic {

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        System.out.println("Informações do Aluno\n");
        //Passando as informaçoes do Aluno
        //Dados do Aluno
        //regEscolar, String nome, String dataNascimento
        System.out.print("Informe registro escolar do aluno: ");
        int regEscolar = sc.nextInt();

        System.out.print("Informe o nome do aluno: ");
        String nomeAluno = sc.next();

        System.out.print("Informe a data de nascimento do aluno: ");
        String dataNasAluno = sc.next();

        //instanciacao do obj Aluno
        Aluno objAluno = new Aluno(regEscolar, nomeAluno, dataNasAluno);

        System.out.print("Informe o valor da mensalidade: ");
        objAluno.setMensalidade(sc.nextDouble());

        //Passando as informaçoes do Pr  //Passando as informaçoes do Alunoofessor
        //Dados do professor
        //int regFuncional, String nome, String dataNascimento
        System.out.println("\nInformações do Professor\n");

        System.out.print("Informe registro funcional do professor: ");
        int regFuncional = sc.nextInt();

        System.out.print("Informe o nome do professor: ");
        String nomeProfessor = sc.next();

        System.out.print("Informe a data de nascimento do professor: ");
        String dataNasProfessor = sc.next();

        //instanciacao do obj Professor
        Professor objprofessor = new Professor(regFuncional, nomeAluno, dataNasProfessor);

        System.out.print("Informe o salario do professor: ");
        objprofessor.setSalario(sc.nextDouble());

        //Painel para mostrar os resultados
        int opcaoMenuPrincipal;
        int opcaoMenuAluno;
        int opcaoMenuProfessor;
        

        do {
            System.out.println("\n-------MENU PRINCIPAL---------");
            System.out.println("1- Aluno");
            System.out.println("2- Professor");
            System.out.println("3- Sair");
            System.out.print("\tEscolha uma opcao: ");
            opcaoMenuPrincipal = sc.nextInt();

            if (opcaoMenuPrincipal == 1) {

                do {
                    System.out.println("\n------MENU ALUNO " + objAluno.getNome() + "-------");
                    System.out.println("1- Registro Aluno");
                    System.out.println("2- Data Nascimento do Aluno");
                    System.out.println("3- Mensalidade do Aluno");
                    System.out.println("4- Voltar para o menu Principal\n");
                    System.out.print("Escolha uma opcao:  ");
                    opcaoMenuAluno = sc.nextInt();

                    if (opcaoMenuAluno == 1) {

                        System.out.println("\nRegistro Aluno: " + objAluno.getRegEscolar());

                    } else if (opcaoMenuAluno == 2) {

                        System.out.println("\nData Nascimento do Aluno: " + objAluno.getDataNascimento());

                    } else if (opcaoMenuAluno == 3) {

                        System.out.println("\nMensalidade do Aluno: " + objAluno.getMensalidade());

                    }

                } while (opcaoMenuAluno != 4);

            } else if (opcaoMenuPrincipal == 2) {

                System.out.println(objprofessor.getNome());

                do {
                    System.out.println("\n-------MENU PROFESSOR-------");
                    System.out.println("1- Registro Professor");
                    System.out.println("2- Data Nascimento do Professor");
                    System.out.println("3- Salario do Professor");
                    System.out.println("4- Voltar para o menu Principal\n");
                    System.out.print("\tEscolha opcao: ");
                    opcaoMenuProfessor = sc.nextInt();

                    if (opcaoMenuProfessor == 1) {

                        System.out.println("\nRegistro Professor: " + objprofessor.getRegFuncional());

                    } else if (opcaoMenuProfessor == 2) {
                        System.out.println("\nData Nascimento do Professor: " + objprofessor.getDataNascimento());
                    } else if (opcaoMenuProfessor == 3) {
                        System.out.println("\nSalario do Professor: " + objprofessor.getSalario());

                    }

                } while (opcaoMenuProfessor != 4);

            }

        } while (opcaoMenuPrincipal != 3);

    }

}
