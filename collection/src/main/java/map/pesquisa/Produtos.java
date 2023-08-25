package map.pesquisa;

public class Produtos {
	//atributos
	  private String nome;
	  private double preco;
	  private int quantidade;

	  public Produtos(String nome, double preco, double preco2, int quantidade) {
	    this.nome = nome;
	    this.preco = preco;
	    this.quantidade = quantidade;
	  }

	  public String getNome() {
	    return nome;
	  }

	  public double getPreco() {
	    return preco;
	  }

	  public int getQuantidade() {
	    return quantidade;
	  }

	  @Override
	  public String toString() {
	    return "Produtos{" +
	        "nome='" + nome + '\'' +
	        ", preco=" + preco +
	        ", quantidade=" + quantidade +
	        '}';
	  }
}
