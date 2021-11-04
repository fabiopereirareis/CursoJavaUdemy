package exercicios.estrutura_sequencial;

import java.util.Scanner;

public class Exercicio1 {

	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);
		
		int numero1, numero2, resultado ;
		numero1 = sc.nextInt();
		numero2 = sc.nextInt();
		resultado = numero1 + numero2 ;
		
		System.out.println("SOMA = " + resultado);
		
		sc.close();
	}

}
