package br.ucsal.atividades;

import java.util.Scanner;

public class Atividade01 {

	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		
		System.out.println("Digite a nota");
		float x = sc.nextFloat();
		
		if(x<=2.99){
			System.out.println("Reprovado");	
		}else if(x>=6 && x<=10){
			System.out.println("Aprovado");
		} else if(x>=3 && x<=5.99){
			System.out.println("Prova Final");
		}else {
			System.out.println("Nota Inválida");
		}
		
		sc.close();
		
		
	}

}
