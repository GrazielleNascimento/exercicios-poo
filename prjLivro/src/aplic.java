
import fatec.poo.model.Livro;
import java.util.Scanner;

/**
 *
 * @author grazi
 */
public class aplic {

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        System.out.print("Informe a identificacao: ");
        int identificacao = sc.nextInt();

        Livro objLivro = new Livro(identificacao);
        
        System.out.print("Informe o valor da multa: ");
        objLivro.setValMultaDiaria(sc.nextDouble());

        int opcao;

        do {
            System.out.println("1- Consultar livro");
            System.out.println("2- Emprestar livro");
            System.out.println("3- Devolver livro ");
            System.out.println("4- Sair");
            System.out.print("\t\nEscolha uma opcao: ");
            opcao = sc.nextInt();

            if (opcao == 1) {
                if (objLivro.getSituacao() == true) {

                    System.out.println("Livro Emprestado");
                } else {
                    System.out.println("Livro Disponivel");
                }
            } else if (opcao == 2) {
                if (objLivro.getSituacao() == true) {

                    System.out.println("Livro ja esta emprestado");

                } else {
                    objLivro.emprestar();

                }
            } else if (opcao == 3) {
                    if(objLivro.getSituacao() == false){
                        System.out.println("O Livro ja esta disponivel");
                    } else {
                        System.out.println("Informe a qtd de Atraso: ");
                        int qtdDiasAtraso = sc.nextInt();
                        
                        
                        double valMulta =  objLivro.devolver(qtdDiasAtraso);;
                        
                        if(valMulta > 0){
                            System.out.println("O valor a ser pago pela entrega em atraso: R$" + valMulta);
                        }
                    }
                    
            }

        } while (opcao != 4);

    }

}
