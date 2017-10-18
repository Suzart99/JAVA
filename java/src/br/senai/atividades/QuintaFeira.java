package br.senai.atividades;

import java.util.Scanner;

public class QuintaFeira {
	public static void main(String[] args) {
		 Scanner sc = new Scanner(System.in);

		System.out.println("Digite seu nome: ");
		String x = sc.next();
		System.out.println("Digite sua idade: ");
		int idade = sc.nextInt();
		System.out.println("Você é " +x+ " e tem " +idade+ " anos");
		
		sc.close();
		
		
	}

}
