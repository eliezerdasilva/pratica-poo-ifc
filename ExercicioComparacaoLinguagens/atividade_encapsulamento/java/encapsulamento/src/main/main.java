package main;

import dtos.Pessoa;

public class main {
	public static void main(String[] args) {
		Pessoa pessoa = new Pessoa();
		pessoa.setName("Luiz");
		pessoa.setCpf(151515312);
		pessoa.setIdade(15);
		
		//Não consigo instanciar Profissao pq seu encapsulamento é protect
		System.out.println(pessoa);
	}
}
