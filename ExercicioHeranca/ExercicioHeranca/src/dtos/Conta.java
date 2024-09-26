package dtos;
import java.util.ArrayList;
import java.util.Date;

public  class Conta {
	private String numeroConta;
	private double valorContaCorrente;
	private Date dataCriacaoConta;
	private Date dataEncerramento;
	private double limiteTransferencia; 
	private double poupanca; 
	private ArrayList<String> Extrato ;

	
	public Conta() {
		super();
	}	
	public Conta(String numeroConta, double valorContaCorrente, Date dataCriacaoConta, Date dataEncerramento,
			double limiteTransferencia, double poupanca, ArrayList<String> extrato) {
		super();
		this.numeroConta = numeroConta;
		this.valorContaCorrente = valorContaCorrente;
		this.dataCriacaoConta = dataCriacaoConta;
		this.dataEncerramento = dataEncerramento;
		this.limiteTransferencia = limiteTransferencia;
		this.poupanca = poupanca;
		Extrato = extrato;
	}



	public String getNumeroConta() {
		return numeroConta;
	}
	public void setNumeroConta(String numeroConta) {
		this.numeroConta = numeroConta;
	}
	public double getValorContaCorrente() {
		return valorContaCorrente;
	}
	public void setValorContaCorrente(double valorContaCorrente) {
		this.valorContaCorrente = valorContaCorrente;
	}
	public double getLimiteTransferencia() {
		return limiteTransferencia;
	}
	public void setLimiteTransferencia(double limiteTransfrerencia) {
		this.limiteTransferencia = limiteTransfrerencia;
	}
	public double getPoupanca() {
		return poupanca;
	}
	public void setPoupanca(double poupanca) {
		this.poupanca = poupanca;
	}
	public ArrayList<String> getExtrato() {
		return Extrato;
	}
	public void setExtrato(ArrayList<String> extrato) {
		Extrato = extrato;
	}
	
	public Date getDataCriacaoConta() {
		return dataCriacaoConta;
	}
	public void setDataCriacaoConta(Date dataCriacaoConta) {
		this.dataCriacaoConta = dataCriacaoConta;
	}
	public Date getDataEncerramento() {
		return dataEncerramento;
	}
	public void setDataEncerramento(Date dataEncerramento) {
		this.dataEncerramento = dataEncerramento;
	}
	@Override
	public String toString() {
		return "\n Conta numeroConta=" + numeroConta + ", valorContaCorrente=" + valorContaCorrente + ", dataCriacao="
				+ dataCriacaoConta + ", limiteTransferencia=" + limiteTransferencia + ", poupanca=" + poupanca + ", Extrato="
				+ Extrato +" \n";
	}
	
	

}
