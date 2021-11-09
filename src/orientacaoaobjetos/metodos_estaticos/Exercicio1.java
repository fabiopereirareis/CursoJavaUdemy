package orientacaoaobjetos.metodos_estaticos;

import java.util.Locale;
import java.util.Scanner;

public class Exercicio1 {

	public static void main(String[] args) {
		Locale.setDefault(Locale.US);
		Scanner sc = new Scanner(System.in);
		
		System.out.print("What is the dollar price? ");
 		double dollarP = sc.nextDouble();
 		System.out.print("How many dollars will be bought? ");
 		double dollarB = sc.nextDouble();
 		
 		CurrencyConverter.converter(dollarP, dollarB);
		
 		sc.close();
	}

}
