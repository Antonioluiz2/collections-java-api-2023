package exercicios.agendacontatos;

public class MainContatos {

	public static void main(String[] args) {
		AgendaContatos ac= new AgendaContatos();
		
		ac.AdicionarContatos("Antonio Luiz", 1000);
		ac.AdicionarContatos("POP", 5000);
		ac.AdicionarContatos("JAZZ", 100);
		ac.AdicionarContatos("BLUES", 3000);
		ac.AdicionarContatos("POP", 2000);
		ac.AdicionarContatos("Luiz", 4000);
		
		ac.atualizarContato("BLUES", 10);
		
		
		System.out.println(ac.PesquisarPorNome("luiz"));
		ac.ExibirContatos();
	}

}
