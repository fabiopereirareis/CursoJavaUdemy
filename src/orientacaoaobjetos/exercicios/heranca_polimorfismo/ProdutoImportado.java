package orientacaoaobjetos.exercicios.heranca_polimorfismo;

public class ProdutoImportado extends Produto {

	private double taxaAlfandegaria;
	
	public double precoTotal() {
		return getPreco() + taxaAlfandegaria ;
	}
	
	public ProdutoImportado() {
	}

	public ProdutoImportado(String nome, double preco, double taxaAlfandegaria) {
		super(nome, preco);
		this.taxaAlfandegaria = taxaAlfandegaria;
	}

	public double getTaxaAlfandegaria() {
		return taxaAlfandegaria;
	}

	public void setTaxaAlfandegaria(double taxaAlfandegaria) {
		this.taxaAlfandegaria = taxaAlfandegaria;
	}
	
	
	
}
