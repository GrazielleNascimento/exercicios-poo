
import fatec.poo.model.ContaCorrente;
import java.text.DecimalFormat;
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

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        DecimalFormat df = new DecimalFormat("#,##00.0");

        int opcao = 0;
        int numero;
        double valor;
        double saldo;

        do {
            System.out.print("\nInforme o numero da sua conta: ");
            numero = sc.nextInt();
            if (numero < 0) {
                System.out.println("\nInforme o numero correto da sua conta!");
            }
        } while (numero < 0);

        do {
            System.out.print("\nInforme o Saldo inicial: ");
            saldo = sc.nextDouble();
            if (saldo < 1) {
                System.out.println("Informe um valor inicial valido");
            }

        } while (saldo <= 0);

        ContaCorrente objContaCorrente = new ContaCorrente(numero, saldo);

        do {

            System.out.println("\n------MENU--------");
            System.out.println("1-Depositar");
            System.out.println("2-Sacar");
            System.out.println("3-Consultar Saldo");
            System.out.println("4-Sair");

            System.out.print("\n\tDigite a opção: ");
            opcao = sc.nextInt();

            if (opcao == 1) {
                System.out.print("\nQual valor deseja Depositar: ");
                valor = sc.nextDouble();
                if (valor < 1) {
                    System.out.println("Deposite um valor valido");
                } else {

                    objContaCorrente.depositar(valor);

                }

            } else if (opcao == 2) {
                System.out.print("\nQual valor deseja sacar: ");
                valor = sc.nextDouble();

                if (valor < 1) {
                    System.out.println("Impossivel sacar um valor negativo");
                } else if (valor > objContaCorrente.getSaldo()) {
                    System.out.println("O Valor acima do saldo disponivel\n" + "O seu saldo atual da conta " +  objContaCorrente.getNumero() + " é de de: R$" + df.format(objContaCorrente.getSaldo()));
                } else {
                    objContaCorrente.sacar(valor);
                }

            } else if (opcao == 3) {
                System.out.print("\nO Saldo da sua conta e de: R$" + df.format(objContaCorrente.getSaldo()));

            } else if (opcao < 1 || opcao > 4) {
                System.out.print("\nOpcao invalida\n");
            }

        } while (opcao != 4);
    }

}
