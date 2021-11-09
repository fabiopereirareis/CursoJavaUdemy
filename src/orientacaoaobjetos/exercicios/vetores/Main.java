package orientacaoaobjetos.exercicios.vetores;

import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);

		Quartos[] quartos = new Quartos[10];

		System.out.print("Quantos quartos serão alugados ?");
		int numeroQuartos = sc.nextInt();
//		sc.nextLine();

		for (int i = 0; i < numeroQuartos; i++) {
			System.out.printf("Cliente #%d: %n", i+1);

			sc.nextLine();
			System.out.print("Nome: ");
			
			String nome = sc.nextLine();
			System.out.print("E-mail: ");
			
			String email = sc.nextLine();
			System.out.print("Quarto: ");
			
			int numero = sc.nextInt();
			
			quartos[numero] = new Quartos(nome, email, numero);
		}

		System.out.println("Quartos alugados:");
		for (int i = 0; i < quartos.length; i++) {
			if (quartos[i] != null) {
				System.out.println(quartos[i].toString());
			}
		}
		sc.close();
	}

}
