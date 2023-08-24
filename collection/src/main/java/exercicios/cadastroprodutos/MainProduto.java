package exercicios.cadastroprodutos;

public class MainProduto {

	public static void main(String[] args) {
		CadastroProdutos cp= new CadastroProdutos();
		cp.adicionarProduto("TV", 01, 1500, 1);
		cp.adicionarProduto("AR-Condicionado", 04, 1500, 1);
		cp.adicionarProduto("PC", 02, 5000, 8);
		cp.adicionarProduto("RADIO", 03, 1500, 1);
		cp.adicionarProduto("TJ", 05, 1500, 1);
		
System.out.println(cp.exibeProdutoPorNome());

cp.adicionarProduto("TV", 01, 1500, 1);
cp.adicionarProduto("AR-Condicionado", 04, 11500, 1);
cp.adicionarProduto("PC", 02, 2000, 8);
cp.adicionarProduto("RADIO", 03, 100, 1);
cp.adicionarProduto("TJ", 05, 15500, 1);
System.out.println(cp.exibeProdutoPorPreco());
	}

}
