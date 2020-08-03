package Immutable;

import java.util.ArrayList;

public final class MyImmutable {
	private final String a;
	private final ArrayList<String> address;

	MyImmutable(String a, ArrayList<String> address) {
		this.a = a;
		this.address = address;
	}

	public String getA() {
		return a;
	}

	@SuppressWarnings("unchecked")
	public ArrayList<String> getAddress() {
		return (ArrayList<String>) address.clone();
	}

}
