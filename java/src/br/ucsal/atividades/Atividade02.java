package br.ucsal.atividades;


import java.util.Scanner;

public class Atividade02 {

	public static void main(String[] args) {
		Scanner sc = new Scanner (System.in);
		
		System.out.println("Digite o nome do indivíduo 01");
		String nome1 = sc.next();
		System.out.println("Digite o nome do indivíduo 02");
		String nome2 = sc.next();
		System.out.println("Digite a idade de " +nome1);
		int x = sc.nextInt();
		System.out.println("Digite a idade de " +nome2);
		int y = sc.nextInt();
		
		if(x>y){
			System.out.println(nome1+ " é mais velho(a) que " +nome2);
			
		}else if(y>x){
			System.out.println(nome2+ " é mais velho(a) que " +nome1);
		}else{
			System.out.println("Os dois têm a mesma idade");
		}
		
	
		sc.close();
	}
}
