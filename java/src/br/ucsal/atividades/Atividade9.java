package br.ucsal.atividades;

public class Atividade9 {

	public static void main(String[] args) {
		String nome1[] = {"Papel Oficio","Lápis, Canetas e Borrachas","Grampos para Grampeadores","Detergente líquido","Sabão em Pó"};
		double valo[] = {580.48, 120.23, 60.50, 125.75, 81.40};
		reaj(valo);
		imprime(nome1, valo, reaj(valo));
	}
	
	public static void produto(){
		String p[] = {"Papel Oficio"," Lápis, Canetas e Borrachas","Grampos para Grampeadores","Detergente líquido","Sabão em Pó"};
	}
	
	public static void valor(){
		double v[] = {580.48, 120.23, 60.50, 125.75, 81.40};
		
	}

	public static v[] reaj(double[] v){
		double x[] = new double[5];
		double tot = 0;
		int i=0;
		for(i=0;i<5;i++){
			if(v[i]>=100){
				x[i] = v[i]*0.253 + (v[i]);
				tot += x[i];
			}else{
				x[i] = v[i]*0.325 + (v[i]);
				tot += x[i];
			}
		}
			
		
		return x;		
}



	public static void imprime(String[] p,double[] v, double[] x){
		for(int i =0;i<5;i++){
			System.out.println(p[i]);
			System.out.println("Valor Inicial: R$"+ v[i]);
			System.out.println("Valor de Reajuste: R$" + x[i]+"\n");
		}
		
	}
}