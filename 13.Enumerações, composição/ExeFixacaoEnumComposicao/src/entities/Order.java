package entities;

import java.text.SimpleDateFormat;
import java.time.LocalDateTime;
import java.util.ArrayList;
import java.util.Date;
import java.util.List;

import entities.enums.OrderStatus;

public class Order {

	private Date moment;
	private OrderStatus status;
	
	SimpleDateFormat sdf2 = new SimpleDateFormat("dd/MM/yyyy HH:mm:ss");
	
	// Associação - 1 pedido pode ter vários itens
	private List<OrderItem> items = new ArrayList<>();
	

	public Order() {
	} 
	
	public Order(Date moment, OrderStatus status) {
		this.moment = moment;
		this.status = status;
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
	
	public List<OrderItem> getItems() {
		return items;
	}

	public void addItem(OrderItem item) {
		items.add(item);
	}
	
	public void removeItem(OrderItem item) {
		items.remove(item);
	}
	
	public Double total() {
		// TODO: logica para calcular o total do pedido
		for(int i = 0; i < items.size(); i++) {
		
		}
		return 0.0;
		
	}	
	
	public String toString() {
		StringBuilder sb = new StringBuilder();
		// objeto sb agora permite concanetar
		// outros string usando a função append
		sb.append("\nORDER SUMMARY:"); 
		// para acrescentar a data, é necessário ter uma
		// instancia do SimpleDateFormat nesta classe também
		sb.append("\nOrder moment: " + sdf2.format(moment) + "\n");
		sb.append("Order status: " + status);

		// Converte o StringBuilder para String
		return sb.toString();
	}
}
