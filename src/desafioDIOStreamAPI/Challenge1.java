package desafioDIOStreamAPI;

import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;

public class Challenge1 {
	public static void main (String []args) {
		List<Integer> numeros = Arrays.asList(1, 2, 3, 4, 5, 6, 7, 8, 9, 10, 5, 4, 3);

		List<Integer> ordenada = numeros.stream()
		        .sorted()
		        .collect(Collectors.toList());

		System.out.println(ordenada);
	}
}
