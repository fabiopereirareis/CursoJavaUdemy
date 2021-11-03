import java.util.Locale; // importação de idioma padrão

public class Main {

	public static void main(String[] args) {
		
//		saída de texto
		System.out.print("Olá mundo!"); // sem quebra de linha
		System.out.println("Boa tarde"); // com quebra de linha
		
//		saída de atributos das variáveis
		int y = 32;
		System.out.println(y);
		
		double x = 10.35784;
		System.out.println(x); // sem formatação
//		10.35784 >>> saída padrão sem formatação
		
		// %.2f indica que serão usadas 2 casas decimais, %n indica uma quebra de linha
		System.out.printf("%.2f%n", x); // com formatação, 2 casas decimais e quebra de linha
//		10,36 >>> saída formatada com 2 casas decimais (separador vírgula)
		
		System.out.printf("%.4f%n", x); // com formatação, 4 casas decimais e quebra de linha
//		10,3578 >>> saída formatada com 4 casas decimais (separador vírgula)
		
		Locale.setDefault(Locale.US); // Classe usada para modificar o idioma padrão
		
		System.out.printf("%.2f%n", x); // com formatação, 2 casas decimais e quebra de linha
//		10.36 >>> saída formatada com 2 casas decimais (separador ponto)
		
//		concatenação de variáveis
		System.out.println("Resultado: " + x + " metros");
//		Resultado: 10.35784 metros >>> saída sem formatação
		
		System.out.printf("Resultado = %.2f metros%n", x);
//		Resultado = 10.36 metros >>> saída formatada
		
//		concatenação e formatação de variáveis diferentes
		String nome = "Maria";
		int idade = 31;
		double renda = 4000.0;
		System.out.printf("%s tem %d anos e ganha R$ %.2f reais%n", nome, idade, renda);
//		Maria tem 31 anos e ganha R$ 4000.00 reais >>> saída com todos os dados
	}

}
