package entities;

import java.text.SimpleDateFormat;
import java.util.ArrayList;
import java.util.Date;
import java.util.List;

import entities.enums.OrderStatus;

public class Order {
	
	SimpleDateFormat fmt1 = new SimpleDateFormat("dd/MM/yyyy hh:mm:ss");
	SimpleDateFormat fmt2 = new SimpleDateFormat("dd/MM/yyyy");
	private Date moment;
	private OrderStatus status;
	private Client client;
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
	
	
	public void addItem(OrderItem item) {
		items.add(item);
	}
	
	public void removeItem(OrderItem item) {
		items.remove(item);
	}
	
	public void addClient(Client client) {
		this.client = client;
	}
	
	public Double total() {
		Double total = 0.0;
		for(OrderItem item : items) {
			total += item.subTotal();
		}
		return total;
	}
	
	public String toString() {
		StringBuilder str = new StringBuilder();
		str.append("ORDER SUMMARY:\n");
		str.append("Order moment: " + fmt1.format(moment) + "\n");
		str.append("Order statud: " +this.status + "\n");
		str.append("Client: " +this.client.getName() + " " + "(" +fmt1.format(this.client.getBirthDate()) + ") - "+ this.client.getEmail() +"\n");
		str.append("Order items:\n");
		for(OrderItem item : items) {
			str.append(item.toString());
		}
		str.append("Total price: " + String.format("%.2f", this.total()));
		String str1 = String.format("%s", str);
		return str1;
	}
}
