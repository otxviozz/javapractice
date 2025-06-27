package ui;

import java.util.Scanner;
import entities.Account;

public class SignIn {
	public void signIn(Scanner scan, Account c) {
        System.out.println("Sistema de Gerência de finanças.");
        System.out.println("Realização de cadastro.");

        c.setAccountNumber(readAccountId(scan));
        c.setOwner(readOwner(scan));
        c.setBalance(readBalance(scan));

        System.out.println("\nCadastro realizado com sucesso!");
    }
	
	private String readAccountId(Scanner scan) {
                System.out.println("Digite números ou letras que serão o ID da sua conta: ");
                return scan.nextLine();     
	}
	
	private String readOwner(Scanner scan) {
        System.out.println("Digite o seu nome:");
        return scan.nextLine();
    }
	
	private double readBalance(Scanner scan) {
		while (true) {
            try {
                System.out.println("Digite o seu saldo inicial:");
                String saldoStr = scan.nextLine();
                double saldo = Double.parseDouble(saldoStr);
                return saldo;
            } catch (NumberFormatException e) {
                System.out.println("Saldo inválido. Digite um valor numérico, ex.: 1000.50");
            }
        }
	}
}
