package dtos;

import java.util.ArrayList;
import java.util.Date;

public class ContaFisica extends Conta {
	
	private Colaborador colaborador;
	

	public ContaFisica() {

	}

	public ContaFisica(String numeroConta, double valorContaCorrente, Date dataCriacaoConta,Date dataEncerramentoConta, double limiteTransfrerencia,
			double poupanca, ArrayList<String> extrato, Colaborador colaborador) {
		super(numeroConta, valorContaCorrente, dataCriacaoConta, dataEncerramentoConta,limiteTransfrerencia, poupanca, extrato);
		this.colaborador = colaborador;
	}

	public Colaborador getColaborador() {
		return colaborador;
	}

	public void setColaborador(Colaborador colaborador) {
		this.colaborador = colaborador;
	}

	@Override
	public String toString() {
		return "ContaFisica colaborador=" + colaborador 
				+ ", NumeroConta" + getNumeroConta() + ", ValorContaCorrente" + getValorContaCorrente()
				+ ", DataCriacao" + getDataCriacaoConta() + ", LimiteTransfrerencia" + getLimiteTransferencia()
				+ ", getPoupanca" + getPoupanca() + ", getExtrato" + getExtrato()+  "\n";
	}
	
	
	

	
	
	

}
