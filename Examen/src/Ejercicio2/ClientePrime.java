package Ejercicio2;

public class ClientePrime extends Cliente {

	public ClientePrime(int dni, String nombre, String email, int precioMensual) {
		super();
		this.dni = dni;
		this.nombre = nombre;
		this.email = email;
		this.precioMensual = 3;
	}
	
	 protected boolean esPro() {
		// TODO Auto-generated method stub
		return false;
	}
	 
	 public double getPrecioMensual() {
		// TODO Auto-generated method stub
		return 3;
	}

}
