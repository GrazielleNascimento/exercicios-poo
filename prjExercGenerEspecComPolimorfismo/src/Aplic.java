
import fatec.poo.model.FuncionarioHorista;
import fatec.poo.model.FuncionarioMensalista;
import java.text.DecimalFormat;
import java.util.Scanner;

/**
 *
 * @author grazi
 */
public class Aplic {

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        DecimalFormat df = new DecimalFormat("#,##0.00");

        // INFORMACOES FUNCIONARIO HORISTA
        System.out.println("Informe os dados do Funcionario Horista");

        System.out.print("\nInforme o Registro do Funcionario Horista: ");
        int registro = sc.nextInt();

        System.out.print("Informe o nome: ");
        String nome = sc.next();

        System.out.print("Informe a data de Admissao: ");
        String dtAdmissao = sc.next();

        System.out.print("Informe o valor das horas Trabalhas: ");
        double valHorTrab = sc.nextDouble();
        
        

        //colocar no metodo construtor como parametro os valores de cada variavel
        //int registro, String nome, String dtAdmissao, double valHorTrab
        FuncionarioHorista objFuncionarioHorista = new FuncionarioHorista(registro, nome, dtAdmissao, valHorTrab);

        
        
        System.out.print("Informe o cargo: ");
        objFuncionarioHorista.setCargo(sc.next());

        System.out.print("Informe a quantidade de Horas Trabalhadas: ");
        objFuncionarioHorista.setQtdHorTrab(sc.nextInt());
        
        
        

        //INFORMACOES FUNCIONARIO MENSALISTA
        System.out.println("\nInforme os dados do Funcionario Mensalista");

        System.out.print("\nInforme o Registro do Funcionario Mensalista: ");
        int registro2 = sc.nextInt();

        System.out.print("Informe o nome: ");
        String nome2 = sc.next();

        System.out.print("Informe a data de Admissao: ");
        String dtAdmissao2 = sc.next();

        System.out.print("Informe o valor das horas Trabalhas: ");
        double valHorTrab2 = sc.nextDouble();
        
        

        //colocar no metodo construtor como parametro os valores de cada variavel
        //(int registro, String nome, String dtAdmissao, double valSalMin
        FuncionarioMensalista objFuncionarioMensalista = new FuncionarioMensalista(registro2, nome2, dtAdmissao2, valHorTrab2);
        

        System.out.print("Informe o cargo: ");
        objFuncionarioMensalista.setCargo(sc.next());

        System.out.print("Informe do Salario minimo: ");
        objFuncionarioMensalista.setNumSalMin(sc.nextDouble());
        
        
        
        

        //APRESENTACAO DOS DADOS DOS TIPOS DE FUNCIONARIOS
        //FUNCIONARIO HORISTA 
        System.out.println("\nDADOS DO FUNCIONARIO MENSALISTA");

        System.out.println("\nRegistro do Funcionario Mensalista: "+ objFuncionarioMensalista.getRegistro());

        System.out.println("Nome: " + objFuncionarioMensalista.getNome());

        System.out.println("Data de Admissao: " + objFuncionarioMensalista.getDtAdmissao());

        System.out.println("Cargo          => " + objFuncionarioMensalista.getCargo());
        
        System.out.println("Salario Bruto  => " + df.format(objFuncionarioMensalista.calcSalBruto()));

        System.out.println("DDesconto      => " + df.format(objFuncionarioMensalista.calcDesconto()));

        System.out.println("alario Liquido => " + df.format(objFuncionarioMensalista.calcSalLiquido()));
        
        
        

        //FUNCIONARIO MENSALIDADE
        System.out.println("\nDADOS DO FUNCIONARIO HORISTA");

        System.out.println("\nRegistro do Funcionario Mensalista: " + objFuncionarioHorista.getRegistro());

        System.out.println("Nome: " + objFuncionarioHorista.getNome());

        System.out.println("Data de Admissao: " + objFuncionarioHorista.getDtAdmissao());

        System.out.println("Cargo           => " + objFuncionarioHorista.getCargo());

        System.out.println("Salario Bruto   => " + df.format(objFuncionarioHorista.calcSalBruto()));

        System.out.println("Desconto        => " + df.format(objFuncionarioHorista.calcDesconto()));

        System.out.println("Salario Liquido => " + df.format(objFuncionarioHorista.calcSalLiquido()));

    }

}
