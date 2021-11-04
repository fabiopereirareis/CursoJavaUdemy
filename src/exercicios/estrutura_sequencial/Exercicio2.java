package exercicios.estrutura_sequencial;

import java.util.Locale;
import java.util.Scanner;

public class Exercicio2 {

	public static void main(String[] args) {
		
		Locale.setDefault(Locale.US);
		Scanner sc = new Scanner(System.in);
		
		double raio, resultado;
		final double PI = 3.14159; 
		
		raio = sc.nextDouble();
		
		resultado = PI*(Math.pow(raio, 2));
		
		System.out.printf("A=%.4f",resultado);
		
		sc.close();
	}

}
