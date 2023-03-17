
public class TestReferencia2 {
	public static void main(String[] args) {
		
		Cliente jean =  new Cliente();
		jean.nombre = "Jean";
		jean.documento = "70174400";
		jean.telefono = "945607049";
		
		Cuenta cuentaJean = new Cuenta();
		cuentaJean.agencia = 1;
		cuentaJean.titular = jean;
		
		System.out.println(cuentaJean.titular.documento);
		System.out.println(cuentaJean.titular);
		System.out.println(jean);
	}
	
	
}
