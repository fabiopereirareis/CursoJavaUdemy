package orientacaoaobjetos.exercicios.composicao;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.Locale;
import java.util.Scanner;

import orientacaoaobjetos.exercicios.composicao.enums.StatusDoPedido;

public class Programa {

	public static void main(String[] args) throws ParseException {
		Locale.setDefault(Locale.US);
		Scanner sc = new Scanner(System.in);
		SimpleDateFormat sdf = new SimpleDateFormat("dd/MM/yyyy");

		System.out.println("Entre com os dados do cliente:");
		System.out.print("Nome: ");
		String nome = sc.nextLine();

		System.out.print("Email: ");
		String email = sc.next();

		System.out.print("Data nascimento:");
		Date dataNascimento = sdf.parse(sc.next());

		Cliente cliente = new Cliente(nome, email, dataNascimento);

		System.out.println("Entre com os dados do pedido: ");
		System.out.print("Status: ");
		StatusDoPedido status = StatusDoPedido.valueOf(sc.next());

		Pedido pedido = new Pedido(new Date(), status, cliente);

		System.out.print("Quantos itens vai ser adicionado a ordem ? ");
		int quantidade = sc.nextInt();
		sc.nextLine();

		for (int i = 0; i < quantidade; i++) {
			System.out.println("Entre com os dados do item#" + (i + 1));
			System.out.print("Nome do produto: ");
			String produtoNome = sc.nextLine();
			System.out.print("Entre com o preço do produto: ");
			double preco = sc.nextDouble();
			sc.nextLine();
			System.out.print("Entre com a quantidade: ");
			int quantidadeProduto = sc.nextInt();
			sc.nextLine();
			Produto produto = new Produto(produtoNome, preco);
			Item item = new Item(quantidadeProduto, produto.getPreco(), produto);
			pedido.adcionarItem(item);
		}
		System.out.println("----------------------------");
		System.out.println(pedido);
		sc.close();
	}
}
