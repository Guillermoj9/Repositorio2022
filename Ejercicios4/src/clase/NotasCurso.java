package clase;

import java.util.Objects;

public class NotasCurso {
	
	private String Materia;
	private int curso;
	private double nota1EV;
	private double nota2EV;
	private double nota3EV;
	private double notaFinal;
	
	
	
	public NotasCurso(String materia,int curso) {
		super();
		this.Materia=materia;
		this.curso=curso;
	}



	public NotasCurso(String materia, int curso, double nota1ev, double nota2ev, double nota3ev) {
		super();
		Materia = materia;
		this.curso = curso;
		this.nota1EV = nota1ev;
		this.nota2EV = nota2ev;
		this.nota3EV = nota3ev;
	}



	@Override
	public String toString() {
		StringBuilder builder = new StringBuilder();
		builder.append("NotasCurso [Materia=");
		builder.append(Materia);
		builder.append(", curso=");
		builder.append(curso);
		builder.append(", nota1EV=");
		builder.append(nota1EV);
		builder.append(", nota2EV=");
		builder.append(nota2EV);
		builder.append(", nota3EV=");
		builder.append(nota3EV);
		builder.append(", notaFinal=");
		builder.append(notaFinal);
		builder.append("]");
		return builder.toString();
	}



	@Override
	public int hashCode() {
		return Objects.hash(Materia, curso, nota1EV, nota2EV, nota3EV);
	}



	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		if (getClass() != obj.getClass())
			return false;
		NotasCurso other = (NotasCurso) obj;
		return Objects.equals(Materia, other.Materia) && curso == other.curso
				&& Double.doubleToLongBits(nota1EV) == Double.doubleToLongBits(other.nota1EV)
				&& Double.doubleToLongBits(nota2EV) == Double.doubleToLongBits(other.nota2EV)
				&& Double.doubleToLongBits(nota3EV) == Double.doubleToLongBits(other.nota3EV);
	}



	/**
	 * @return the materia
	 */
	public String getMateria() {
		return Materia;
	}



	/**
	 * @param materia the materia to set
	 */
	public void setMateria(String materia) {
		Materia = materia;
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
	 * @return the nota1EV
	 */
	public double getNota1EV() {
		return nota1EV;
	}



	/**
	 * @param nota1ev the nota1EV to set
	 */
	public void setNota1EV(double nota1ev) {
		nota1EV = nota1ev;
	}



	/**
	 * @return the nota2EV
	 */
	public double getNota2EV() {
		return nota2EV;
	}



	/**
	 * @param nota2ev the nota2EV to set
	 */
	public void setNota2EV(double nota2ev) {
		nota2EV = nota2ev;
	}



	/**
	 * @return the nota3EV
	 */
	public double getNota3EV() {
		return nota3EV;
	}



	/**
	 * @param nota3ev the nota3EV to set
	 */
	public void setNota3EV(double nota3ev) {
		nota3EV = nota3ev;
	}



	/**
	 * @return the notaFinal
	 */
	public double getNotaFinal() {
		this.calcularNotaFinal(); //Devuelve la nota final respecto a los valores actuales de la nota. 
		return notaFinal;
	}
	
	
	/**
	 * Devuelve true si la nota es igual o mayor a 5, false en caso contrario
	 * @return
	 */
	public boolean aprobado () {
		return (this.notaFinal >=5);
		
	}
	
	public void calcularNotaFinal() {
		this.notaFinal= (this.nota1EV+this.nota2EV+this.nota3EV)/3;
	}
}
