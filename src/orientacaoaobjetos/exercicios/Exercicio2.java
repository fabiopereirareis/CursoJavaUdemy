package orientacaoaobjetos.exercicios;

import java.util.Locale;
import java.util.Scanner;

public class Exercicio2 {

	public static void main(String[] args) {
		Locale.setDefault(Locale.US);
		Scanner sc = new Scanner(System.in);
		
		Employee employee = new Employee();
		
		System.out.print("Name: ");
		employee.setName(sc.nextLine());
		System.out.print("Gross salary: ");
		employee.setGrossSalary(sc.nextDouble());
		System.out.print("Tax: ");
		employee.setTax(sc.nextDouble());
		
		System.out.println();
		System.out.printf("Employee: %s, $ %.2f %n",employee.getName(),employee.netSalary());
		System.out.print("Which percentage to increase salay?");
		employee.increaseSalary(sc.nextDouble());
		System.out.printf("Updated data: %s, $ %.2f", employee.getName(), employee.netSalary());
		
		sc.close();
	}

}
