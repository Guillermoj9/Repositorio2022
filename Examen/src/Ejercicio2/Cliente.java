package Ejercicio2;

import java.util.Objects;

public abstract class Cliente {
	protected int dni;
	protected String nombre;
	protected String email;
	protected int precioMensual;
	
	//Constructor con todo
	public Cliente(int dni, String nombre, String email, int precioMensual) {
		super();
		this.dni = dni;
		this.nombre = nombre;
		this.email = email;
		this.precioMensual = this.precioMensual;
	}
	//Constructor -precioMensual
	public Cliente(int dni, String nombre, String email) {
		super();
		this.dni = dni;
		this.nombre = nombre;
		this.email = email;
	}
	
	//Constructores vacio
	public Cliente() {
		super();
		this.dni = 0;
		this.nombre = "";
		this.email = "";
	}
	//Constuctor copia
	public Cliente(Cliente otro) {
		super();
		this.dni = otro.dni;
		this.nombre = otro.nombre;
		this.email = otro.email;
	}
	
	//Getters&Setters
	
	/**
	 * @return the dni
	 */
	public int getDni() {
		return dni;
	}
	/**
	 * @param dni the dni to set
	 */
	public void setDni(int dni) {
		this.dni = dni;
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
	 * @param precioMensual the precioMensual to set
	 */
	public void setPrecioMensual(int precioMensual) {
		this.precioMensual = precioMensual;
	}
	@Override
	public String toString() {
		StringBuilder builder = new StringBuilder();
		builder.append("Cliente [dni=");
		builder.append(dni);
		builder.append(", nombre=");
		builder.append(nombre);
		builder.append(", email=");
		builder.append(email);
		builder.append("]");
		return builder.toString();
	}
	@Override
	public int hashCode() {
		return Objects.hash(dni);
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
		return dni == other.dni;
	}
	
	protected abstract boolean  esPro(); {	
	}
	public abstract double getPrecioMensual();{
		}
	
	
	
}
