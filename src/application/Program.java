package application;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.Locale;
import java.util.Scanner;

import entities.Client;
import entities.Order;
import entities.OrderItem;
import entities.Product;
import entities.enums.OrderStatus;

public class Program {

	public static void main(String[] args) throws ParseException {
		SimpleDateFormat fmt1 = new SimpleDateFormat("dd/MM/yyyy");
		Locale.setDefault(Locale.US);
		Scanner sc = new Scanner(System.in);
		
		// Client
		System.out.print("Name: ");
		String name1 = sc.nextLine();
		System.out.print("Email: ");
		String email1 = sc.nextLine();
		System.out.print("Birth date (DD/MM/YYY): ");		
		Date date1 = fmt1.parse(sc.nextLine());
		Client c1 = new Client(name1, email1, date1);
		// Fim Client
		
		// OrderStatus
		System.out.println("Enter order data: ");
		System.out.print("Status: ");
		OrderStatus status1 = OrderStatus.valueOf(sc.nextLine());
		Date momentOrder1 = new Date();
		Order order1 = new Order(momentOrder1, status1);
		System.out.print("How many items to this order? ");
		Integer quantity1 = sc.nextInt();
		
		order1.addClient(c1);
		//Fim OrderStatus
		
		for(int i = 0; i < quantity1; i++) {
			System.out.println("Enter #"+ (i + 1) +" item data: ");
			System.out.print("Product name: ");
			sc.nextLine();
			String name = sc.nextLine();
			System.out.print("Product price: ");
			Double price = sc.nextDouble();
			
			Product p = new Product(name, price);
			
			System.out.print("Quantity: ");
			int quantity = sc.nextInt();
			
			OrderItem oItem = new OrderItem(quantity, p);
			order1.addItem(oItem);
			
		}
		
		System.out.println();
		System.out.println(order1);
		sc.close();
	}

}
