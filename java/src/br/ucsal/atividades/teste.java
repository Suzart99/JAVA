package br.ucsal.atividades;

import java.util.Scanner;

public class teste {

				static Scanner in = new Scanner(System.in);

				static double valInicial;

				static double valreajus;

				public static void main(String[] args) {

				imprimir();

				}

				public static String[] setProduto(){
				String[] produtos = {"Papel Oficio","Lápis, Canetas e Borrachas","Grampos para Grampeadores","Detergente líquido","Sabão em Pó"};
				return produtos;
				}

				public static double[] setPreço(){

				double[] preços = {580.48, 120.23, 60.50, 125.75, 81.40};
				for(int i= 0;i<preços.length;i++){
				valInicial +=preços[i]; 
				}
				return preços;
				}

				public static double[] reajuste(double[]preços){

				double[] reajustados = new double[5];

				for(int i=0;i<reajustados.length;i++){

				if(preços[i]>=100){

				reajustados[i] =preços[i]+preços[i]*0.253;

				}else{

				reajustados[i] =preços[i]+preços[i]*0.325;

				}

				valreajus +=reajustados[i]; 

				}

				return reajustados;

				}

				public static double perReajus(){

				return ((valreajus-valInicial)/valInicial)*100;

				}

				public static double valReajus(){

				return valreajus-valInicial;

				}

				public static void imprimir(){

				String[]produtos = setProduto();

				System.out.println();

				double[]preços = setPreço();

				double[]preçosRea = reajuste(preços);

				System.out.println("\nValores Iniciais:");

				for(int i = 0;i<preços.length;i++){

				System.out.println(produtos[i]+" = R$ "+preços[i]);

				}

				System.out.println("----- Valor Total: R$ "+valInicial);

				System.out.println("\nValores Reajustados:");

				for(int i = 0;i<preçosRea.length;i++){

				System.out.println(produtos[i]+" = R$ "+preçosRea[i]);

				}

				System.out.println("----- Valor Total: R$ "+valreajus);

				System.out.println("\nPercentual de reajuste dos valores: "+perReajus()+"%");

				System.out.println("\nDiferença sobre as vendas: R$ "+valReajus());

				}
		}
	

