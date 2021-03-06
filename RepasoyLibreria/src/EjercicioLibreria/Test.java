package EjercicioLibreria;

import java.time.LocalDate;

public class Test {
	
	public static void main(String[]args) {
		
		Categoria moviles = new Categoria("moviles");
		Categoria perif = new Categoria("Perifericos");
		Producto p1 = new Producto("Iphone 13s","Telefono apple",moviles,900,1.21);
		Producto p2 = new Producto ("Raton logitech","Raton gaming",perif,50,1.21);
		Producto p3 = new Producto ("MandoPS5","MandoConsola",perif,100,1.21);
		
		ClienteRegistrado cr1= new ClienteRegistrado("Javier","Ayuda","2131232F","Cuevas","Casa","guillejp98@gmail.com","12312321",LocalDate.of(1990, 10, 10), null);
		Pedido ped1= new Pedido(cr1);
		ped1.nuevaLinea(new LineaPedido(p1,1));
		ped1.nuevaLinea(new LineaPedido(p2,1));
		
		System.out.println(ped1);
		
		ClienteNoRegistrado cnr1 = new ClienteNoRegistrado("Guille","Sanchez","123123F","Vera","Casa");
		Pedido ped2=new Pedido (cnr1);
		ped2.nuevaLinea(new LineaPedido(p2,1));
		ped2.nuevaLinea(new LineaPedido(p3,2));
		
		System.out.println(ped2);
	}
}
