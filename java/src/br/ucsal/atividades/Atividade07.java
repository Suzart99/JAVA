package br.ucsal.atividades;
public class Atividade07 {

	public static void main(String[] args) {

		int arrayUnidmensionalPares[] = CriarArrayUnidmensionalPar();

		ImprimirArrayUnidmensional(arrayUnidmensionalPares);

		float media = MediaAritimeticaArrayUnidmensional(arrayUnidmensionalPares);

		float arrayBidimensional[][] = CriarArrayBidimensional(media);

		ImprimirArrayBidimensional(arrayBidimensional);

	}
	
	
	public static int[] CriarArrayUnidmensionalPar(){

		int array[] = new int[9];

		int i = 0, j = 1;

		while (i < array.length) {

		if(j % 2 == 0){

		array[i] = j;

		i++;

		}

		j++;

		}

		return array;

		}

		public static void ImprimirArrayUnidmensional(int array[]){

		System.out.println("Array Unidmensional criado:");

		for (int i = 0; i < array.length; i++) {

		System.out.println("> " + array[i]);

		}

		}

		public static float MediaAritimeticaArrayUnidmensional(int arrayUni[]){

		float media = 0f;

		for (int i = 0; i < arrayUni.length; i++) {

		media += arrayUni[i];

		}

		media = media/arrayUni.length;

		return media;

		}

		public static float[][] CriarArrayBidimensional(float media){

		float arrayBidimensional[][] = new float[7][6];

		int cont = 1;

		for (int i = 0; i < arrayBidimensional.length; i++) {

		for (int j = 0; j < arrayBidimensional[i].length; j++) {

		arrayBidimensional[i][j] = media*cont;

		cont++;

		}

		}

		return arrayBidimensional;

		}

		public static void ImprimirArrayBidimensional(float arrayBi[][]){

		System.out.println("\n\nArray Bidimensional\n");

		for (int i = 0; i < arrayBi.length; i++) {

		for (int j = 0; j < arrayBi[i].length; j++) {

		System.out.print("("+i+","+j+")");

		System.out.print(arrayBi[i][j] < 100? "  ": " ");

		System.out.print(arrayBi[i][j] + "\t");

		}

		System.out.println();

		}

		}

		


	
		


		
}
