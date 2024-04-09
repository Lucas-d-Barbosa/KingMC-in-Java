package entities;

public class Product {
	private String name;
	private Double price;
	
	public Product() {
		
	}
	
	public Product(String name, Double price) {
		this.name = name;
		this.price = price;
	}
	
	public String getName() {
		return this.name;
	}
	
	public void setName(String name) {
		this.name = name;
	}
	
	public Double getPrice() {
		return this.price;
	}
	
	public void setPrice(Double price) {
		this.price = price;
	}
	
	public String toString() {
		return String.format("Name - %s ; Price - %.2f", this.name, this.price);
	}
}
