package exercicios.convidados;

import java.util.HashSet;
import java.util.Set;

public class ConjuntoConvidados {
	private Set<Convidado> convidadoSet;

	public ConjuntoConvidados() {
		this.convidadoSet = new HashSet<>();
	}

	public void adcionarConvidado(String nome, int codigoConvite) {
		convidadoSet.add(new Convidado(nome, codigoConvite));
	}
	  
	public void removeConvidado(int codigoConvite) {
		Convidado convidadoRemove=null;
		for (Convidado c : convidadoSet) {
			if(c.getCodigoConvite()==codigoConvite) {
				convidadoRemove=c;
				break;
			}
		}
		
		convidadoSet.remove(convidadoRemove);
	}
	
	public int contarCovidado() {
		return convidadoSet.size();
	}
	public void exibirConvidado() {
		System.out.println(convidadoSet);
	}
}
