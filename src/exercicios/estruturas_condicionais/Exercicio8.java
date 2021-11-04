package exercicios.estruturas_condicionais;

import java.util.Locale;
import java.util.Scanner;

public class Exercicio8 {

	public static void main(String[] args) {
		// para resolver esse exercício tive que pesquisar o material de apoio
		Locale.setDefault(Locale.US);
		Scanner sc = new Scanner(System.in);

		double salario = 0.0;
		double imposto = 0.0;

		salario = sc.nextDouble();

		if (salario > 0 && salario <= 2000) {
			System.out.println("Isento");
		}
		if (salario > 2000 && salario <= 3000) {
			imposto = (salario - 2000) * 0.08;
			System.out.printf("R$ %.2f %n", imposto);
		}
		if (salario > 3000 && salario <= 4500) {
			imposto = (salario - 3000) * 0.18 + 1000 * 0.08;
			System.out.printf("R$ %.2f %n", imposto);
		}
		if (salario > 4500) {
			imposto = (salario - 4500) * 0.28 + 1500 * 0.18 + 1000 * 0.08;
			System.out.printf("R$ %.2f %n", imposto);
		}

		sc.close();
	}

}
