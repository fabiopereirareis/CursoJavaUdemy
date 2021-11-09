package orientacaoaobjetos.exercicios;

public class Student {
	private String name;
	private double noteA, noteB, noteC;

	public Student() {
		super();
	}

	public void resultGrade() {
		double sumNotes = noteA + noteB + noteC;
		if (sumNotes >= 60.00) {
			System.out.printf("Final grade = %.2f %n", sumNotes);
			System.out.println("Pass");
		} else {
			double minNotes = 60.00;
			System.out.printf("Final grade = %.2f %n", sumNotes);
			System.out.println("Failed");
			System.out.printf("Missing %.2f points %n", minNotes - sumNotes);
			
		}
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public double getNoteA() {
		return noteA;
	}

	public void setNoteA(double noteA) {
		this.noteA = noteA;
	}

	public double getNoteB() {
		return noteB;
	}

	public void setNoteB(double noteB) {
		this.noteB = noteB;
	}

	public double getNoteC() {
		return noteC;
	}

	public void setNoteC(double noteC) {
		this.noteC = noteC;
	}

}
