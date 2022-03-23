package EjercicioLibreria;

import java.util.Objects;


public abstract class Cliente implements Descontable {

	protected String nombre;
	protected String apellidos;
	protected String DNI;
	protected String localidad;
	protected String direccion;

	
	
	//Constructores
	public Cliente(String nombre, String apellidos, String dNI, String localidad, String direccion) {
		super();
		this.nombre = nombre;
		this.apellidos = apellidos;
		this.DNI = DNI;
		this.localidad = localidad;
		this.direccion = direccion;
	}
	
	//Constructor copia
	public Cliente(Cliente otroCliente) {
		this.nombre = otroCliente.nombre;
		this.apellidos = otroCliente.apellidos;
		this.DNI = otroCliente.DNI;
		this.localidad = otroCliente.localidad;
		this.direccion = otroCliente.direccion;
	}

	

	/**
	 * @return the nombre
	 */
	public String getNombre() {
		return nombre;
	}





	/**
	 * @param nombre the nombre to set
	 */
	public void setNombre(String nombre) {
		this.nombre = nombre;
	}





	/**
	 * @return the apellidos
	 */
	public String getApellidos() {
		return apellidos;
	}





	/**
	 * @param apellidos the apellidos to set
	 */
	public void setApellidos(String apellidos) {
		this.apellidos = apellidos;
	}





	/**
	 * @return the dNI
	 */
	public String getDNI() {
		return DNI;
	}





	/**
	 * @param dNI the dNI to set
	 */
	public void setDNI(String DNI) {
		DNI = DNI;
	}





	/**
	 * @return the localidad
	 */
	public String getLocalidad() {
		return localidad;
	}





	/**
	 * @param localidad the localidad to set
	 */
	public void setLocalidad(String localidad) {
		this.localidad = localidad;
	}





	/**
	 * @return the direccion
	 */
	public String getDireccion() {
		return direccion;
	}





	/**
	 * @param direccion the direccion to set
	 */
	public void setDireccion(String direccion) {
		this.direccion = direccion;
	}


	@Override
	public String toString() {
		StringBuilder builder = new StringBuilder();
		builder.append("Cliente [nombre=");
		builder.append(nombre);
		builder.append(", apellidos=");
		builder.append(apellidos);
		builder.append(", DNI=");
		builder.append(DNI);
		builder.append(", localidad=");
		builder.append(localidad);
		builder.append(", direccion=");
		builder.append(direccion);
		builder.append("]");
		return builder.toString();
	}


	@Override
	public int hashCode() {
		return Objects.hash(DNI);
	}

	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		if (getClass() != obj.getClass())
			return false;
		Cliente other = (Cliente) obj;
		return Objects.equals(DNI, other.DNI);
	}

	public double descuento() {
		// TODO Auto-generated method stub
		return 0;
	}

}
