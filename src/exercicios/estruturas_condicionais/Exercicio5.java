package exercicios.estruturas_condicionais;

import java.util.Locale;
import java.util.Scanner;

public class Exercicio5 {

	public static void main(String[] args) {
		Locale.setDefault(Locale.US);
		Scanner sc = new Scanner(System.in);

		int codigo, quantidade;
		double conta = 0.0;
		
		double cachorroQuente = 4.00;
		double xSalada = 4.50;
		double xBacon = 5.00;
		double torradaSimples = 2.00;
		double refrigerante = 1.50;

		codigo = sc.nextInt();
		quantidade = sc.nextInt();

		if (codigo == 1) {
			conta = quantidade * cachorroQuente;
		} 
		if(codigo == 2){
			conta = quantidade * xSalada;
		}
		if(codigo == 3){
			conta = quantidade * xBacon;
		}
		if(codigo == 4){
			conta = quantidade * torradaSimples;
		}
		if(codigo == 5){
			conta = quantidade * refrigerante;
		}
		
		System.out.printf("Total: R$ %.2f",conta);
		
		sc.close();
	}

}
