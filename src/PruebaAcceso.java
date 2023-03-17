
public class PruebaAcceso {
	public static void main(String[] args) {
		Cuenta cuenta = new Cuenta();
		cuenta.depositar(54230);
		System.out.println("Su saldo actual es de: "+cuenta.getSaldo());
		cuenta.setAgencia(-22);
		cuenta.retirar(300);
		System.out.println("Su saldo actual es de: "+cuenta.getSaldo());
		System.out.println("Su agencia actual es : "+cuenta.getAgencia());
		
		}
}
