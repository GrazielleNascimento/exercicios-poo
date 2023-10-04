
import fatec.poo.model.PessoaFisica;
import fatec.poo.model.PessoaJuridica;
import java.text.DecimalFormat;
import java.time.LocalDate;
import java.util.Scanner;

public class Aplic {

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        DecimalFormat df = new DecimalFormat("#,##0.00");

        System.out.print("Informe o nome: ");
        String nome = sc.next();

        System.out.print("Informe o CPF: ");
        String cpf = sc.next();

        System.out.print("Informe o ano da inscricao: ");
        int anoInscricao = sc.nextInt();

        //String Nome, String CPF, int AnoInscricao
        PessoaFisica objPessoaFisica = new PessoaFisica(nome, cpf, anoInscricao);

        System.out.print("Informe a base: ");
        objPessoaFisica.setBase(sc.nextDouble());

        System.out.print("Adicione o valor da compra 1: ");
        objPessoaFisica.addCompras(sc.nextDouble());

        System.out.print("Adicione o valor da compra 2: ");
        objPessoaFisica.addCompras(sc.nextDouble());

        System.out.print("Adicione o valor da compra 3: ");
        objPessoaFisica.addCompras(sc.nextDouble());

        System.out.println("------------------------------------");

        System.out.print("Informe o nome Pessoa Juridica: ");
        nome = sc.next();

        System.out.print("Informe o CGC  Pessoa Juridica: ");
        String cgc = sc.next();

        System.out.print("Informe o ano da inscricao  Pessoa Juridica: ");
        anoInscricao = sc.nextInt();

        //String Nome, String CGC, int AnoInscricao
        PessoaJuridica objPessoaJuridica = new PessoaJuridica(nome, cgc, anoInscricao);

        System.out.print("Informe a Taxa Incentivo: ");
        objPessoaJuridica.setTaxaIncentivo(sc.nextDouble());
        
        System.out.print("Adicione o valor da compra 1: ");
        objPessoaJuridica.addCompras(sc.nextDouble());

        System.out.print("Adicione o valor da compra 2: ");
        objPessoaJuridica.addCompras(sc.nextDouble());

        System.out.print("Adicione o valor da compra 3: ");
        objPessoaJuridica.addCompras(sc.nextDouble());

        System.out.println("------------------------------------");

        System.out.println("\nInformacoes Pessoa Fisica");
        System.out.println("Nome: " + objPessoaFisica.getNome());
        System.out.println("CPF: " + objPessoaFisica.getCPF());
        System.out.println("Ano inscricao: " + objPessoaFisica.getAnoInscricao());
        System.out.println("Base: " + objPessoaFisica.getBase());
        System.out.println("Bonus: " + objPessoaFisica.calcBonus(LocalDate.now().getYear()));
        System.out.println("Total das compras: " + objPessoaFisica.getTotalCompras());
        
        
        System.out.println("\nInformacoes Pessoa Juridica");
        System.out.println("Nome: " + objPessoaJuridica.getNome());
        System.out.println("CGC: " + objPessoaJuridica.getCGC());
        System.out.println("Ano inscricao: " + objPessoaJuridica.getAnoInscricao());
        System.out.println("Taxa Incentivo: " + objPessoaJuridica.getTaxaIncentivo());
        System.out.println("Bonus: " + objPessoaJuridica.calcBonus(LocalDate.now().getYear()));
        System.out.println("Total de compras: " + objPessoaJuridica.getTotalCompras());
    }
}
