package esercizi;

import java.time.LocalDate;
import java.util.ArrayList;
import java.util.List;
import java.util.stream.Collectors;

public class Main {

	public static void main(String[] args) {
		LocalDate oggi = LocalDate.now();
		Customer c1 = new Customer(20000020L, "De Rossi",1 ) ;
		Order order1 = new Order(20000020L, c1, "created", oggi);
		Order order2 = new Order(20000021L, c1, "created", oggi);
		Order order3 = new Order(20000022L, c1, "created", oggi);

		order1.addProduct(new Product(10000010L, "Smartphone Android", "tech", 899.90D));
		order1.addProduct(new Product(10000011L, "Asimov, io robot", "book", 19.80D));
		order1.addProduct(new Product(10000012L, "Giro del mondo in 90g", "book", 14.15D));
		order2.addProduct(new Product(10000012L, "Viaggio al centro della terra", "book", 140.20D));
		order2.addProduct(new Product(10000012L, "giocattoli", "baby", 140.20D));
		order3.addProduct(new Product(10000012L, "narrativa per ragazzi", "Boys", 36.80D));
		order3.addProduct(new Product(10000012L, "Arduino kit", "Boys", 36.80D));

		// Es.1
		// lista di books con price > 100
		List<Order> orders = new ArrayList<Order>();
		orders.add(order1);
		orders.add(order2);
		orders.add(order3);

		List<Product> libri = orders.stream()
				.map(e -> e.getProducts()).flatMap(e -> e.stream())
				.filter(e -> e.getCategory().toLowerCase().equals("book") && e.getPrice() > 100)
				.collect(Collectors.toList());

		System.out.println("\nLibri");
		for (Product product : libri) {
			System.out.println(product.toString());
		}

		// Es2 prodotti con categoria baby
		List<Product> prodottiPerBambini = orders.stream().map(e -> e.getProducts()).flatMap(e -> e.stream())
				.filter(e -> e.getCategory().toLowerCase().equals("baby"))
				.collect(Collectors.toList());

		System.out.println("\nProdotti Per Bambini");
		for (Product product : prodottiPerBambini) {
			System.out.println(product.toString());
		}

		// Es3 prodotti con categoria boys da scontare del 10%
		List<Product> prodottiPerRagazzi = orders.stream().map(e -> e.getProducts()).flatMap(e -> e.stream())
				.filter(e -> e.getCategory().toLowerCase().equals("boys"))
				.map((e)-> {
					e.setPrice(e.getPrice() * 0.9);// 10% di sconto
					return e;
				})
				.collect(Collectors.toList());

		System.out.println("\nProdotti Per Ragazzi");
		for (Product product : prodottiPerRagazzi) {
			System.out.println(product.toString());
		}

	}

}


