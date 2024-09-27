package dtos;

class Profissao {
	// codigo acessivel apenas para o pacote dtos
	protected String nome;
	protected float salario;
	protected String nCarteiraTrabalho;

	public Profissao(String nome, float salario, String nCarteiraTrabalho) {
		super();
		this.nome = nome;
		this.salario = salario;
		this.nCarteiraTrabalho = nCarteiraTrabalho;
	}

	public String getNome() {
		return nome;
	}

	public void setNome(String nome) {
		this.nome = nome;
	}

	public float getSalario() {
		return salario;
	}

	public void setSalario(float salario) {
		this.salario = salario;
	}

	public String getnCarteiraTrabalho() {
		return nCarteiraTrabalho;
	}

	public void setnCarteiraTrabalho(String nCarteiraTrabalho) {
		this.nCarteiraTrabalho = nCarteiraTrabalho;
	}

}
