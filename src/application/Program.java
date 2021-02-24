package application;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.Locale;
import java.util.Scanner;

import entities.Client;
import entities.Order;
import entities.OrderItem;
import entities.OrderStatus;
import entities.Product;

public class Program {

	public static void main(String[] args) throws ParseException {
		
		Locale.setDefault(Locale.US);
		Scanner sc = new Scanner(System.in);
		SimpleDateFormat sdf = new SimpleDateFormat("dd/MM/yyyy");
		Date moment = new Date();
		
		// Client data
		
		System.out.println("Enter client data: ");
		System.out.println("Name: ");
		String name = sc.next();
		System.out.println(name);
		System.out.println("E-mail: ");
		String email = sc.next();
		System.out.println("Birth date (DD/MM/YYYY): ");
		Date birthDate = sdf.parse(sc.next());
		
		Client c1 = new Client(name, email, birthDate);
		
		// Order data
		
		System.out.println("Enter order data: ");
		System.out.println("Status: ");
		String status = sc.next();
		
		Order o1 = new Order(moment, OrderStatus.valueOf(status));
		o1.addClient(c1);
		
		System.out.println("How many items to this order?");
		int numberOfItems = sc.nextInt();
		
		
		for(int i = 1; i <= numberOfItems; i++) {
			System.out.println("Enter #" + i + " item data:");
			System.out.println("Product name: ");
			String productName = sc.next();
			System.out.println("Product price: ");
			Double productPrice = sc.nextDouble();
			System.out.println("Quantity: ");
			int productQuantity = sc.nextInt();
			
			OrderItem orderItem = new OrderItem(productQuantity, productPrice);
			
			Product product = new Product(productName, productPrice); 
			
			orderItem.addProduct(product);

			o1.addItem(orderItem);

		}
		
		
		// Order summary
		
		
		
		sc.close();
		
	}

}
