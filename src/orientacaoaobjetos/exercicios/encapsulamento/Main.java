package orientacaoaobjetos.exercicios.encapsulamento;

import java.util.Locale;
import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		Locale.setDefault(Locale.US);
		Scanner sc = new Scanner(System.in);
		
		Conta conta;
		System.out.print("Entre com o número da conta: ");
		int novaConta = sc.nextInt();
		
		System.out.printf("Entre com o nome do titular: ");
		sc.nextLine();
		String nome = sc.nextLine();
		
		System.out.println("Deseja adicionar saldo inicial (s/n)");
		char resposta = sc.next().charAt(0);
		if(resposta == 's') {
			System.out.print("Entre com o valor inicial: ");
			double valorInicial = sc.nextDouble();
			conta = new Conta(novaConta,nome,valorInicial);
		}else {
			conta = new Conta(novaConta,nome);
		}
		
		System.out.println("Dados da conta:");
		System.out.printf(conta.toString());
		System.out.println();
		
		System.out.print("Ente com o valor do depósito: ");
		conta.deposito(sc.nextDouble());
		
		System.out.println("Dados atualizados da conta:");
		System.out.printf(conta.toString());
		System.out.println();
		
		System.out.print("Ente com o valor do saque: ");
		conta.saque(sc.nextDouble());
		
		System.out.println("Dados atualizados da conta:");
		System.out.printf(conta.toString());
		
		
		sc.close();
	}

}
