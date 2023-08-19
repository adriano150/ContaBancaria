package entities;

import java.util.Scanner;

import aplication.ContaBancaria;

public class Conta_Bancaria {

	public static void main(String[] args) {
		Scanner entrada = new Scanner(System.in);
		
		ContaBancaria conta = new ContaBancaria(0, null);
		
		System.out.print("Informe o número da conta: ");
		int numeroConta = entrada.nextInt();
		conta.setNumeroConta(numeroConta);
		
		System.out.print("Informe o nome do dono da conta: ");
		String nomeTitular = entrada.next();
		conta.setNomeTitular(nomeTitular);
		
		System.out.print("Irá realizar um depósito inicial? (s/n)? ");
		char realizarDepositoInicial = entrada.next().charAt(0);
		
		switch(realizarDepositoInicial) {
		case 'S', 's':
			System.out.print("Informe o valor que você irá depositar: ");
		double valorDepositoInicial = entrada.nextDouble();
		conta.deposito(valorDepositoInicial);
		conta.atualizarDados();
		conta.menu(entrada);
		break;
		case 'n', 'N':
		conta.atualizarDados();
		conta.menu(entrada);
		default:
			break;
}
		entrada.close();
		
	}
}
