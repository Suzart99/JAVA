package br.ucsal.atividades;

import java.util.Scanner;

public class Atividade03 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		float salliq = 0, emp =0;
		
		System.out.println("Digite o salário bruto");
		float sal = sc.nextFloat();
		System.out.println("Informe os descontos");
		float des = sc.nextFloat();
		System.out.println("Infomre o valor do possível empréstimo");
		float valor = sc.nextFloat();
		salliq = sal-des;
		emp = (float) (salliq*0.3);
	
		if(valor <= emp ){
			System.out.println("Pode fazer empréstimo");	
		}else{
			System.out.println("Não pode fazer empréstimo");	
		}
		sc.close();	
	}
}
