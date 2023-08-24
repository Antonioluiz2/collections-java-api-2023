package map.agendacontatos;

import java.util.List;
import java.util.Scanner;

public class MainAgendaMap {

	public static void main(String[] args) {
		Scanner sc= new Scanner(System.in);
		
		AgendaContatos ac= new AgendaContatos();
		ac.adicionarContato("LUIZ", 994110718);
		ac.adicionarContato("João", 994155558);
		ac.adicionarContato("Geisy", 99888818);
		ac.adicionarContato("Paulo", 515515);
		ac.adicionarContato("LUIZ", 994118);
		ac.adicionarContato("Jeff", 9999718);
		ac.adicionarContato("Carlos", 99412328);
//		System.out.println("Digite o nome: ");
//		ac.adicionarContato(sc.nextLine(), sc.nextInt());
		
  
		System.out.println("\n:::Apresentação:::");
		System.out.println("------------------\n");
		ac.exibirContato();
		System.out.println("O telefone é: "+ac.pesquisarPorNome("João"));
		
		
		
		sc.close();
	}

}
