package br.com.exercicios;

public class TesteGeral {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Cachorro cachorro1 = new Cachorro();
		Cavalo cavalo1 = new Cavalo();
		Preguica preguica1 = new Preguica();
		
		
		cachorro1.setNome("Cachorro");
		cachorro1.setIdade(3);
		
		cavalo1.setNome("Cavalo");
		cavalo1.setIdade(7);
		
		preguica1.setNome("Preguiça");
		preguica1.setIdade(2);
		
		
		cachorro1.emitirSom();
		cavalo1.emitirSom();
		preguica1.emitirSom();
		
		System.out.println("\n=======================================\n");
		
		cachorro1.correr();
		cavalo1.correr();
		preguica1.subirArvore();
		
	}
}
