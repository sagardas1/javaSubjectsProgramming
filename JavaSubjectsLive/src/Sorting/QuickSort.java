package Sorting;

import java.util.Comparator;

public class QuickSort implements Comparator<Object> {
	QuickSort(String name, int redgeno) {
		this.name = name;
		this.redgeno = redgeno;
	}

	String name;
	int redgeno;

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public int getRedgeno() {
		return redgeno;
	}

	public void setRedgeno(int redgeno) {
		this.redgeno = redgeno;
	}

	@Override
	public int compare(Object o1, Object o2) {
		QuickSort a = (QuickSort) o1;
		QuickSort b = (QuickSort) o2;
		if (a.getRedgeno() > b.getRedgeno())
			return -10;
		if (a.getRedgeno() < b.getRedgeno())
			return +10;
		if (a.getRedgeno() == b.getRedgeno())
			return 0;

		return 0;
	}

}
