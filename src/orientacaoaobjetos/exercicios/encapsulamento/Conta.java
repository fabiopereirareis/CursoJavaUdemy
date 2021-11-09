package orientacaoaobjetos.exercicios.encapsulamento;

public class Conta {
	private int numeroConta;
	private String nomeTitular;
	private double valorInicial;
	private double saldoConta;
	
//	método de depósito bancário
	public double deposito(double entrada) {
		return saldoConta += entrada;
	}
	
//	método de saque bancário
	public double saque(double saida) {
		saldoConta -= saida;
		return saldoConta -= 5.00;
	}
	
	public Conta(int numeroConta, String nomeTitular, double valorInicial) {
		super();
		this.numeroConta = numeroConta;
		this.nomeTitular = nomeTitular;
		this.valorInicial = valorInicial;
		saldoConta += valorInicial;
	}

	public Conta(int numeroConta, String nomeTitular) {
		super();
		this.numeroConta = numeroConta;
		this.nomeTitular = nomeTitular;
		valorInicial = 0.0;
	}
	
	public Conta() {
		
	}

	public int getNumeroConta() {
		return numeroConta;
	}

	public String getNomeTitular() {
		return nomeTitular;
	}


	public void setNomeTitular(String nomeTitular) {
		this.nomeTitular = nomeTitular;
	}


	public double getValorInicial() {
		return valorInicial;
	}

	public double getSaldoConta() {
		return saldoConta;
	}

	@Override
	public String toString() {
		return "Conta " + numeroConta + ", Titular " + nomeTitular + ", Saldo: $ " +  String.format("%.2f", saldoConta);
	}
	
	
}
