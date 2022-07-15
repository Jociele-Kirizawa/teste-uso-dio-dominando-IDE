package com.dio;

import com.dio.model.Gato;

public class PrimeiroProjeto {

	public static void main(String[] args) {
		
			Gato gato = new Gato();
			Livros livros = new Livros ();
		int a = 4;
		int b = 4;
		
		System.out.println("Hello World " + (a+b));
		System.out.println(gato);
		System.out.println(livros);
		
	} 
	}
	
	
class Livros{
	private String nome;
	private String npag;
}


