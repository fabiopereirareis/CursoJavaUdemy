package estrutura_repeticao.exercicios;

import java.util.Scanner;

public class ExercicioWhile3 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);

		int opcao = 0;
		int alcool = 0;
		int gasolina = 0;
		int diesel = 0;

		opcao = sc.nextInt();

		while (opcao != 4) {
			switch (opcao) {
			case 1: {
				alcool += 1;
				break;
			}
			case 2: {
				gasolina += 1;
				break;
			}
			case 3: {
				diesel += 1;
				break;
			}
			default:
				System.out.println("Digite um código válido");
			}
			opcao = sc.nextInt();
		}

		System.out.println("Muito Obrigado");
		System.out.println("Alcool: " + alcool);
		System.out.println("Gasolina: " + gasolina);
		System.out.println("Diesel: " + diesel);

		sc.close();
	}

}
