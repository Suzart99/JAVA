package br.ucsal.atividades;

import java.util.Scanner;

public class Atividade03 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		float salliq = 0, emp =0;
		
		System.out.println("Digite o sal�rio bruto");
		float sal = sc.nextFloat();
		System.out.println("Informe os descontos");
		float des = sc.nextFloat();
		System.out.println("Infomre o valor do poss�vel empr�stimo");
		float valor = sc.nextFloat();
		salliq = sal-des;
		emp = (float) (salliq*0.3);
	
		if(valor <= emp ){
			System.out.println("Pode fazer empr�stimo");	
		}else{
			System.out.println("N�o pode fazer empr�stimo");	
		}
		sc.close();	
	}
}
