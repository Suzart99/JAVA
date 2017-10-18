package br.ucsal.atividades;


import java.util.Random;
import java.util.Scanner;
public class Atividade05 {

	public static void main(String[] args) {
		
		Scanner value = new Scanner(System.in);
		int n1, n2, n3, n4;
		Random alea = new Random();
		n1 = alea.nextInt(99);
		System.out.println(n1);
		alea = new Random();
		n2 = alea.nextInt(99);
		System.out.println(n2);
		alea = new Random();
		n3 = alea.nextInt(99);
		System.out.println(n3);
		alea = new Random();
		n4 = alea.nextInt(99);
		System.out.println(n4);
		value.close();
		System.out.println("Decrescente: ");
		//decrescente

		for(int i = 99; i >= 0; i--){
			if(i == n1){
				System.out.println(n1);
			}else if(i == n2){
				System.out.println(n2);
			}else if(i == n3){
				System.out.println(n3);
			}else if(i == n4){
				System.out.println(n4);
			}
		}
		//crescente
		System.out.println("Crescente: ");
		for(int i = 0; i <= 99; i++){
			if(i == n1){
				System.out.println(n1);
			}else if(i == n2){
				System.out.println(n2);
			}else if(i == n3){
				System.out.println(n3);
			}else if(i == n4){
				System.out.println(n4);
			}
		}
	}
}
