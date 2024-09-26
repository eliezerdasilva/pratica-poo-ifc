package controller;

import java.util.ArrayList;
import java.util.Date;

import dtos.Colaborador;
import dtos.Conta;
import dtos.ContaFisica;
import dtos.ContaJuridica;
import dtos.Endereco;
import dtos.Operacoes;

public class main {
	
	public static void main(String[] args) {
		
		ArrayList<String> extrato1 = new ArrayList<>();
        extrato1.add("Depósito: R$ 500 Data : ");
        extrato1.add("Saque: R$ 100  Data : ");

        ArrayList<String> extrato2 = new ArrayList<>();
        extrato2.add("Depósito: R$ 1000 Data : ");
        extrato2.add("Transferência: R$ 250 Data : ");

        ArrayList<String> extrato3 = new ArrayList<>();
        extrato3.add("Depósito: R$ 1500 Data : ");
        extrato3.add("Pagamento: R$ 300 Data : ");

        ArrayList<String> extrato4 = new ArrayList<>();
        extrato4.add("Depósito: R$ 2000 Data : ");
        extrato4.add("Transferência: R$ 400 Data : ");
		
        
        Endereco endereco1 = new Endereco("88888-888", "SP", "Sorocaba", "Bela Vista", "Rua Esperança", "154");
        Endereco endereco2 = new Endereco("77777-777", "RJ", "Rio de Janeiro", "Copacabana", "Avenida Atlântica", "300");
        Endereco endereco3 = new Endereco("66666-666", "MG", "Belo Horizonte", "Savassi", "Rua Rio Grande", "78");
        Endereco endereco4 = new Endereco("55555-555", "BA", "Salvador", "Barra", "Avenida Oceânica", "456");
        Endereco endereco5 = new Endereco("44444-444", "RS", "Porto Alegre", "Moinhos de Vento", "Rua Dona Laura", "100");
        
        Colaborador Colaborador1 = new Colaborador(123456789, "Carlos Oliveira", new Date(1990, 5, 15), endereco1);
        Colaborador Colaborador2 = new Colaborador(987654321, "Maria Souza", new Date(1985, 10, 22), endereco2);
        Colaborador Colaborador3 = new Colaborador(192837465, "João Silva", new Date(1978, 3, 5), endereco3);
        Colaborador Colaborador4 = new Colaborador(564738291, "Ana Costa", new Date(1995, 8, 30), endereco4);
        Colaborador Colaborador5 = new Colaborador(748596321, "Pedro Santos", new Date(2000, 1, 10), endereco5);
        
        ArrayList<Colaborador> listColaboradores1 = new ArrayList<>();
        listColaboradores1.add(Colaborador3);
        ArrayList<Colaborador> listColaboradores2 = new ArrayList<>();
        listColaboradores2.add(Colaborador4);
        listColaboradores2.add(Colaborador5);

        
        ContaFisica contaFisica1 = new ContaFisica("1111-2222", 1500.00, new Date(),new Date(), 5000.00, 1000.00, extrato1, Colaborador1);
        ContaFisica contaFisica2 = new ContaFisica("3333-4444", 3000.00, new Date(),new Date(), 10000.00, 2000.00, extrato2,Colaborador2);
        ContaJuridica contaJuridica1 = new ContaJuridica("5555-6666", 4500.00, new Date(),new Date(), 15000.00, 3000.00, extrato3, listColaboradores1, "21546532427", "TEC LIDA");
        ContaJuridica contaJuridica2 = new ContaJuridica("7777-8888", 6000.00, new Date(),new Date(), 20000.00, 4000.00, extrato4, listColaboradores2, "46545645646", "RC Transportes");
        
        System.out.println("Colaboradores antes das operacões");
        System.out.println(contaFisica1);
        System.out.println(contaFisica2);
        System.out.println(contaJuridica1);
        System.out.println(contaJuridica2);
        System.out.println("Colaboradores depois da operações");
        //Deposito 
        Operacoes operacoes = new Operacoes();
        Conta  contaDeposito = new Conta(); 
        contaDeposito.setNumeroConta(contaFisica1.getNumeroConta());
        contaDeposito.setValorContaCorrente(contaFisica1.getValorContaCorrente());
        contaDeposito.setDataCriacaoConta(contaFisica1.getDataCriacaoConta());
        contaDeposito.setLimiteTransferencia(contaFisica1.getLimiteTransferencia());
        contaDeposito.setPoupanca(contaFisica1.getPoupanca());
        contaDeposito.setExtrato(contaFisica1.getExtrato());
        Conta returnDeposito =operacoes.deposito(contaDeposito,555);
        System.out.println("Operacao Feita"+ returnDeposito);
        
        
        //Saque
        Conta  contaSaque = new Conta(); 
        contaSaque.setNumeroConta(contaFisica2.getNumeroConta());
        contaSaque.setValorContaCorrente(contaFisica2.getValorContaCorrente());
        contaSaque.setDataCriacaoConta(contaFisica2.getDataCriacaoConta());
        contaSaque.setLimiteTransferencia(contaFisica2.getLimiteTransferencia());
        contaSaque.setPoupanca(contaFisica2.getPoupanca());
        contaSaque.setExtrato(contaFisica2.getExtrato());
        Conta returnSaque = operacoes.deposito(contaSaque,666);
        System.out.println("Operacao Feita"+ returnSaque);
        // Transferencia 
        Conta  contaTransferenciaRemetente = new Conta(); 
        contaTransferenciaRemetente.setNumeroConta(contaJuridica1.getNumeroConta());
        contaTransferenciaRemetente.setValorContaCorrente(contaJuridica1.getValorContaCorrente());
        contaTransferenciaRemetente.setDataCriacaoConta(contaJuridica1.getDataCriacaoConta());
        contaTransferenciaRemetente.setLimiteTransferencia(contaJuridica1.getLimiteTransferencia());
        contaTransferenciaRemetente.setPoupanca(contaJuridica1.getPoupanca());
        contaTransferenciaRemetente.setExtrato(contaJuridica1.getExtrato());
        
        Conta  contaTransferenciaDestinatario = new Conta(); 
        contaTransferenciaDestinatario.setNumeroConta(contaJuridica2.getNumeroConta());
        contaTransferenciaDestinatario.setValorContaCorrente(contaJuridica2.getValorContaCorrente());
        contaTransferenciaDestinatario.setDataCriacaoConta(contaJuridica2.getDataCriacaoConta());
        contaTransferenciaDestinatario.setLimiteTransferencia(contaJuridica2.getLimiteTransferencia());
        contaTransferenciaDestinatario.setPoupanca(contaJuridica2.getPoupanca());
        contaTransferenciaDestinatario.setExtrato(contaJuridica2.getExtrato());
    
        
        
        ArrayList<Conta> returnTransferencia = operacoes.transferencia(888,contaTransferenciaRemetente,contaTransferenciaDestinatario);
        System.out.println(returnTransferencia);
        
        
        
	}

}
