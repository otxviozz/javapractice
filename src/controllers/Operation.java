package controllers;

import java.util.Scanner;
import entities.Account;

public class Operation {

	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		
		Account c = new Account();
		
		System.out.println("Sistema de Gerência de finanças.");
		System.out.println("Realização de cadastro.");
		System.out.println("Digite um número que será o ID da sua conta: ");
		c.setAccountNumber(scan.nextLine());
		System.out.println("Digite o seu nome:");
		c.setOwner(scan.nextLine());
		System.out.println("Digite o seu saldo inicial:");
		c.setBalance(scan.nextInt());
		
		System.out.println("Cadastro finalizado com sucesso!");
		
		while(true) {
			System.out.println("Sistema de Gerência de finanças.");
		}

	}

}
