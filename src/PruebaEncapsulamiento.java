
public class PruebaEncapsulamiento {
	public static void main(String[] args) {
		Cuenta cuenta = new Cuenta();
		System.out.println("Asignar: "+cuenta);
		Cliente cliente = new Cliente();
		cliente.setNombre("Paulino"); 
		cliente.setDocumento("1516sdasdR");
		
		cuenta.setTitular(cliente);
		
		System.out.println(cliente.getNombre());
		System.out.println("Ubicacion: "+cliente);
		System.out.println(cuenta.getTitular().getNombre());
		System.out.println("Ubicacion: "+cuenta.getTitular());
	}
}
