package orientacaoaobjetos.metodos_this;

import java.util.Locale;

public class Programa {

	public static void main(String[] args) {
		Locale.setDefault(Locale.US);
		
		Pessoa pessoa = new Pessoa();
		Pessoa pessoa1 = new Pessoa(1.60f);
		Pessoa pessoa2 = new Pessoa("Ronaldo");
		// nesse caso passando somente o nome, o método construtor já adiciona
		// o peso especificado no método usando o this()
		Pessoa pessoa3 = new Pessoa(75.0f, "Pedro", 1.75f);
		
		System.out.println(pessoa);
		System.out.println(pessoa1);
		System.out.println(pessoa2);
		System.out.println(pessoa3);
	}

}
