import java.util.Locale; // importa��o de idioma padr�o

public class Main {

	public static void main(String[] args) {
		
//		sa�da de texto
		System.out.print("Ol� mundo!"); // sem quebra de linha
		System.out.println("Boa tarde"); // com quebra de linha
		
//		sa�da de atributos das vari�veis
		int y = 32;
		System.out.println(y);
		
		double x = 10.35784;
		System.out.println(x); // sem formata��o
//		10.35784 >>> sa�da padr�o sem formata��o
		
		// %.2f indica que ser�o usadas 2 casas decimais, %n indica uma quebra de linha
		System.out.printf("%.2f%n", x); // com formata��o, 2 casas decimais e quebra de linha
//		10,36 >>> sa�da formatada com 2 casas decimais (separador v�rgula)
		
		System.out.printf("%.4f%n", x); // com formata��o, 4 casas decimais e quebra de linha
//		10,3578 >>> sa�da formatada com 4 casas decimais (separador v�rgula)
		
		Locale.setDefault(Locale.US); // Classe usada para modificar o idioma padr�o
		
		System.out.printf("%.2f%n", x); // com formata��o, 2 casas decimais e quebra de linha
//		10.36 >>> sa�da formatada com 2 casas decimais (separador ponto)
		
//		concatena��o de vari�veis
		System.out.println("Resultado: " + x + " metros");
//		Resultado: 10.35784 metros >>> sa�da sem formata��o
		
		System.out.printf("Resultado = %.2f metros%n", x);
//		Resultado = 10.36 metros >>> sa�da formatada
		
//		concatena��o e formata��o de vari�veis diferentes
		String nome = "Maria";
		int idade = 31;
		double renda = 4000.0;
		System.out.printf("%s tem %d anos e ganha R$ %.2f reais%n", nome, idade, renda);
//		Maria tem 31 anos e ganha R$ 4000.00 reais >>> sa�da com todos os dados
	}

}
