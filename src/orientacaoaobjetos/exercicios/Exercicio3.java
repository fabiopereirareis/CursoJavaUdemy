package orientacaoaobjetos.exercicios;

import java.util.Locale;
import java.util.Scanner;

public class Exercicio3 {

	public static void main(String[] args) {
		Locale.setDefault(Locale.US);
		Scanner sc = new Scanner(System.in);
		
		Student student = new Student();
		student.setName(sc.nextLine());
		student.setNoteA(sc.nextDouble());
		student.setNoteB(sc.nextDouble());
		student.setNoteC(sc.nextDouble());
		
		student.resultGrade();
		
		sc.close();
	}

}
