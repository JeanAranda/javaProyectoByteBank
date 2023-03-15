public class CrearCuenta {
	/*public static void main(String[] args) {
		Cuenta primeraCuenta = new Cuenta();
		primeraCuenta.saldo = 1000;
		System.out.println(primeraCuenta.saldo);
		
		Cuenta segundaCuenta = new Cuenta();
		segundaCuenta.saldo = 500;
		System.out.println(segundaCuenta.saldo);
		System.out.println(primeraCuenta.saldo);
		System.out.println(primeraCuenta.titular);
	}*/
	public static void main(String[] args) {

        Cuenta primeraCuenta = new Cuenta();
        primeraCuenta.saldo = 200;
        System.out.println(primeraCuenta.saldo);

        primeraCuenta.saldo += 100;
        System.out.println(primeraCuenta.saldo);

        Cuenta segundaCuenta = new Cuenta();
        segundaCuenta.saldo = 50;

        System.out.println("primera cuenta tiene " + primeraCuenta.saldo);
        segundaCuenta.saldo += 5000;
        System.out.println(primeraCuenta.agencia);
        System.out.println("segunda cuenta tiene " + segundaCuenta.saldo);
        primeraCuenta.saldo += 4750;
        System.out.println("primera cuenta tiene " + primeraCuenta.saldo);
        
        System.out.println(primeraCuenta);
		System.out.println(segundaCuenta);
		
		if (primeraCuenta.saldo == segundaCuenta.saldo) {
			System.out.println("son gemelas");
		}else {
			System.out.println("No se parecen en nada chaval");
		}
    }
}
