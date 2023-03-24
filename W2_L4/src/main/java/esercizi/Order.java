package esercizi;

import java.time.LocalDate;
import java.util.ArrayList;
import java.util.List;

public class Order {
	private Long id;
	private String status;
	private LocalDate orderDate;
	private LocalDate deliveryDate;
	private List<Product> products;
	private Customer customer;

	public Order(Long id, Customer customer, String status, LocalDate orderDate) {
		this.id = id;
		this.orderDate = orderDate;
		this.customer = customer;
		this.products = new ArrayList<Product>();

	}

	public Long getId() {
		return id;
	}

	public String getStatus() {
		return status;
	}

	public void setStatus(String status) {
		this.status = status;
	}

	public LocalDate getOrderDate() {
		return orderDate;
	}


	public LocalDate getDeliveryDate() {
		return deliveryDate;
	}

	public void setDeliveryDate(LocalDate deliveryDate) {
		this.deliveryDate = deliveryDate;
	}

	public List<Product> getProducts() {
		return products;
	}

	public void addProduct(Product p) {
		this.products.add(p);
	}

	// return true if element is present in the list before remove
	// otherwise return false
	public boolean removeProduct(Product p) {
		return this.products.remove(p);

	}

	public Customer getCustomer() {
		return customer;
	}


}
