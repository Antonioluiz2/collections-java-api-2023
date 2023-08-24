package exercicios.cadastroprodutos;

import java.util.HashSet;
import java.util.Set;
import java.util.TreeSet;

public class CadastroProdutos {

	private Set<Produto> produtoSet;

	public CadastroProdutos() {
		this.produtoSet = new HashSet<>();
	}
	
	public void adicionarProduto(String nome, long codigo, double preco, int qtde) {
		produtoSet.add(new Produto(nome, codigo, preco, qtde));
	}
	public void exibirProduto() {
		
	}
	public Set<Produto> exibeProdutoPorNome(){
		Set<Produto>produtoPorNome = new TreeSet<>(produtoSet);
		return produtoPorNome;
		
	}
	public Set<Produto> exibeProdutoPorPreco(){
		Set<Produto>produtoPorPreco = new TreeSet<>(new ComparatorPorPreco());
		produtoPorPreco.addAll(produtoSet);
		return produtoPorPreco;
		
	}
	
}
