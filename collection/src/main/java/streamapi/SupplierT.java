package streamapi;

import java.util.List;
import java.util.function.Supplier;
import java.util.stream.Stream;

/**
 * Representa uma operação que não aceita nenhum argumento e retorna um resultado do tipo T.
 * é comum usar para criar ou fornecer novos objetos de um determinado tipo.
 * */
public class SupplierT {

	public static void main(String[] args) {
		//Usar o supplier com expressão lambda
		//Supplier<String>saudacao=()-> "Olá Mundo!";
		
		//Usar o Supplier para obter uma lista com 5 saudações
		List<String>listaSaudacoes=Stream.generate(()->"Olá Mundo")
				.limit(10)
				.toList();
		
		//Imprimir as saudações
		listaSaudacoes.forEach(System.out::println);
	}

}
