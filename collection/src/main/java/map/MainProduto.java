package map;

public class MainProduto {

	public static void main(String[] args) {
		EstoqueProdutos ep=new EstoqueProdutos();
		ep.adicionarProduto(1L, "TV", 10, 2500);
		ep.adicionarProduto(2L, "PC", 11, 3000);
		ep.adicionarProduto(3L, "DRONE", 25, 1500);

		ep.exibirProduto();
		System.out.println("Valor Total: "+ep.calcularValorTotalEstoque());
		System.out.println("Produto Mais Caro: "+ep.obterProdutoMaisCaro());
	}

}
