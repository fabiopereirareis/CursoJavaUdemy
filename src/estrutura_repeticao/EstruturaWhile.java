package estrutura_repeticao;

import java.util.Scanner;

public class EstruturaWhile {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		int x;
		int soma = 0;
		x = sc.nextInt();
		
//		estrutura enquanto, quando n�o se sabe a quantidade de repeti��es necess�rias
		while(x != 0) {
			soma += x;
			x = sc.nextInt();
		}
		System.out.println(soma);
		sc.close();

	}

}
