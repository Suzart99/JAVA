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
				String[] produtos = {"Papel Oficio","L�pis, Canetas e Borrachas","Grampos para Grampeadores","Detergente l�quido","Sab�o em P�"};
				return produtos;
				}

				public static double[] setPre�o(){

				double[] pre�os = {580.48, 120.23, 60.50, 125.75, 81.40};
				for(int i= 0;i<pre�os.length;i++){
				valInicial +=pre�os[i]; 
				}
				return pre�os;
				}

				public static double[] reajuste(double[]pre�os){

				double[] reajustados = new double[5];

				for(int i=0;i<reajustados.length;i++){

				if(pre�os[i]>=100){

				reajustados[i] =pre�os[i]+pre�os[i]*0.253;

				}else{

				reajustados[i] =pre�os[i]+pre�os[i]*0.325;

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

				double[]pre�os = setPre�o();

				double[]pre�osRea = reajuste(pre�os);

				System.out.println("\nValores Iniciais:");

				for(int i = 0;i<pre�os.length;i++){

				System.out.println(produtos[i]+" = R$ "+pre�os[i]);

				}

				System.out.println("----- Valor Total: R$ "+valInicial);

				System.out.println("\nValores Reajustados:");

				for(int i = 0;i<pre�osRea.length;i++){

				System.out.println(produtos[i]+" = R$ "+pre�osRea[i]);

				}

				System.out.println("----- Valor Total: R$ "+valreajus);

				System.out.println("\nPercentual de reajuste dos valores: "+perReajus()+"%");

				System.out.println("\nDiferen�a sobre as vendas: R$ "+valReajus());

				}
		}
	

