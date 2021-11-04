package exercicios.estrutura_sequencial;

import java.util.Locale;
import java.util.Scanner;

public class Exercicio6 {
	public static void main(String[] args) {

		Locale.setDefault(Locale.US);
		Scanner sc = new Scanner(System.in);
		
		double a = 0.0;
		double b = 0.0;
		double c = 0.0;
		
		final double PI = 3.14159;
		
		a = sc.nextDouble();
		b = sc.nextDouble();
		c = sc.nextDouble();
		
		// área triângulo retângulo = base * altura / 2
		double triangulo = (a * c) / 2;
		
		// área círculo = π * r²
		double circulo = PI * Math.pow(c,2);
		
		// área do trapézio = base maior + base menor * altura / 2
		double trapezio = ((a + b) * c) /2; 
		
		// área do quadrado base * altura
		double quadrado = b*b;
		
		// área do retângulo 
		double retangulo = a * b;
		
		System.out.printf("Triangulo: %.3f %n",triangulo);
		System.out.printf("Circuloo: %.3f %n",circulo);
		System.out.printf("Trapézio: %.3f %n",trapezio);
		System.out.printf("Quadrado: %.3f %n",quadrado);
		System.out.printf("Retangulo: %.3f %n",retangulo);

		sc.close();
		
	}

}
