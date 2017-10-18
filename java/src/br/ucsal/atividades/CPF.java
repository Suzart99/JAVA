package br.ucsal.atividades;

import java.util.Scanner;

public class CPF {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);

	
		System.out.println("Digite seu cpf");
		String b = sc.nextLine();
		imprimecpf(b);
	}

	public static void imprimecpf(String cpf) {
		int qtde = cpf.length();
		if (qtde == 11&&primeiroDigito(cpf)&&segundoDigito(cpf)) {
			System.out.println("CPF VALIDO");
		} else {
			System.out.println("CPF INVALIDO");
		}

	}

	public static boolean primeiroDigito(String cpf){
		int qtde = cpf.length();
		int soma=0,aux=0;
		for(int x=0, i = 10;x<qtde-2;x++,i--){
			soma += Integer.parseInt(cpf.substring(x, x+1))*i;
		}
		soma = soma % 11;

		aux = 11-soma;
		if(soma<2&&Integer.parseInt(cpf.substring(9,10))==0){
			return true;
		}else if(soma>=2&&Integer.parseInt(cpf.substring(9,10))==aux){
			return true;
		}
		return false;
	}

	public static boolean segundoDigito(String cpf){
		int qtde = cpf.length();
		int soma=0,aux=0;
		
		for(int x=0, i = 11;x<qtde-2;x++,i--){
			soma += Integer.parseInt(cpf.substring(x, x+1))*i;
		}
		soma = soma + Integer.parseInt(cpf.substring(9,10))*2;
		soma = soma + Integer.parseInt(cpf.substring(10,11))*2;
		
		soma = soma % 11;
		
		aux = 11-soma;
		if(soma<2&&Integer.parseInt(cpf.substring(10,11))==1){
			return true;
		}else if(soma>=2&&Integer.parseInt(cpf.substring(10,11))==soma){
			return true;
		}
		return false;
	}
}


