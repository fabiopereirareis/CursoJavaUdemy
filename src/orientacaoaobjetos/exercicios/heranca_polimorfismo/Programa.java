package orientacaoaobjetos.exercicios.heranca_polimorfismo;

import java.text.SimpleDateFormat;
import java.util.Locale;
import java.util.Scanner;

public class Programa {

	public static void main(String[] args) {
		Locale.setDefault(Locale.US);
		Scanner sc = new Scanner(System.in);
		SimpleDateFormat dateFormat = new SimpleDateFormat("dd/MM/yyyy");
		
		System.out.print("Entre coma quantidade de produtos: ");
		int quantidade = sc.nextInt();
		
		Produto produto = null;
		for(int i=0; i<quantidade; i++) {
			System.out.println("Produto #"+(i+1));
			System.out.print("Comum, usado ou importado (c/u/i)?");
			char tipo = sc.next().charAt(0);
			sc.nextLine();
			System.out.print("Nome: ");
			String nome = sc.nextLine();
			System.out.print("Preço: ");
			double preco = sc.nextDouble();
			System.out.print("Taxa: ");
			double taxa = sc.nextDouble();
			produto = new Produto(nome, preco);
		}
		System.out.println(produto);
	}

}
