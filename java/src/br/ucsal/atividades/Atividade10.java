package br.ucsal.atividades;

import java.util.Scanner;

public class Atividade10 {

	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		System.out.println("Digite a temperatura:");
		double temp = sc.nextDouble();
		System.out.println("Escolha uma opção:");
		System.out.println("1 - De Celsius para Kelvin\n2 - De Kelvin para Celsius\n3 - De Celsius para Fahrenheit\n4 - De Fahrenheit para Celsius\n5 - De Kelvin para Fahrenheit\n6 - De Fahrenheit para Kelvin");
		int opc = sc.nextInt();
		switch(opc){
		
		case 1:
			System.out.println("Resultado = "+ck(temp));	
		break;
		case 2:
			System.out.println("Resultado = "+kc(temp));	
		break;
		case 3:
			System.out.println("Resultado = "+cf(temp));	
		break;
		case 4:
			System.out.println("Resultado = "+fc(temp));	
		break;
		case 5:
			System.out.println("Resultado = "+kf(temp));	
		break;
		case 6:
			System.out.println("Resultado = "+fk(temp));	
		break;
		}
		
	}

	public static double ck(double c){
		double k;
		k = c+273;
		return k;
	}
	
	public static double kc(double k){
		double c;
		c = k-273;
		return c;
	}
	
	public static double cf(double c){

		double f;
		f = (1.8*c)+32;
		return f;
	}
	
	public static double fc(double f){
		double c;
		c = (f-32)/1.8;
		return c;
	}

	public static double kf(double k){
		double f;
		f = (1.8*(k-273))+32;
		return f;
	}

	public static double fk(double f){
		double k;
		k = ((f - 32)/1.8) + (273);
		return k;
	}
}
