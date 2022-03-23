package clase;

public class CuentaCorriente {
	
	//Propiedades
	private String numero;
	private double saldo;
	
	//Contructores
	CuentaCorriente (){
		this.saldo = 0 ; 
		this.numero = CuentaCorriente.generarNumero();
		}
	public CuentaCorriente (String numero, double saldo) {
		super();
		this.numero=numero;
		this.saldo= saldo;
	}
	
	
	
/**
 * Devuelve un string con un numero de cuenta generado aleatoriamente
 * @return
 */
	public static String generarNumero() {
		//Generar un numero de cuenta aleatorio
		StringBuilder sb= new StringBuilder ("ES204005"); //Faltan 12 numeros
		for (int i=0; i<12; i++) {
			int num = (int) (Math.random()*10); //De 0 a 9
			sb.append(num);
		
		}
		return sb.toString();
	}
	
	/**
	 * Incrementa el saldo en la cantidad que se pasa como parámetro 
	 */
	public void ingreso (double cantidad) {
		this.saldo += cantidad;
		
	}
	/**
	 * Si hay suficiente saldo en la cuenta se resta la cantidad del cargo.
	 * @param cantidad
	 */
	public void cargo (double cantidad) {
		if ((this.saldo - cantidad)>= 0)
		this.saldo -= cantidad;
	}
	
	/**
	 * Traspaso cantidad de una cuenta a otra
	 * @param Otra
	 */
	public void transferencia (CuentaCorriente otra, double cantidad) {
		this.saldo -= cantidad; //Me quito yo la cantidad
		otra.setSaldo(cantidad+ otra.getSaldo());
	}
	
	@Override
	public String toString() {
		StringBuilder builder = new StringBuilder();
		builder.append("CuentaCorriente [numero=");
		builder.append(numero);
		builder.append(", saldo=");
		builder.append(saldo);
		builder.append("]");
		return builder.toString();
	}
	public double getSaldo() {
		return saldo;
	}
	public void setSaldo(double saldo) {
		this.saldo = saldo;
	}
	public String getNumero() {
		return numero;
	}

	
	
}
