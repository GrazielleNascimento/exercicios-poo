
import fatec.poo.model.Cliente;
import fatec.poo.model.Instrutor;
import java.util.Scanner;

/**
 *
 * @author grazi
 */
public class Aplic {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        //INSTRUTOR
        // int identificacao, String nome, String telefone
        System.out.println("INFORMACOES DO INSTRUTOR\n");

        System.out.print("Informe a identificacao: ");
        int identificacao = sc.nextInt();

        System.out.print("Informe o nome: ");
        String nome = sc.next();

        System.out.print("Informe o telefone: ");
        String telefone = sc.next();

        Instrutor objInstrutor = new Instrutor(identificacao, nome, telefone);

        System.out.print("Informe o email: ");
        objInstrutor.setEmail(sc.next());

        System.out.print("Informe a area de atuacao: ");
        objInstrutor.setAreaAtuacao(sc.next());

        // CLIENTE
        //String cpf, String nome, String telefone
        System.out.println("\nINFORMACOES DO CLIENTE\n");

        System.out.print("Informe o CPF: ");
        String cpf = sc.next();

        System.out.print("Informe o nome: ");
        String nome2 = sc.next();

        System.out.print("Informe o telefone: ");
        String telefone2 = sc.next();

        Cliente objCliente = new Cliente(cpf, nome2, telefone2);

        System.out.print("Informe o Peso: ");
        objCliente.setPeso(sc.nextDouble());

        System.out.print("Informe a altura: ");
        objCliente.setAltura(sc.nextDouble());
        
        
        

        System.out.println("\nCONSULTA DE INFORMACOES DO INSTRUTOR\n");              

        System.out.println("Identificacao: " + objInstrutor.getIdentificacao());   
        
        System.out.println("Nome: " + objInstrutor.getNome());
        
        System.out.println("Telefone: " + objInstrutor.getTelefone());
        
        System.out.println("Email: " + objInstrutor.getEmail());
        
        System.out.println("Area atuacao: " + objInstrutor.getAreaAtuacao());

        
        
        
        
        System.out.println("\n CONSULTA INFORMACOES DO CLIENTE\n");

        System.out.println("CPF: " + objCliente.getCpf());

        System.out.println("nome: " + objCliente.getNome());

        System.out.println("telefone: " + objCliente.getTelefone());

        System.out.println("Peso: " + objCliente.getPeso());

        System.out.println("altura: " + objCliente.getAltura());

    }

}
