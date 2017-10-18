package br.ucsal.atividades;

public class Executor {

	public static void main(String[] args) {

		int[][] arrayFibonaci = ArrayFibonaci.criarArrayBiFibonaci();

		String[][] novoArrayFibonaci = ArrayFibonaci.addZeroEsquerda(arrayFibonaci);

		ArrayFibonaci.ImprimirArrayBidimensional(novoArrayFibonaci);


		}


		}