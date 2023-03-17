
public class TestReferencia3 {
	public static void main(String[] args) {
		Cuenta cuenta5 = new Cuenta();
		Cliente cliente = new Cliente();
		cuenta5.titular = cliente;
		
		
		
		System.out.println(cuenta5.titular.nombre);
	}
}
