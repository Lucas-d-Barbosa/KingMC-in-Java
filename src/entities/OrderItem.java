package entities;

import java.util.ArrayList;
import java.util.List;

public class OrderItem {
	private Integer quantity;
	private Double price;

	private List<Product> items = new ArrayList<>();

	public OrderItem() {

	}

	public Integer getQuantity() {
		return quantity;
	}

	public void setQuantity() {
		Integer cont = 0;
		for (int i = 0; i < this.items.size(); i++) {
			cont++;
		}
		this.quantity = cont;
	}

	public Double getPrice() {
		return this.price;
	}

	public void setPrice() {
		this.price = this.items.get(0).getPrice();
	}
	
	public Double subTotal() {
		return this.price * this.quantity;
	}
}
