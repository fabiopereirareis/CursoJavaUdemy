package orientacaoaobjetos.exercicios;

import java.util.Locale;
import java.util.Scanner;

public class Exercicio1 {

	public static void main(String[] args) {
		Locale.setDefault(Locale.US);
		Scanner sc = new Scanner(System.in);
		Retangle retangle = new Retangle();
		
		System.out.println("Enter rectangle width and height:");
		retangle.setHeight(sc.nextDouble());
		retangle.setWidth(sc.nextDouble());
		
		System.out.printf("Area = %.2f %n",retangle.area());
		System.out.printf("Perimetro = %.2f %n",retangle.perimetro());
		System.out.printf("Diagonal = %.2f %n",retangle.diagonal());
		
		sc.close();
	}

}
