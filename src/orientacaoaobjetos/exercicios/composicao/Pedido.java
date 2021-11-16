package orientacaoaobjetos.exercicios.composicao;

import java.text.SimpleDateFormat;
import java.util.ArrayList;
import java.util.Date;
import java.util.List;

import orientacaoaobjetos.exercicios.composicao.enums.StatusDoPedido;

public class Pedido {
	private Date data;
	private StatusDoPedido status;
	private Cliente cliente;

	private List<Item> itens = new ArrayList<Item>();

	private static SimpleDateFormat sdf = new SimpleDateFormat("dd/MM/yyyy HH:mm:ss");

	public void adcionarItem(Item item) {
		itens.add(item);
	}

	public void removerItem(Item item) {
		itens.remove(item);
	}

	public double total() {
		double total = 0.0;
		for (Item i : itens) {
			total += i.subTotal();
		}
		return total;
	}

	public Pedido() {
		super();
	}

	public Pedido(Date data, StatusDoPedido status, Cliente cliente) {
		super();
		this.data = data;
		this.status = status;
		this.cliente = cliente;
	}

	public Date getData() {
		return data;
	}

	public void setData(Date data) {
		this.data = data;
	}

	public StatusDoPedido getStatus() {
		return status;
	}

	public void setStatus(StatusDoPedido status) {
		this.status = status;
	}

	public Cliente getCliente() {
		return cliente;
	}

	public void setCliente(Cliente cliente) {
		this.cliente = cliente;
	}

	@Override
	public String toString() {
		StringBuilder sb = new StringBuilder();
		sb.append("Hora do pedido: ");
		sb.append(sdf.format(data));
		sb.append("\n");
		sb.append("Status da ordem: ");
		sb.append(status);
		sb.append("\n");
		sb.append("Cliente: ");
		sb.append(cliente);
		sb.append("\n");
		sb.append("Itens da ordem: ");
		sb.append("\n");
		for (Item i : itens) {
			sb.append(i);
			sb.append("\n");
		}
		sb.append("Total do pedido: $");
		sb.append(String.format("%.2f", total()));
		return sb.toString();
	}

}
