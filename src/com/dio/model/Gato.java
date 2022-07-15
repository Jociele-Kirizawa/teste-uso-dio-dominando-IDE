package com.dio.model;

public class Gato {
	
	private String nome;
	private String cor;
	private Integer Idade;
	
	public Gato (){
		
	};
	
	public Gato(String nome, String cor, Integer idade) {
		
		this.nome = nome;
		this.cor = cor;
		Idade = idade;
	}

	public String getNome() {
		return nome;
	}

	public void setNome(String nome) {
		this.nome = nome;
	}

	public String getCor() {
		return cor;
	}

	public void setCor(String cor) {
		this.cor = cor;
	}

	public Integer getIdade() {
		return Idade;
	}

	public void setIdade(Integer idade) {
		Idade = idade;
	}

	@Override
	public String toString() {
		return "Gato [nome=" + nome + ", cor=" + cor + ", Idade=" + Idade + "]";
	}
	 
	
	
	
	
	

}
