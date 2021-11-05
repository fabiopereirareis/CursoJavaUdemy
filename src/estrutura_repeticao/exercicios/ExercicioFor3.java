package estrutura_repeticao.exercicios;

import java.util.Locale;
import java.util.Scanner;

public class ExercicioFor3 {

	public static void main(String[] args) {
		Locale.setDefault(Locale.US);
		Scanner sc = new Scanner(System.in);

		int casos;
		casos = sc.nextInt();
		
		double a = 0.0;
		double b = 0.0;
		double c = 0.0;
		double mediaP = 0.0;

		for (int i = 0; i < casos; i++) {
			a = sc.nextDouble();
			b = sc.nextDouble();
			c = sc.nextDouble();
			mediaP = ((a*2)+(b*3)+(c*5))/(2+3+5);
			System.out.printf("%.1f %n",mediaP);
		}
		sc.close();
	}

}
