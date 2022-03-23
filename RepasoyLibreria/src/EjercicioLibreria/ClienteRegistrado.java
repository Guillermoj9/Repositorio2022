package EjercicioLibreria;

import java.time.LocalDate;
import org.apache.commons.codec.digest.DigestUtils;
public class ClienteRegistrado extends Cliente {
	
	protected String email;
	protected String password;
	protected LocalDate fechaNacimiento;
	protected LocalDate fechaRegistro;
	protected static double descuento=5;
	
	
	
	/*
	 * Tienes que cambiar Cliente * ClienteRegistrado
	 */
	
	public ClienteRegistrado(ClienteRegistrado otroCliente) {
		super(otroCliente);
		this.email=otroCliente.email;
		this.password=otroCliente.password;
		this.fechaNacimiento=otroCliente.fechaNacimiento;
		this.fechaRegistro=otroCliente.fechaRegistro;
	}



	/*
	 * Añadir todos los atributos al metodo y poner el NOW
	 */

	public ClienteRegistrado(String nombre, String apellidos, String DNI, String localidad, String direccion, String email, String password, LocalDate fechaNacimiento,
			LocalDate fechaRegistro) {
		super(nombre, apellidos, DNI, localidad, direccion);
		this.email=email;
		this.password=password;
		this.fechaNacimiento=fechaNacimiento;
		this.fechaRegistro=LocalDate.now();
	}

	/**
	 * @return the email
	 */
	public String getEmail() {
		return email;
	}

	/**
	 * @param email the email to set
	 */
	public void setEmail(String email) {
		this.email = email;
	}

	/**
	 * @return the password
	 */
	public String getPassword() {
		return password;
	}

	/**
	 * @param password the password to set
	 */
	public void setPassword(String password) {
		this.password = password;
	}

	/**
	 * @return the fechaNacimiento
	 */
	public LocalDate getFechaNacimiento() {
		return fechaNacimiento;
	}

	/**
	 * @param fechaNacimiento the fechaNacimiento to set
	 */
	public void setFechaNacimiento(LocalDate fechaNacimiento) {
		this.fechaNacimiento = fechaNacimiento;
	}

	/**
	 * @return the fechaRegistro
	 */
	public LocalDate getFechaRegistro() {
		return fechaRegistro;
	}



	/*
	 * DESCUENTO STATIC "INTERFAZ"
	 */
	public double descuento() {
		return ClienteRegistrado.descuento;
	}


	

	
	public String toString() {
		StringBuilder builder = new StringBuilder();
		builder.append("ClienteRegistrado [nombre=");
		builder.append(nombre);
		builder.append(", apellidos=");
		builder.append(apellidos);
		builder.append(", DNI=");
		builder.append(DNI);
		builder.append(", localidad=");
		builder.append(localidad);
		builder.append(", direccion=");
		builder.append(direccion);
		builder.append(", email=");
		builder.append(email);
		builder.append(", password=");
		builder.append(password);
		builder.append(", fechaNacimiento=");
		builder.append(fechaNacimiento);
		builder.append(", fechaRegistro=");
		builder.append(fechaRegistro);
		builder.append("]");
		return builder.toString();
	}



	
	
	
}
