package estrutura_repeticao.exercicios;

import java.util.Scanner;

public class ExercicioWhile1 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
			
		int x;
		x = sc.nextInt();
		
		while(x != 2002) {
			System.out.println("Senha inv�lida");
			x = sc.nextInt();
		}
		
		System.out.println("Acesso Permitido");

		sc.close();
	}

}
