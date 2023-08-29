package streamapi;

import java.util.Arrays;
import java.util.List;
import java.util.function.Function;

/**
 * Representa uma função que aceita um argumento do tipo T E 
 * retorna um resultado do tipo R.
 * 
 *  É utilizada para transformar ou mapear os elementos do Stream em outros valores ou tipos.
 * */
public class FunctionExample {

	public static void main(String[] args) {
		//Criar Lista de numeros inteiros
		List<Integer>numero= Arrays.asList(1,2,3,4,5);
		
		//Function<Integer, Integer>dobrar=n->n*2;
		
		List<Integer>numerosDobrados=numero.stream()
				.map(n->n*2)
				.toList();
		
		numerosDobrados.forEach(System.out::println);
	}

}
