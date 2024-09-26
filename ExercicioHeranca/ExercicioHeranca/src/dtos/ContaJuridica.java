package dtos;

import java.util.ArrayList;
import java.util.Date;

public class ContaJuridica extends Conta {
	private ArrayList<Colaborador> listColaboradores; 
	private String cnpj;
	private String razaoSocial;
	
	public ContaJuridica(String numeroConta, double valorContaCorrente, Date dataCriacaoConta,Date dataEncerramento, double limiteTransfrerencia,
			double poupanca, ArrayList<String> extrato, ArrayList<Colaborador> listColaboradores, String cnpj,
			String razaoSocial) {
		super(numeroConta, valorContaCorrente, dataCriacaoConta, dataEncerramento,limiteTransfrerencia, poupanca, extrato);
		this.listColaboradores = listColaboradores;
		this.cnpj = cnpj;
		this.razaoSocial = razaoSocial;
	}
	public ArrayList<Colaborador> getListColaboradores() {
		return listColaboradores;
	}
	public void setListColaboradores(ArrayList<Colaborador> listColaboradores) {
		this.listColaboradores = listColaboradores;
	}
	public String getCnpj() {
		return cnpj;
	}
	public void setCnpj(String cnpj) {
		this.cnpj = cnpj;
	}
	public String getRazaoSocial() {
		return razaoSocial;
	}
	public void setRazaoSocial(String razaoSocial) {
		this.razaoSocial = razaoSocial;
	}
	@Override
	public String toString() {
		return "ContaJuridica listColaboradores=" + listColaboradores + ", cnpj=" + cnpj + ", razaoSocial="
				+ razaoSocial + " getCnpj()=" + getCnpj()
				+ ", RazaoSocial= " + getRazaoSocial() + ", NumeroConta()=" + getNumeroConta()
				+ ", ValorContaCorrente()=" + getValorContaCorrente() + ", DataCriacao()=" + getDataCriacaoConta()
				+ ", LimiteTransfrerencia()=" + getLimiteTransferencia() + ", Poupanca()=" + getPoupanca()
			+ "\n";
	} 
	
	
}
