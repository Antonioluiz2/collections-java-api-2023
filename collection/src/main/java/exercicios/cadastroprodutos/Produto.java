package exercicios.cadastroprodutos;

import java.util.Comparator;
import java.util.Objects;

public class Produto implements Comparable<Produto>{
  private String nome;
  private long codigo;
  private double preco;
  private int qtde;
  
public Produto(String nome, long codigo, double preco, int qtde) {
	this.nome = nome;
	this.codigo = codigo;
	this.preco = preco;
	this.qtde = qtde;
}
public String getNome() {
	return nome;
}
public long getCodigo() {
	return codigo;
}
public double getPreco() {
	return preco;
}
public int getQtde() {
	return qtde;
}
@Override
public String toString() {
	return "Produto [nome=" + nome + ", codigo=" + codigo + ", preco=" + preco + ", qtde=" + qtde + "]\n";
}
@Override
public int hashCode() {
	return Objects.hash(codigo);
}
@Override
public boolean equals(Object obj) {
	if (this == obj)
		return true;
	if (obj == null)
		return false;
	if (getClass() != obj.getClass())
		return false;
	Produto other = (Produto) obj;
	return codigo == other.codigo;
}
//comparando por nome do produto
@Override
public int compareTo(Produto p) {
	return nome.compareToIgnoreCase(p.getNome());
}
 

}
class ComparatorPorPreco implements Comparator<Produto>{
	@Override
	public int compare(Produto p1, Produto p2) {
		// TODO Auto-generated method stub
		return Double.compare(p1.getPreco(), p2.getPreco());
	}
}

	