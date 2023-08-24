package map;

import java.util.HashMap;
import java.util.Map;
import java.util.Set;
import java.util.TreeSet;

import exercicios.cadastroprodutos.Produto;

public class EstoqueProdutos {
   private Map<Long, Produto>estoqueProduto;

public EstoqueProdutos() {
	this.estoqueProduto = new HashMap<>();
}
public void adicionarProduto(long codigo, String nome, double preco, int qtde) {
	estoqueProduto.put(codigo, new Produto(nome, codigo, preco, qtde));
}

public void exibirProduto() {
	System.out.println(estoqueProduto);
	
}
public double calcularValorTotalEstoque(){
	double valorTotalEstoque=0d;
	if(!estoqueProduto.isEmpty()) {
		for (Produto c : estoqueProduto.values()) {
			valorTotalEstoque += c.getQtde()*c.getPreco();
		}
		
	}
	return valorTotalEstoque;
	
}
public Produto obterProdutoMaisCaro(){
	Produto produtoCaro = null;
	double maiorPreco= Double.MIN_VALUE;
	for (Produto p : estoqueProduto.values()) {
		if(p.getPreco()>maiorPreco) {
			produtoCaro=p;
		}
	}
	return produtoCaro;
	
}
   
}
