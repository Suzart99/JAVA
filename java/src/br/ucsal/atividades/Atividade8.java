package br.ucsal.atividades;

import java.util.Scanner;

public class Atividade8 {
	


public static void main(String[] args) {

String a = new String();
Scanner sc = new Scanner(System.in);

System.out.print("Insira o Dado: ");

a=sc.nextLine();

System.out.print("\n"+getDados(a));

}

public static String getDados(String dados){

String Dados = new String("Dado Invalido");

for(int i = 0;i<nomes.length;i++){

if(dados.equals(nomes[i])){

return"Numero: "+numeros[i]+"\nE-mails: "+emails[i];

}

}

for(int i = 0;i<numeros.length;i++){

if(dados.equals(numeros[i])){

return"Nome: "+nomes[i]+"\nE-mails: "+emails[i];

}

}

for(int i = 0;i<emails.length;i++){

if(dados.equals(emails[i])){

return"Nome: "+nomes[i]+"\nNumero: "+numeros[i];

}

}

return Dados;

}


static String nomes[] = {"Pedro Álvares Cabral", "Joaquim José da Silva Xavier", "Getúlio Dornelles Vargas", "José Bonifácio de Andrada e Silva", "Jorge Leal Amado de Faria"};
static String numeros[] = {"23222323", "43344344", "32236565", "86565567", "32212321"};
static String emails[] = {"cabral@teste.ucsal.br", "xavier@teste.ucsal.br", "vargas@teste.ucsal.br", "bonifacio@teste.ucsal.br", "jorgeamado@teste.ucsal.br"};


}

