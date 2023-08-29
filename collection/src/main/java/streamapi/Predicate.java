package streamapi;

import java.util.Arrays;
import java.util.List;

/**
 * Representa uma fun��o que aceita argumento do tipo T 
 * e retorna um valor booleano.
 *   
 *   � comum usar para filtar os elementos do Stream com base em alguma condi��o.
 *   
 * */
public class Predicate {

	public static void main(String[] args) {
		//Criar Lista de Palavras
		List<String>palavras = Arrays.asList("Java","Kotlin","Python","C","JavaScript","PHP");

//		Predicate<String>maisDeCincoCaracteres= palavra->palavra.length()>5;
		
		palavras.stream()
		.filter(p->p.length()>3)
		.forEach(System.out::println);
	}

}
