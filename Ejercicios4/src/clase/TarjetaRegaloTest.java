package clase;

public class TarjetaRegaloTest {

	public static void main(String[] args) {
		TarjetaRegalo tr1 = new TarjetaRegalo ();
		
		tr1.setSaldo(125);
		tr1.gasta(100);
		System.out.println(tr1);
		
		TarjetaRegalo tr2 = new TarjetaRegalo ();
		
		tr2.fusionarTarjeta(tr1, 100);
		System.out.println(tr1);
		System.out.println(tr2);
	}

}
