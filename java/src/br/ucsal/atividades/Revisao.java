package br.ucsal.atividades;

import java.util.Scanner;

public class Revisao {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int[][] array2d = new int[9][9];
		//nome(array2d);
		System.out.println("Digite um nome");
		String txt = sc.nextLine();
		nome(txt);

		

}




		public static void mat(int[][] arraybi){
			
			int i;
			int j;
			for(i=0;i<arraybi.length;i++){
				for(j=0;j<arraybi.length;j++){
					if(i==j){
						arraybi[i][j] = 1;
					}else{
						arraybi[i][j] =0;
					}
				}
			}
				for(i=0;i<arraybi.length;i++){
					for(j =0;j<arraybi.length;j++){
						System.out.print(" "+arraybi[i][j]);

					}
					System.out.println("");	
				}
		}
		public static void nome(String name){
			for(int i=0;i<name.length();i++){
			System.out.println(name.substring(5,i-1));
			}
		}
}
