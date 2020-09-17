package java8MystramApi;

import java.util.*;
import java.util.stream.Collectors;

import com.google.gson.Gson;

public class MySteamApI {
	@SuppressWarnings("unused")
	public static void main(String[] args) {
		List<Product> productsList = new ArrayList<Product>();
		productsList.add(new Product(1, "HP Laptop", 25000f));
		productsList.add(new Product(2, "Dell Laptop", 30000f));
		productsList.add(new Product(3, "Lenevo Laptop", 28000f));
		productsList.add(new Product(4, "Sony Laptop", 28000f));
		productsList.add(new Product(5, "Apple Laptop", 90000f));

		@SuppressWarnings("unused")
		List<Product> p = productsList.stream().filter((q) -> q.price > 30000).collect(Collectors.toList());

		productsList.stream().filter((w) -> w.price >= 30000).forEach((w) -> System.out.println(w.price));

		long count = productsList.stream().count();

		Set<Product> set = productsList.stream().collect(Collectors.toSet());

		@SuppressWarnings("unused")
		Map<Float, Product> m = productsList.stream().collect(Collectors.toMap((u) -> u.price, (u) -> u));

		@SuppressWarnings("unused")
		List<Float> f = productsList.stream().map((h) -> h.price).collect(Collectors.toList());

	}

}

class Product {
	int id;
	String name;
	float price;

	public Product(int id, String name, float price) {
		this.id = id;
		this.name = name;
		this.price = price;
	}
}
