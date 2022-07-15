package br.com.generation.Exercicios;

public class ImprimeAnimal {

	public static void main(String[] args) {
		
		TesteAnimais t = new TesteAnimais();
		
		
		t.Idade(new Cachorro ());
		t.Nome(new Cachorro ());
		t.Som(new Cachorro());
		t.movimento(new Cachorro());
		System.out.println();
		
//----------------------------------------------------
		
		t.Idade(new Cavalo ());
		t.Nome(new Cavalo ());
		t.Som(new Cavalo());
		t.movimento(new Cavalo());
		System.out.println();
		
//----------------------------------------------------

		t.Idade(new Preguica ());
		t.Nome(new Preguica ());
		t.Som(new Preguica());
		t.movimento(new Preguica());
		System.out.println();
	}

}
