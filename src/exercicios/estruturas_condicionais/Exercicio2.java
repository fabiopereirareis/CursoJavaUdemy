package exercicios.estruturas_condicionais;

import java.util.Scanner;

public class Exercicio2 {

	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);
		
		int numero = 0;
		numero = sc.nextInt();
		
		if(numero % 2 == 0) {
			System.out.println("Par");
		}else {
			System.out.println("Impar");
		}
		sc.close();
	}

}
