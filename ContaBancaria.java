package aplication;

import java.util.Scanner;

public class ContaBancaria {
	
	private int numeroConta;
	private String nomeTitular;
	private double saldo;
	
	public ContaBancaria(int numeroConta, String nomeTitular) {
		this.numeroConta = numeroConta;
		this.nomeTitular = nomeTitular;
	}

	public int getNumeroConta() {
		return numeroConta;
	}

	public void setNumeroConta(int numeroConta) {
		this.numeroConta = numeroConta;
	}

	public String getNomeTitular() {
		return nomeTitular;
	}

	public void setNomeTitular(String nomeTitular) {
		this.nomeTitular = nomeTitular;
	}

	public double getSaldo() {
		return saldo;
	}

	public void setSaldo(double saldo) {
		this.saldo = saldo;
	}
	
	public void deposito(double valor) {
		if(valor > 0) {
			saldo += valor;
			System.out.println("");
			System.out.println("Depósito de R$ " + valor);
			System.out.println("");
		}else{
			System.out.println("Saldo insuficiente.");
		}
	}
	
	public void saque(double valor) {
		if(valor > 0) {
			if(saldo >= valor + 5.00) {
				saldo -= valor + 5.00;
				System.out.println("");
				System.out.println("Saque de R$ " + valor);
				System.out.println("A taxa de saque é de R$ 5.00.");
				System.out.println("");
			}else{
				System.out.println("Saldo insuficiente.");
			}
		}
	}
	
	public void mostrarConta() {
		System.out.println("Conta: " + getNumeroConta());
		System.out.println("Dono: " + getNomeTitular());
		System.out.println("Saldo: " + getSaldo());
		System.out.println("");
	}
	
	public void menu(Scanner entrada) {
		int opcao;
		System.out.println("1 - Depositar");
		System.out.println("2 - Sacar");
		System.out.println("3 - Ver os dados bancários");
		System.out.println("4 - Fechar o programa");
		System.out.println("");
		opcao = entrada.nextInt();
		
		switch(opcao) {
		case 1:
			System.out.print("Informe um valor para depositar: ");
			double deposito = entrada.nextDouble();
			deposito(deposito);
			atualizarDados();
			menu(entrada);
			break;
		case 2:
			System.out.print("Informe o valor para saque: ");
			double saque = entrada.nextDouble();
			saque(saque);
			atualizarDados();
			menu(entrada);
			break;
		case 3:
			mostrarConta();
			menu(entrada);
			break;
		case 4:
			System.out.println("Programa encerrado.");
			break;
		}
	}
		public void atualizarDados() {
			System.out.println("Atualização dos dados da conta: ");
			System.out.println("");
			System.out.println("Conta: " + numeroConta);
			System.out.println("Dono: " + nomeTitular);
			System.out.println("Saldo: R$ " + saldo);
			System.out.println("");	
		}
}