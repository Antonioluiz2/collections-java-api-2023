package map.operacoesBasicas;

import java.util.HashMap;
import java.util.Map;

public class Dicionario {

			 //atributos
		  private Map<String, String> dicionario;

		  public Dicionario() {
		    this.dicionario = new HashMap<>();
		  }

		  public void adicionarPalavra(String palavra, String definicao) {
		    dicionario.put(palavra, definicao);
		  }

		  public void removerPalavra(String palavra) {
		    dicionario.remove(palavra);
		  }

		  public void exibirPalavras() {
		    if (!dicionario.isEmpty()) {
		      System.out.println(dicionario);
		    }
		  }

		  public String pesquisarPorPalavra(String palavra) {
		    return dicionario.get(palavra);
		  }

		  public static void main(String[] args) {
		    Dicionario dicionario = new Dicionario();

		    // Adicionar palavras
		    dicionario.adicionarPalavra("ma��", "Fruta comest�vel de polpa suculenta e sabor doce.");
		    dicionario.adicionarPalavra("casa", "Lugar onde algu�m mora.");
		    //dicionario.adicionarPalavra("uva", "Saborosa se faz vinho");

		    // Exibir todas as palavras
		    dicionario.exibirPalavras();

		    // Pesquisar uma palavra
		    String definicaoMaca = dicionario.pesquisarPorPalavra("ma��");
		    System.out.println("Defini��o da palavra 'ma��': " + definicaoMaca);
		    String definicaoUva = dicionario.pesquisarPorPalavra("uva");
		    System.out.println("Defini��o da palavra 'uva': " + definicaoUva);

		    // Remover uma palavra
		    dicionario.removerPalavra("casa");
		    System.out.println("Ap�s remover a palavra 'casa':");
		    dicionario.exibirPalavras();
		  
	}

}
