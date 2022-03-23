package EjercicioLibreria;

public class ClienteNoRegistrado extends Cliente {
	
	public ClienteNoRegistrado(Cliente otroCliente) {
		super(otroCliente);
		// TODO Auto-generated constructor stub
	}

	public ClienteNoRegistrado(String nombre, String apellidos, String DNI, String localidad, String direccion) {
		super(nombre, apellidos, DNI, localidad, direccion);
		// TODO Auto-generated constructor stub
	}

	public double descuento() {
		// TODO Auto-generated method stub
		return 0;
	}
}
