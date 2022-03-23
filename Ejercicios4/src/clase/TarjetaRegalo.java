package clase;

public class TarjetaRegalo {
 //Propiedades
	private static int num = 0;
	private double saldo;
	private int numero;
	
	//Contructores
	TarjetaRegalo () { 
		this.saldo=0;
		TarjetaRegalo.num++;
		this.numero=TarjetaRegalo.num;
	}
	//Gasta el saldo
	public void gasta (double cantidad) {
		if ((this.saldo - cantidad)>= 0)
			this.saldo -= cantidad;
		}
	
	//Fusionar tarjeta
	public void fusionarTarjeta (TarjetaRegalo T , double cantidad) {
		this.saldo -= cantidad; //Me quito yo la cantidad
		T.setSaldo(cantidad+ T.getSaldo());
		T=null;
	}
	
	
	
	public double getSaldo() {
		return saldo;
	}
	public void setSaldo(double saldo) {
		this.saldo = saldo;
	}
	public int getNumero() {
		return numero;
	}
	public void setNumero(int numero) {
		this.numero = numero;
	}
	@Override
	public String toString() {
		StringBuilder builder = new StringBuilder();
		builder.append("TarjetaRegalo [saldo=");
		builder.append(saldo);
		builder.append(", numero=");
		builder.append(numero);
		builder.append("]");
		return builder.toString();
	}
	
}
