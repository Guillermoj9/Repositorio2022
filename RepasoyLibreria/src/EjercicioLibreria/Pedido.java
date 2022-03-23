package EjercicioLibreria;

import java.time.LocalDate;
import java.util.ArrayList;

public class Pedido {

	private static int incremento=1;
	private int codigo;
	
	private double total; //Calculado, no entra en el constructor
	private LocalDate fecha;
	private Cliente cliente;//Hay que pasarlo con set 
	private ArrayList<LineaPedido>lineas;
	
	/*
	 * Constructor vacio.
	 */
	public Pedido() {
		super();
		this.codigo=Pedido.incremento;
		Pedido.incremento++;
		this.fecha=LocalDate.now();
		this.lineas= new ArrayList<>();
		this.total=0;
	}
	/*
	 * Constructor copia.
	 */
	public Pedido(Cliente cliente) {
		super();
		this.codigo=Pedido.incremento;
		Pedido.incremento++;
		this.fecha=LocalDate.now();
		this.lineas= new ArrayList<>();
		this.total=0;
	}
	
	/*
	 * Devuelve el precio total, sumando cada linea pedido
	 *  descontado el descuento
	 * 
	 */
	public double total() {
		//El total se actualiza cada vez que añado una nueva LineaPedido
		//Con el metodo nuevaLinea
		return total - this.cliente.descuento();
	}
	/*
	 * 
	 */
	
	public ArrayList<LineaPedido> getLineas(){
		return this.lineas;
	}
	
	/*
	 * Si hay una linea de pedido repetida se suma.
	 */
	
	public void nuevaLinea(LineaPedido lp) {
		boolean encontrado = false;
		for (LineaPedido linea: lineas) {
			if (linea.getProducto().equals(lp.getProducto())) {
				linea.setCantidad(linea.getCantidad()+lp.getCantidad());
				encontrado = true;
				this.total += lp.subTotal();
			}
		}
		
		if (!encontrado) {
		lineas.add(lp);
		this.total += lp.subTotal();
		}
	}
	public String toString() {
		StringBuilder builder = new StringBuilder();
		builder.append("Pedido:  ");
		builder.append(codigo);
		for(LineaPedido linea:lineas) {
			builder.append("Prod : ");
			builder.append(linea.getProducto().getCodigo());
			builder.append("Precio : ");
			builder.append(linea.getProducto().getPrecio());
			builder.append("Cantidad : ");
			builder.append(linea.getCantidad());
			builder.append("SubTotal= ");
			builder.append(linea.subTotal());
			builder.append("€ \n ");
		}
		builder.append("Total=");
		builder.append(total);
		
		return builder.toString();
	}
}
