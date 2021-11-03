package processamento;

public class ProcessamentoBasico {

	public static void main(String[] args) {
		
		// processamento de dados
		int a, b;
		double resultado;
		
		a = 5;
		b = 2;
		
		resultado = a / b;
		System.out.println(resultado);
//		saída >>> 2.0 ; o compilador arredondou o valor que deveria ser 2.5
//		o compilador entende que a resposta deve ser do tipo int(sem casas decimais)
		
		resultado = (double) a / b; 
		System.out.println(resultado);
//		saída >>> 2.5 ; nesse caso é feita uma conversão para double adicionado as casas decimais (casting)

		
	}

}
