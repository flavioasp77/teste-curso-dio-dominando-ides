package br.com.curso;

import br.com.curso.model.Gato;

public class PrimeiroPrograma {

	public static void main(String[] args) {
		
		Gato gato = new Gato(null, null, null);
		Livro livro = new Livro();
		
		System.out.println(gato);
		System.out.println(livro);

	}

}

class Livro {
	public String titulo;
	public Integer numeroPaginas;
}
