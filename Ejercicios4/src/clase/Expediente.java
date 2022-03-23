package clase;

import java.time.LocalDate;
import java.util.ArrayList;
import java.util.Objects;

public class Expediente {
	
	//Tipo enum definido para mi clase 
	enum Modalidad{FPB,GRADOMEDIO,GRADOSUPERIOR};
	
	//Propiedades
	
	private static int totalAlumnado=0;
	private final int id=Expediente.totalAlumnado+1;
	private String nombre;
	private String apellidos;
	private char sexo;
	private LocalDate fechaNacimiento;
	private Modalidad modalidad;
	private int curso;
	private ArrayList <NotasCurso> notas;
	
	//Constructores
	Expediente (String nombre, String apellidos, LocalDate fechaNacimiento, int curso) {
		Expediente.totalAlumnado = Expediente.totalAlumnado+1;
		this.nombre=nombre;
		this.apellidos=apellidos;
		this.fechaNacimiento=fechaNacimiento;
		this.curso=curso;
		//Inicializar ArrayList
		this.notas= new ArrayList<>();
	}
	
	public int getID () {
		return this.id;
	}
	
	public int getEdad() {
		return LocalDate.now() .getYear() - this.fechaNacimiento.getYear();
		}
	//public boolean mayorEdad () {
		
	//}

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
	 * @return the sexo
	 */
	public char getSexo() {
		return sexo;
	}

	/**
	 * @param sexo the sexo to set
	 */
	public void setSexo(char sexo) {
		this.sexo = sexo;
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
	 * @return the modalidad
	 */
	public Modalidad getModalidad() {
		return modalidad;
	}

	/**
	 * @param modalidad the modalidad to set
	 */
	public void setModalidad(Modalidad modalidad) {
		this.modalidad = modalidad;
	}

	/**
	 * @return the curso
	 */
	public int getCurso() {
		return curso;
	}

	/**
	 * @param curso the curso to set
	 */
	public void setCurso(int curso) {
		this.curso = curso;
	}

	/**
	 * @return the totalAlumnado
	 */
	public static int getTotalAlumnado() {
		return totalAlumnado;
	}

	/**
	 * @return the id
	 */
	public int getId() {
		return id;
	}

	/**
	 * @return the notas
	 */
	public ArrayList<NotasCurso> getNotas() {
		return notas;
	}

	@Override
	public String toString() {
		StringBuilder builder = new StringBuilder();
		builder.append("Expediente [id=");
		builder.append(id);
		builder.append(", nombre=");
		builder.append(nombre);
		builder.append(", apellidos=");
		builder.append(apellidos);
		builder.append(", sexo=");
		builder.append(sexo);
		builder.append(", fechaNacimiento=");
		builder.append(fechaNacimiento);
		builder.append(", modalidad=");
		builder.append(modalidad);
		builder.append(", curso=");
		builder.append(curso);
		builder.append(", notas=");
		builder.append(notas);
		builder.append("]");
		return builder.toString();
	}

	@Override
	public int hashCode() {
		return Objects.hash(apellidos, nombre);
	}

	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		if (getClass() != obj.getClass())
			return false;
		Expediente other = (Expediente) obj;
		return Objects.equals(apellidos, other.apellidos) && Objects.equals(nombre, other.nombre);
	}
	
	
	
}
