package exercicios.estruturas_condicionais;

import java.util.Locale;

public class IfTernario {

	public static void main(String[] args) {
		Locale.setDefault(Locale.US);
		
		double preco = 100.00;
		//					condição 		se positivo		se negativo
		double desconto = (preco > 50.00) ? preco * 0.1 : preco * 0.05 ;
		System.out.println(desconto);
	}

}
