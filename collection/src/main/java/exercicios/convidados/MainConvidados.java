package exercicios.convidados;

public class MainConvidados {

	public static void main(String[] args) {
		ConjuntoConvidados cv= new ConjuntoConvidados();
		cv.adcionarConvidado("Luiz", 20);
		cv.adcionarConvidado("Jason", 11);
		cv.adcionarConvidado("Giesy", 2);
		cv.adcionarConvidado("Rafa", 45);
		cv.adcionarConvidado("Bob", 50);
		cv.adcionarConvidado("Michael", 100);
		cv.adcionarConvidado("Renata", 10);
		System.out.println("Existem: "+ cv.contarCovidado());
		System.out.println("remover: ");
		
		cv.removeConvidado(2);
		System.out.println("Nomes: ");
		cv.exibirConvidado();
		
		int n=10;
		for (int i=0; i<10;i++) {
			cv.exibirConvidado();
		}
	}

}
