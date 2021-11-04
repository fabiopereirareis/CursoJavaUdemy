package estrutura_condicional;

import java.util.Scanner;

public class EstruturaIFCompostaEncadeada {

	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);
		int hora;

		System.out.println("Quantas horas ?");
		hora = sc.nextInt();

		// m�todo v�lido por�m forma a 'escada'
		if (hora < 12) {
			System.out.println("Bom dia");
		} else {
			if (hora < 18) {
				System.out.println("Boa tarde");
			} else {
				System.out.println("Boa noite");
			}
		}
		
		// m�todo mais elegante (mais usado)
		if (hora < 12) {
			System.out.println("Bom dia");
		} else if (hora < 18) {
			System.out.println("Boa tarde");
		} else {
			System.out.println("Boa noite");
		}

		sc.close();
	}

}
