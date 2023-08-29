package streamapi.exercicios;

import java.util.Arrays;
import java.util.List;
import java.util.function.Consumer;
import java.util.stream.Stream;

public class Desafios {

	public static void main(String[] args) {
		ordemNumerica();
		System.out.println("-------");
		ordemNumericaSomaPares();

	}
  public static void ordemNumerica() {
	  List<Integer>numero= Arrays.asList(6,2,3,4,5,1);
		
		//Function<Integer, Integer>dobrar=n->n*2;
		
		List<Integer>numerosDobrados=numero.stream()
				.sorted()
				.toList();
		
		numerosDobrados.forEach(System.out::println);
  }
  
  public static void ordemNumericaSomaPares() {
	  List<Integer>numeros= Arrays.asList(1,2,3,4,5,6);
		
		//Function<Integer, Integer>dobrar=n->n*2;
		Stream<Integer>pd= numeros.stream().map(n->n*2);
	 	System.out.println("-----------------------------");
	 	pd.forEach(System.out::println);
		System.out.println("A soma dos pares: ");
		//simplificando usando lambda
		numeros.forEach(t-> {
			if(t%2==0) {
				t+=t%2;
				System.out.println(t);
				}
			});
  }
}
