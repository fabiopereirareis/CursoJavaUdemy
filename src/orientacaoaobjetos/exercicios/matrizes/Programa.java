package orientacaoaobjetos.exercicios.matrizes;

import java.util.Scanner;

public class Programa {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int m = sc.nextInt();
		int n = sc.nextInt();

		int[][] matriz = new int[m][n];
//		m linhas
//		n colunas
		for (int i = 0; i < m; i++) {
			for (int j = 0; j < n; j++) {
				int numero = sc.nextInt();
				matriz[i][j] = numero;
			}
		}

		int x = sc.nextInt();

		for (int i = 0; i < m; i++) {
			for (int j = 0; j < n; j++) {
				if (x == matriz[i][j]) {
					System.out.println("Posição: " + i + ", " + j);
					if (j - 1 >= 0)
						System.out.println("Esquerda: " + matriz[i][j - 1]);

					if (j + 1 <= m)
						System.out.println("Direita: " + matriz[i][j + 1]);

					if (i - 1 >= 0)
						System.out.println("Acima: " + matriz[i - 1][j]);

					if (i + 1 <= m)
						System.out.println("Abaixo: " + matriz[i + 1][j]);

				}
			}
		}
		sc.close();
	}

}
