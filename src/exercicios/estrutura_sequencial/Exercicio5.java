package exercicios.estrutura_sequencial;

import java.util.Locale;
import java.util.Scanner;

public class Exercicio5 {
	public static void main(String[] args) {

		Locale.setDefault(Locale.US);
		Scanner sc = new Scanner(System.in);
		
		int codPeca, qtdPeca;
		double valorUnitario = 0.0;
		double calculo1 = 0.0;
		double calculo2 = 0.0;
		
		codPeca = sc.nextInt();
		qtdPeca = sc.nextInt();
		valorUnitario = sc.nextDouble();
		
		calculo1 = qtdPeca * valorUnitario;
		
		codPeca = sc.nextInt();
		qtdPeca = sc.nextInt();
		valorUnitario = sc.nextDouble();
		
		calculo2 = qtdPeca * valorUnitario;

		System.out.printf("Valor a pagar: R$ %.2f",(calculo1+calculo2));
		
		sc.close();
		
	}

}
