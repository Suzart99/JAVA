package br.ucsal.atividades;

import java.util.Arrays;
import java.util.Scanner;

public class Solucao  {

Scanner sc = new Scanner(System.in);
int cont = 0;

public void imprimirOrdem(String[] nome){
Arrays.sort(nome);
for(int i = 0; i < nome.length; i++){

System.out.println(nome[i]);

}

}

public void dados(String[] nome, int qnome) {
	for(int i = 0; i < nome.length; i++){
		System.out.println("Digite o " + (i+1) + " nome!");
		nome[i] = sc.nextLine();
		}
		}

}
