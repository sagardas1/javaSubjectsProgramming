package arrayProgram;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.Set;
import java.util.stream.Collectors;

public class A {

	public static void main(String[] args) {

		List<List<Integer>> list = new ArrayList<List<Integer>>();
		list.add(Arrays.asList(1, 2, 3));
		list.add(Arrays.asList(1, 2, 4));
		list.add(Arrays.asList(1, 2));

		Set<Integer> sum = list.stream().map(p -> p.stream().mapToInt(i -> i).sum()).collect(Collectors.toSet());

		System.out.println(sum.stream().mapToInt(j -> j).sum());

	}

}
