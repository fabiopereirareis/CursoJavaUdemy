package variaveis;

public class Strings {
	public static void main(String[] args) {

//	compara��o entre Strings

		String nomeA = "Maria";
		String nomeB = "Jo�o";
		boolean resultado = nomeA.equals(nomeB);

		System.out.println(resultado);
//	saida >>> false
		
//		String formatada
		double valor = 1.00;
		String formatdada = String.format("%.3f", valor);
		System.out.println(formatdada);
	}

//	formata��o de vari�veis no printf
//			%f = ponto flutuante
//			%d = inteiro
//			%s = texto
//			%n = quebra de linha
}
