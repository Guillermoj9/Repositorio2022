package EjercicioLibreria;

import java.util.Objects;

public class LineaPedido {
	private Producto producto;
	private int cantidad;
	

	public LineaPedido(Producto producto, int cantidad) {
		super();
		this.producto = producto;
		this.cantidad = cantidad;
	}
	
	
	/**
	 * @return the producto
	 */
	public Producto getProducto() {
		return producto;
	}


	/**
	 * @param producto the producto to set
	 */
	public void setProducto(Producto producto) {
		this.producto = producto;
	}


	/**
	 * @return the cantidad
	 */
	public int getCantidad() {
		return cantidad;
	}


	/**
	 * @param cantidad the cantidad to set
	 */
	public void setCantidad(int cantidad) {
		this.cantidad = cantidad;
	}


	public double subTotal() {
		return this.producto.getPrecio()*this.cantidad*this.producto.getIva();
	}


	@Override
	public int hashCode() {
		return Objects.hash(producto);
	}


	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		if (getClass() != obj.getClass())
			return false;
		LineaPedido other = (LineaPedido) obj;
		return Objects.equals(producto, other.producto);
	}
	
}
