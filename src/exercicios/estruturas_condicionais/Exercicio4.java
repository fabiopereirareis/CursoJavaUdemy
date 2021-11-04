package exercicios.estruturas_condicionais;

import java.util.Scanner;

public class Exercicio4 {

	public static void main(String[] args) {
//		esse exercício tive que consultar para conseguir fazer
		
		Scanner sc = new Scanner(System.in);

		int horaI, horaF, duracao;

		horaI = sc.nextInt();
		horaF = sc.nextInt();

		if (horaI < horaF) {
			duracao = horaF - horaI;
		} else {
			duracao = 24 - horaI + horaF;
		}
		System.out.println("O jogo durou " + duracao + " horas(s)");
		
		sc.close();
	}

}
