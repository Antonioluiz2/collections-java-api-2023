package streamapi;

import java.util.List;
import java.util.function.Supplier;
import java.util.stream.Stream;

/**
 * Representa uma opera��o que n�o aceita nenhum argumento e retorna um resultado do tipo T.
 * � comum usar para criar ou fornecer novos objetos de um determinado tipo.
 * */
public class SupplierT {

	public static void main(String[] args) {
		//Usar o supplier com express�o lambda
		//Supplier<String>saudacao=()-> "Ol� Mundo!";
		
		//Usar o Supplier para obter uma lista com 5 sauda��es
		List<String>listaSaudacoes=Stream.generate(()->"Ol� Mundo")
				.limit(10)
				.toList();
		
		//Imprimir as sauda��es
		listaSaudacoes.forEach(System.out::println);
	}

}
