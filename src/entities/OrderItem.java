package entities;

import java.util.ArrayList;
import java.util.List;

public class OrderItem {

	Integer quantity;
	Double price;
	
	List<Product> products = new ArrayList<>();
	
	
	public OrderItem(Integer quantity, Double price) {
		this.quantity = quantity;
		this.price = price;
	}
	

	public Integer getQuantity() {
		return quantity;
	}

	public void setQuantity(Integer quantity) {
		this.quantity = quantity;
	}

	public Double getPrice() {
		return price;
	}

	public void setPrice(Double price) {
		this.price = price;
	}

	public Double subTotal() {
		return quantity * price;
	}
	
	public void addProduct(Product product) {
		products.add(product);
	}
}
