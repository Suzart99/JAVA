package br.ucsal.atividades;

public class ArrayFibonaci {
	
	public static void main(String[] args) {

		int[][] arrayFibonaci = ArrayFibonaci.criarArrayBiFibonaci();
		String[][] novoArrayFibonaci = ArrayFibonaci.addZeroEsquerda(arrayFibonaci);
		ArrayFibonaci.ImprimirArrayBidimensional(novoArrayFibonaci);


		}

public static int[][] criarArrayBiFibonaci(){
int p = 0, s = 1, aux;
int[][] arrayFibonaci = new int[5][8];

for (int i = 0; i < arrayFibonaci.length; i++) {
for (int j = 0; j < arrayFibonaci[i].length; j++) {
arrayFibonaci[i][j] = s;
aux = s;
s+=p;
p=aux;
}

}

return arrayFibonaci;

}

private static int contDigitosInteiro(int numeroFibonaci){

int cont = 0;

while (numeroFibonaci >= 1) {

numeroFibonaci = numeroFibonaci/10;

cont++;

}

return cont;

}

public static String[][] addZeroEsquerda(int[][] arrayFibonaci){

String[][] novoArrayFibonaci = new String[5][8];

String zeros = "";

for (int i = 0; i < arrayFibonaci.length; i++) {

for (int j = 0; j < arrayFibonaci[i].length; j++) {

for (int j2 = 0; j2 < 9 - contDigitosInteiro(arrayFibonaci[i][j]); j2++) zeros += "0";

novoArrayFibonaci[i][j] = zeros + arrayFibonaci[i][j];

zeros = "";

}

}

return novoArrayFibonaci;

}

public static void ImprimirArrayBidimensional(String[][] arrayFibonaci){

for (int i = 0; i < arrayFibonaci.length; i++) {

for (int j = 0; j < arrayFibonaci[i].length; j++) {

System.out.print(arrayFibonaci[i][j] + "|");

}

System.out.println();

}

}

}