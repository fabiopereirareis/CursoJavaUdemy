package estrutura_repeticao.exercicios;

import java.util.Scanner;

public class ExercicioFor1 {

	public static void main(String[] args) {
		// esse exercício eu consultei o material para fazer, fiquei com dúvida no enunciado
		Scanner sc = new Scanner(System.in);
			
		int x;
		x = sc.nextInt();
		
		for (int i =1; i <= x; i++) {
			if(i % 2 != 0) {
				System.out.println(i);
			}
		}

		sc.close();
	}

}
