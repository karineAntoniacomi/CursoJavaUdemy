package entities;

import java.text.SimpleDateFormat;
import java.util.ArrayList;
import java.util.Date;
import java.util.List;

import entities.enums.OrderStatus;

public class Order {

	private static SimpleDateFormat sdf = new SimpleDateFormat("dd/MM/yyyy HH:mm:ss");
	
	private Date moment;
	private OrderStatus status;
	
	// Associa��o 1 p/ 1
	private Client client;	

	// Associa��o 1 p/ muitos - 1 pedido pode ter v�rios itens
	private List<OrderItem> items = new ArrayList<OrderItem>();

	public Order() {
	} 
	
	// Cole��o nao vai no construtor pois a lista j� foi instanciada
	public Order(Date moment, OrderStatus status, Client client) {
		this.moment = moment;
		this.status = status;
		this.client = client;
	}

	public Date getMoment() {
		return moment;
	}

	public void setMoment(Date moment) {
		this.moment = moment;
	}

	public OrderStatus getStatus() {
		return status;
	}

	public void setStatus(OrderStatus status) {
		this.status = status;
	} 
	
	public Client getClient() {
		return client;
	}

	public void setClient(Client client) {
		this.client = client;
	} 

	public void addItem(OrderItem item) {
		items.add(item);
	}
	
	public void removeItem(OrderItem item) {
		items.remove(item);
	}
	
	public Double total() {
		double sum = 0.0;
		// p/ cada OrderItem it na lista items acumula o valor na soma
		for (OrderItem it : items) {
			sum += it.subTotal();
		}
		return sum;
	}	
	
	@Override
	public String toString() {
		StringBuilder sb = new StringBuilder();
		// objeto sb agora permite concanetar
		// outros string usando a fun��o append
		sb.append("\nORDER SUMMARY:"); 
		sb.append("\nOrder moment: ");
		// para acrescentar a data, � necess�rio ter uma
		// instancia do SimpleDateFormat nesta classe tamb�m
		sb.append (sdf.format(moment) + "\n");
		sb.append("Order status: ");
		sb.append(status + "\n");
		sb.append("Client: ");
		sb.append(client + "\n");
		sb.append("Order items: \n");

		for(OrderItem item : items) {
			sb.append(item + "\n");
		}
		sb.append("Total price: $");
		sb.append(String.format("%.2f", total()));
		
		// Converte o StringBuilder para String
		return sb.toString();
	}
}
