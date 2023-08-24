package exercicios.convidados;

import java.util.Objects;

public class Convidado {

	private String name;
	private int codigoConvite;
	public Convidado(String nome, int codigoConvite2) {
		// TODO Auto-generated constructor stub
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public int getCodigoConvite() {
		return codigoConvite;
	}
	public void setCodigoConvite(int codigoConvite) {
		this.codigoConvite = codigoConvite;
	}
	@Override
	public String toString() {
		return "Convidado [name=" + name + ", codigoConvite=" + codigoConvite + "]";
	}
	
	@Override
	public int hashCode() {
		return Objects.hash(codigoConvite, name);
	}
	//realiza a comparação do codigo convite e name se ja existe
	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		if (getClass() != obj.getClass())
			return false;
		Convidado other = (Convidado) obj;
		return codigoConvite == other.codigoConvite && Objects.equals(name, other.name);
	}
	
}
