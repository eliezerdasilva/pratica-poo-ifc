package dtos;

public class Pessoa {
	// atributos private acessiveis apenas para classe pessoa 
	private String name;
	private int idade;
	private int cpf;
	protected Profissao profissao ; 
	
	public Pessoa() {}
	public Pessoa(String name, int idade, int cpf) {
		super();
		this.name = name;
		this.idade = idade;
		this.cpf = cpf;
	}
	//metodos get e set para acessar de outra classe 
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public int getIdade() {
		return idade;
	}
	public void setIdade(int idade) {
		this.idade = idade;
	}
	public int getCpf() {
		return cpf;
	}
	public void setCpf(int cpf) {
		this.cpf = cpf;
	}
	public Profissao getProfissao() {
		return profissao;
	}
	public void setProfissao(Profissao profissao) {
		this.profissao = profissao;
	}
	@Override
	public String toString() {
		return "Pessoa [name=" + name + ", idade=" + idade + ", cpf=" + cpf + ", profissao=" + profissao + "]";
	}
	
 
	
}
