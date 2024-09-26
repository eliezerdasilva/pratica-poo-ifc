package dtos;

import java.util.Date;

public class Colaborador {
	private int cpf; 
	private String nome;
	private Date dataNsc;
	private Endereco endereco;
	
	public Colaborador(int cpf, String nome, Date dataNsc, Endereco endereco) {
		super();
		this.cpf = cpf;
		this.nome = nome;
		this.dataNsc = dataNsc;
		this.endereco = endereco;
	}

	public int getCpf() {
		return cpf;
	}

	public void setCpf(int cpf) {
		this.cpf = cpf;
	}

	public String getNome() {
		return nome;
	}

	public void setNome(String nome) {
		this.nome = nome;
	}

	public Date getDataNsc() {
		return dataNsc;
	}

	public void setDataNsc(Date dataNsc) {
		this.dataNsc = dataNsc;
	}

	public Endereco getEndereco() {
		return endereco;
	}

	public void setEndereco(Endereco endereco) {
		this.endereco = endereco;
	}

	@Override
	public String toString() {
		return "Colaborador : cpf=" + cpf + ", nome=" + nome + ", dataNsc=" + dataNsc + ", endereco=" + endereco + "\n";
	} 
	
	
	
}
