package estrutura_repeticao.exercicios;

import java.util.Scanner;

public class ExercicioWhile2 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
			
		int x,y;
		x = sc.nextInt();
		y = sc.nextInt();
		
		while(x != 0 || y != 0) {
			if(x > 0 && y > 0) {
				System.out.println("primeiro");
			}
			if(x > 0 && y < 0) {
				System.out.println("quarta");
			}
			if(x < 0 && y < 0) {
				System.out.println("terceira");
			}
			if(x < 0 && y > 0) {
				System.out.println("segundo");
			}
			x = sc.nextInt();
			y = sc.nextInt();
		}
		
		System.out.println("");

		sc.close();
	}

}
