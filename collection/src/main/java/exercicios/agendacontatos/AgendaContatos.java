package exercicios.agendacontatos;

import java.util.HashSet;
import java.util.Set;

public class AgendaContatos {
   private Set<Contato> contatosSet;
   
   public AgendaContatos() {
	   this.contatosSet =new HashSet<>();
   }
   public void AdicionarContatos(String name, int number) {
	 contatosSet.add(new Contato(name, number)); 
   }
   public void ExibirContatos() {
	   System.out.println(contatosSet);
   }
   
   public Set<Contato> PesquisarPorNome(String name) {
	   Set<Contato> contatoPorNome= new HashSet<>();
	   for (Contato c : contatosSet) {
		if(c.getName().startsWith(name)) {
			contatoPorNome.add(c);
		}
		if(c.getName().equalsIgnoreCase(name)) {
			contatoPorNome.add(c);
		}
		
	}
	return contatoPorNome;
	   
   }
   
   public Contato atualizarContato(String name, int newnumber) {
	   Contato contatoAtualizado=null;
	   for (Contato c : contatosSet) {
		if(c.getName().equalsIgnoreCase(name)) {
			c.setNumber(newnumber);
			contatoAtualizado=c;
			break;
		}
	}
	return contatoAtualizado;
	   
   }
}
