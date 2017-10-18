package br.ucsal.atividades;

public class ConversorDeTemperatura {

	public double ck(double c){
		double k;
		k = c+273;
		System.out.println("Resultado = " +k);
		return k;
	}
	
	public double kc(double k){
		double c;
		c = k-273;
		System.out.println("Resultado = " +c);
		return c;
	}
	
	public double cf(double c){

		double f;
		f = (1.8*c)+32;
		System.out.println("Resultado = " +f);
		return f;
	}
	
	public  double fc(double f){
		double c;
		c = (f-32)/1.8;
		System.out.println("Resultado = " +c);
		return c;
	}

	public double kf(double k){
		double f;
		f = (1.8*(k-273))+32;
		System.out.println("Resultado = " +f);
		return f;
	}

	public double fk(double f){
		double k;
		k = ((f - 32)/1.8) + (273);
		System.out.println("Resultado = " +k);
		return k;
	}
	
	
	
}
