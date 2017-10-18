package br.ucsal.atividades;

import java.util.Scanner;

public class main {

	public static void main(String[] args) {

		ConversorDeTemperatura value = new ConversorDeTemperatura();

		Scanner sc = new Scanner(System.in);
		System.out.println("Digite a temperatura:");
		double temp = sc.nextDouble();
		System.out.println("Escolha uma opção:");
		System.out.println("1 - De Celsius para Kelvin\n2 - De Kelvin para Celsius\n3 - De Celsius para Fahrenheit\n4 - De Fahrenheit para Celsius\n5 - De Kelvin para Fahrenheit\n6 - De Fahrenheit para Kelvin");
		int opc = sc.nextInt();
		if(opc ==1){
			value.ck(temp);
		}else if(opc==2){
			value.kc(temp);
		}else if(opc==3){
			value.cf(temp);
		}else if(opc==4){
			value.fc(temp);
		}else if(opc==5){
			value.kf(temp);
		}else if(opc==6){
			value.fk(temp);
		}else{
			System.out.println("Error");
		}

		sc.close();

	}

}

