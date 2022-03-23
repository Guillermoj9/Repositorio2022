package Tema2;

public class Ejercicio27 {
	public static int reves1(int num) {
		int resultado1=0;
		int n1=num/100;
		int n2= (num-(n1*100))/10;
		int n3= (num-(n1*100)-(n2*10));
		resultado1= n1+(n2*10)+(n3*100);
		return resultado1;
	}		
	public static int reves(int num) {
		int resultado=0;
		int n1=num/1000;
		int n2= (num-(n1*1000))/100;
		int n3= (num-(n1*1000)-(n2*100))/10;
		int n4= (num-(n1*1000)-(n2*100)-(n3*10));
		resultado= n1+(n2*10)+(n3*100)+(n4*1000);
		return resultado;
	}
	public static void main(String[] args) {
		
		
		System.out.println("Resultado:"+reves(8989));
	}

}
