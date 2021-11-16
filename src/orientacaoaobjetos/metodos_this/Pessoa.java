package orientacaoaobjetos.metodos_this;

public class Pessoa {
	private float peso;
	private String nome;
	private float altura;
	
	
	public Pessoa() {
		peso = 80.0f;
	}
	
	public Pessoa(String nome) {
		this(); // esse this() refer�ncia o m�todo construtor (linha 9)
		this.nome = nome; // esse this atribui a vari�vel nome (linha 5) o par�metro recebido nome(linha 13)
	}
	
	public Pessoa(float altura) {
		this.altura = altura;
	}

	public Pessoa(float peso, String nome, float altura) {
		this.peso = peso;
		this.nome = nome;
		this.altura = altura;
	}

	public float getPeso() {
		return peso;
	}

	public void setPeso(float peso) {
		this.peso = peso;
	}

	public String getNome() {
		return nome;
	}

	public void setNome(String nome) {
		this.nome = nome;
	}

	public float getAltura() {
		return altura;
	}

	public void setAltura(float altura) {
		this.altura = altura;
	}

	@Override
	public String toString() {
		return "Pessoa [peso=" + peso + ", nome=" + nome + ", altura=" + altura + "]";
	}
	
	
	
	
}
