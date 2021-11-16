package orientacaoaobjetos.exercicios.lists;

public class Funcionario {
	private int id;
	private String nome;
	private double salario;

	public Funcionario(int id, String nome, double salario) {
		super();
		this.id = id;
		this.nome = nome;
		this.salario = salario;
	}

	public Funcionario() {
		super();
	}

	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}

	public String getNome() {
		return nome;
	}

	public void setNome(String nome) {
		this.nome = nome;
	}

	public double getSalario() {
		return salario;
	}

	public void aumentoDeSalario(double porcentagem) {
		salario += (salario * porcentagem) / 100;
	}

	@Override
	public String toString() {
		return  id + ", " + nome + ", " + String.format("%.2f", salario);
	}
	
}
