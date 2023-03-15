
public class TestReferencia {
	public static void main(String[] args) {
		Cuenta miPrimeraCuenta = new Cuenta();
		miPrimeraCuenta.saldo = 500;
		
		Cuenta miSegundaCuenta = new Cuenta();
		miSegundaCuenta.saldo =  600;
		
		System.out.println(
				"Saldo de mi primera cuenta es: "+
		miPrimeraCuenta.saldo+
				" y el saldo de mi segunda cuenta es: "+
		miSegundaCuenta.saldo);
		
		miSegundaCuenta.saldo += 500;
		
		System.out.println("saldo actual de "
				+ "mi primera cuenta: "+miPrimeraCuenta.saldo+" Saldo "
						+ "actual de mi segunda cuenta: "+miSegundaCuenta.saldo);
		
		System.out.println(miPrimeraCuenta);
		System.out.println(miSegundaCuenta);
		
		if (miPrimeraCuenta == miSegundaCuenta) {
			System.out.println("son gemelas");
		}else {
			System.out.println("No se parecen en nada chaval");
		}
	}
}
