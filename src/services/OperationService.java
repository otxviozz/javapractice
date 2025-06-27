package services;

import java.util.Scanner;
import entities.Account;

public class OperationService {

    public void showMenu(Scanner scan, Account c) {
        while (true) {
            System.out.println("\n=============================");
            System.out.println("Sistema de Gerência de finanças.");
            System.out.println("1. Dados gerais da conta.");
            System.out.println("2. Dados - ID da conta.");
            System.out.println("3. Dados - Nome do titular.");
            System.out.println("4. Dados - Saldo em conta.");
            System.out.println("5. Mudar dados da conta.");
            System.out.println("6. Fazer saque/depósito.");
            System.out.println("7. Sair.");
            System.out.print("Digite uma opção: ");

            String opcao = scan.nextLine();

            switch (opcao) {
                case "1": {
                    showAllData(c);
                    break;
                }
                case "2": {
                    System.out.println("ID da Conta: " + c.getAccountNumber());
                    break;
                }
                case "3": {
                    System.out.println("Titular da conta: " + c.getOwner());
                    break;
                }
                case "4": {
                    System.out.println("Saldo da conta: " + c.getBalance());
                    break;
                }
                case "5": {
                    changeAccountData(scan, c);
                    break;
                }
                case "6": {
                    transaction(scan, c);
                    break;
                }
                case "7": {
                    System.out.println("Encerrando o sistema.");
                    System.exit(0);
                    break;
                }
                default: {
                    System.out.println("Opção inválida.");
                }
            }
        }
    }

    private void showAllData(Account c) {
        System.out.println("--- Dados gerais ---");
        System.out.println("ID da Conta: " + c.getAccountNumber());
        System.out.println("Titular: " + c.getOwner());
        System.out.println("Saldo: " + c.getBalance());
    }

    private void changeAccountData(Scanner scan, Account c) {
        System.out.println("=== Alteração de dados ===");
        System.out.print("Digite novo ID da conta: ");
        c.setAccountNumber(scan.nextLine());

        System.out.print("Digite novo nome do titular: ");
        c.setOwner(scan.nextLine());

        System.out.print("Digite novo saldo: ");
        while (true) {
            try {
                String saldoStr = scan.nextLine();
                double saldo = Double.parseDouble(saldoStr);
                c.setBalance(saldo);
                break;
            } catch (NumberFormatException e) {
                System.out.println("Saldo inválido. Digite um valor numérico.");
            }
        }

        System.out.println("Dados atualizados com sucesso!");
    }

    private void transaction(Scanner scan, Account c) {
        System.out.println("=== Operações ===");

        String operacao = "";
        while (true) {
            System.out.println("1. Saque");
            System.out.println("2. Depósito");
            System.out.print("Escolha a operação: ");
            operacao = scan.nextLine().trim();

            if (operacao.equals("1") || operacao.equals("2")) {
                break;
            } else {
                System.out.println("Opção inválida. Digite 1 ou 2.");
            }
        }

        double valor = 0;
        while (true) {
            System.out.print("Digite o valor: ");
            try {
                String valorStr = scan.nextLine();
                valor = Double.parseDouble(valorStr);
                if (valor < 0) {
                    System.out.println("O valor não pode ser negativo. Digite novamente.");
                } else {
                    break;
                }
            } catch (NumberFormatException e) {
                System.out.println("Valor inválido. Digite um número.");
            }
        }

        if (operacao.equals("1")) {
            if (valor > c.getBalance()) {
                System.out.println("Saldo insuficiente!");
            } else {
                c.setBalance(c.getBalance() - valor);
                System.out.println("Saque realizado. Novo saldo: " + c.getBalance());
            }
        } else {
            c.setBalance(c.getBalance() + valor);
            System.out.println("Depósito realizado. Novo saldo: " + c.getBalance());
        }
    }
}