package dtos;

import java.util.ArrayList;
import java.util.Date;

public class Operacoes {
	
	public boolean saque(double valor, Conta conta) {
		if(valor>= 0) {
				double totalContaCorrente = conta.getValorContaCorrente(); 
				totalContaCorrente = totalContaCorrente - valor; 
				ArrayList<String> extrato = new ArrayList<>();
				extrato = conta.getExtrato();
				extrato.add("Saque: R$ "+valor+ " Data : "+ new Date() );
				conta.setExtrato(extrato);
				return true; 
		}
		return false; 
	}
	public ArrayList<Conta> transferencia(double valor, Conta contaRemetente, Conta contaDestinatario) {
		ArrayList<Conta> listCont = new ArrayList<>();
		if(valor>=0) {
			contaRemetente.setValorContaCorrente(contaRemetente.getValorContaCorrente()-valor);
			contaDestinatario.setValorContaCorrente(contaDestinatario.getValorContaCorrente()+ valor);
			ArrayList<String> extrato = new ArrayList<>();
			extrato = contaRemetente.getExtrato();
			extrato.add("Transferencia  de "+ contaRemetente.getNumeroConta() + " Para "+ contaDestinatario.getNumeroConta() );
			ArrayList<String> extratoDestinatario = new ArrayList<>();
			extratoDestinatario = contaRemetente.getExtrato();
			extratoDestinatario.add("Transferencia  de "+contaRemetente.getNumeroConta() + " Para "+ contaDestinatario.getNumeroConta() );
			listCont.add(contaRemetente);
			listCont.add(contaDestinatario);
			return listCont;
		}
		return listCont;
	}
	public Conta deposito(Conta conta,double valor ) {
		conta.setValorContaCorrente(conta.getValorContaCorrente()+valor);
		ArrayList<String> extrato = new ArrayList<>();
		extrato = conta.getExtrato();
		extrato.add("Depósito: R$"+ valor + " Data : " +new Date() );
		return conta; 
	}
}
