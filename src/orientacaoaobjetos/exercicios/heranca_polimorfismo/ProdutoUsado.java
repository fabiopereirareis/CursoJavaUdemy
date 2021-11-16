package orientacaoaobjetos.exercicios.heranca_polimorfismo;

import java.text.SimpleDateFormat;
import java.util.Date;

public class ProdutoUsado extends Produto {
	
	SimpleDateFormat dateFormat = new SimpleDateFormat("dd/MM/yyyy");

	private Date dataDeFabricacao;

	public ProdutoUsado() {
	}

	public ProdutoUsado(String nome, double preco, Date dataDeFabricacao) {
		super(nome, preco);
		this.dataDeFabricacao = dataDeFabricacao;
	}

	public Date getDataDeFabricacao() {
		return dataDeFabricacao;
	}

	public void setDataDeFabricacao(Date dataDeFabricacao) {
		this.dataDeFabricacao = dataDeFabricacao;
	}

}
