import java.lang.reflect.AnnotatedArrayType;

public class PruebaMetodos {
	public static void main(String[] args) {
		Cuenta jpCuenta = new Cuenta();
		jpCuenta.titular = "Jean Pierre Aranda"; 
		//saldo actual
		jpCuenta.saldo = 1000;
		System.out.println("Bienvenido "+jpCuenta.titular+" su cuenta fue aperturada con exito y su saldo de apertura es:");
		System.out.println(jpCuenta.saldo);
		//deposito
		jpCuenta.depositar(10300);
		System.out.println(jpCuenta.titular+" Depositaste a tu cuenta"
				);
		System.out.println(jpCuenta.titular+" su saldo actual es: "+jpCuenta.saldo);
		//retiro
		System.out.println(jpCuenta.titular+" Retiraste de tu cuenta:");
		jpCuenta.retirar(500);
		//saldo actual		
		System.out.println("Estimado "+ jpCuenta.titular + " su actual es: "+jpCuenta.saldo);
		Cuenta annionCuenta = new Cuenta();
		annionCuenta.titular = "Annie Begazo Beltran";
		annionCuenta.saldo = 5000;
		System.out.println("Bienvenida "+annionCuenta.titular+
				" su cuenta fue aperturada con exito y su saldo de apertura es:"+annionCuenta.saldo);
		annionCuenta.depositar(2000);
		System.out.println(annionCuenta.titular+ " Depostaste a tu cuenta");

		System.out.println("Estimada "+ annionCuenta.titular + " su saldo es: "+ annionCuenta.saldo);
		annionCuenta.trasnferir(1500, jpCuenta);
		System.out.println("El saldo de: "+annionCuenta.titular+" es "+annionCuenta.saldo);
		
		System.out.println("Saldo de "+jpCuenta.titular+" es: "+jpCuenta.saldo);
	}
}
