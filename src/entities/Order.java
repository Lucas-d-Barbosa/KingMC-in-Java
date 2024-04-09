package entities;

import java.util.ArrayList;
import java.util.Date;
import java.util.List;

import entities.enums.OrderStatus;

public class Order {
	private Date moment;
	private OrderStatus status;
	
	private List<OrderItem> items = new ArrayList<>();
	
	public Order() {
		
	}
	public Order(Date moment, OrderStatus status) {
		super();
		this.moment = moment;
		this.status = status;
	}
	
	public void addItem(OrderItem item) {
		this.items.add(item);
	}
	
	public void removeItem(OrderItem item) {
		this.items.remove(item);
	}
	
}
