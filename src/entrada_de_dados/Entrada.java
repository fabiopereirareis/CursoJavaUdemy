package entrada_de_dados;

import java.util.Scanner;

public class Entrada {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in); // Classe para entrada de dados

		String x;
		x = sc.next(); // pegando variável do tipo String
		System.out.println(x);

		int y;
		y = sc.nextInt(); // pegando variável do tipo int
		System.out.println(y);

		double z;
		z = sc.nextDouble(); // pegando variável do tipo double
		System.out.println(z);

		char a;
		a = sc.next().charAt(0); // pegando o primeiro caracter digitado
		System.out.println(a);

		// leitura de vários dados na mesma linha

		String nome;
		int idade;
		double altura;

		nome = sc.next();
		idade = sc.nextInt();
		altura = sc.nextDouble();

		System.out.println(nome);
		System.out.println(idade);
		System.out.println(altura);

		sc.close(); // fecha o objeto sc

	}

}
