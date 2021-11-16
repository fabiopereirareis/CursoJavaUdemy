package orientacaoaobjetos.exercicios.lists;

import java.util.ArrayList;
import java.util.List;
import java.util.Locale;
import java.util.Scanner;

public class Programa {

	public static void main(String[] args) {
		Locale.setDefault(Locale.US);
		Scanner sc = new Scanner(System.in);

		List<Funcionario> funcionarios = new ArrayList<>();

		int numeroFuncionarios = sc.nextInt();
		
//		cadastro dos funcion�rios
		for (int i = 0; i < numeroFuncionarios; i++) {
			System.out.printf("Trabalhador #%d: %n",i+1);
			System.out.print("ID: ");
			int id = sc.nextInt();
			sc.nextLine();
			
//			verifica��o se o funcion�rio existe
			for (Funcionario x : funcionarios) {
				while (id == x.getId()) {
					System.out.println("ID j� existe, entre com ID diferente.");
					System.out.print("ID: ");
					id = sc.nextInt();
					sc.nextLine();
				}
			}

			System.out.print("Nome: ");
			String nome = sc.nextLine();

			System.out.print("Salario: ");
			double salario = sc.nextDouble();
			sc.nextLine();

			funcionarios.add(new Funcionario(id, nome, salario));
		}
		
//		aumento de sal�rio
		System.out.print("Entre com o ID do funcion�rio escolhido: ");
		int idPesquisado = sc.nextInt();
		sc.nextLine();

		for (Funcionario x : funcionarios) {
			if (idPesquisado == x.getId()) {
				System.out.print("Entre com a porcentagem de aumento do sal�rio: ");
				double porcentagem = sc.nextDouble();
				x.aumentoDeSalario(porcentagem);
			}else {
				System.out.println("Funcion�rio n�o encontado");
			}
		}
		
//		sa�da dos dados para o usu�rio
		for (Funcionario x : funcionarios) {
			System.out.println(x.toString());
		}

		sc.close();
	}

}
