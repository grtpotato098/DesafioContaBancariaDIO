package application;

import java.util.Scanner;

import entities.ContaTerminal;

public class Program {

	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		
		System.out.println("Por favor, digite o número da agência:");
		String agencia = input.nextLine();
		System.out.println("Por favor, digite o número da conta:");
		int numero = input.nextInt();
		input.nextLine();
		System.out.println("Por favor, digite o seu nome completo:");
		String nomeCliente = input.nextLine();
		System.out.println("Saldo:");
		double saldo = input.nextDouble();
		
		ContaTerminal conta = new ContaTerminal(numero, agencia, nomeCliente, saldo);
		
		System.out.println(conta);
		
		input.close();
	}

}
