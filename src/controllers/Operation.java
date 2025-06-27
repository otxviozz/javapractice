package controllers;

import java.util.Scanner;
import entities.Account;

public class Operation {

	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		
		Account c = new Account();
		
		System.out.println("Sistema de Gerência de finanças.");
		System.out.println("Realização de cadastro.");
		
		while (true) {
            try {
                System.out.println("Digite um número que será o ID da sua conta: ");
                String idStr = scan.nextLine();
                int id = Integer.parseInt(idStr);
                c.setAccountNumber(String.valueOf(id));
                break;
            } catch (NumberFormatException e) {
                System.out.println("ID inválido. Digite apenas números inteiros.");
            }
        }
		
		System.out.println("Digite o seu nome:");
		c.setOwner(scan.nextLine());
		
		
		while (true) {
            try {
                System.out.println("Digite o seu saldo inicial:");
                String saldoStr = scan.nextLine();
                double saldo = Double.parseDouble(saldoStr);
                c.setBalance(saldo);
                break;
            } catch (NumberFormatException e) {
                System.out.println("Saldo inválido. Digite um valor numérico, ex.: 1000.50");
            }
        }
		
		System.out.println("Cadastro finalizado com sucesso!");
		
		while(true) {
			System.out.println("Sistema de Gerência de finanças.");
			System.out.println("1. Dados gerais da conta.");
			System.out.println("2. Dados - ID da conta.");
			System.out.println("3. Dados - Nome do titular.");
			System.out.println("4. Dados - Saldo em conta.");
			System.out.println("5. Mudar dados da conta.");
			System.out.println("6. Fazer saque/depósito.");
			System.out.println("7. Sair.\n");
			System.out.println("Digite uma opção: ");
			
		}
		
	}

}
