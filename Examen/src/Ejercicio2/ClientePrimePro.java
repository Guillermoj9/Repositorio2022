package Ejercicio2;

public class ClientePrimePro extends Cliente {
	
	public ClientePrimePro(int dni, String nombre, String email, int precioMensual) {
		super();
		this.dni = dni;
		this.nombre = nombre;
		this.email = email;
		this.precioMensual = 5;
			
		}

	@Override
	protected boolean esPro() {
		// TODO Auto-generated method stub
		return true;
	}

	public double getPrecioMensual() {
		// TODO Auto-generated method stub
		return 5;
	}

}
