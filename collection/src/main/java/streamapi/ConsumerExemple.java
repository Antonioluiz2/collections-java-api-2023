package streamapi;

import java.util.Arrays;
import java.util.List;
import java.util.function.Consumer;

public class ConsumerExemple {

	public static void main(String[] args) {
		List<Integer> numeros=Arrays.asList(1,2,3,4,5,6,7,8,9,10);

		//usar o cosumer com expressão lambida para imprimir numeros pares
		Consumer<Integer> imprimirNumeroPar = numero -> {
			if(numero%2==0) {
				System.out.println(numero);
			}
		};
		//Usar o Consumer para imprimir numeros pares no stream
		numeros.stream().forEach(imprimirNumeroPar);

		System.out.println("-----------------------------");
		//simplificando o codigo com a interface consumer no forEach 
		numeros.stream().forEach(new Consumer<Integer>() {

			@Override
			public void accept(Integer t) {
				if(t%2==0) {
					System.out.println(t);
				}
			}
		});

		System.out.println("-----------------------------");
		//simplificando usando lambda
		numeros.forEach(t-> {
			if(t%2==0) {
				System.out.println(t);
				}
			});
	}
}
