
public class PruebaConstructor {
	public static void main(String[] args) {
		Cuenta cuenta = new Cuenta(1000);
		Cuenta cuentaA1 = new Cuenta(-10);
		Cuenta cuentaA2 = new Cuenta(6000);
		
		System.out.println("El total de cuentas es: "
				+Cuenta.getTotal());
	}
}
