package exercicios.estrutura_sequencial;

import java.util.Locale;
import java.util.Scanner;

public class Exercicio4 {
	public static void main(String[] args) {

		Locale.setDefault(Locale.US);
		Scanner sc = new Scanner(System.in);
		
		int numero, horas;
		double valorHora = 0.0;
		double calculo = 0.0;
		
		numero = sc.nextInt();
		horas = sc.nextInt();
		valorHora = sc.nextDouble();
		calculo = horas * valorHora;
		
		System.out.println("Number = " + numero);
		System.out.printf("Salary = U$ %.2f",calculo);
		sc.close();
		
	}

}
