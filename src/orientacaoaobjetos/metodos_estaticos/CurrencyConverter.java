package orientacaoaobjetos.metodos_estaticos;

public class CurrencyConverter {
	
	public static void converter(double doolarPrince, double doolarBought) {
		double result = doolarBought * doolarPrince ;
		result += result * 0.06;
		System.out.printf("Amount to be paid in reais = %.2f",result);
	}
}
