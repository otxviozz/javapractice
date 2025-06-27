package controllers;

import java.util.Scanner;

import entities.Account;
import services.OperationService;
import ui.SignIn;

public class Operation {

	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
        Account c = new Account();
        OperationService service = new OperationService();
        SignIn signIn = new SignIn();

        signIn.signIn(scan, c);
		service.showMenu(scan, c);
		
	}
}
