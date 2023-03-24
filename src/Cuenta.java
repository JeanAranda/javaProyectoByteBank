class Cuenta {
		private double saldo;
		private int agencia;
		private int numero;
		private Cliente titular = new Cliente();
		
		private static int total =0;
		public Cuenta(int agencia) {
			if (agencia <= 0) {
				System.out.println("No se permite 0");
				this.agencia = 1;
			}else {
				this.agencia = agencia;
			}
			total++;
			System.out.println("Se van creando: "+total+" cuentas");
		}
		
		// No retorna valor
		public boolean depositar(double saldo) {
			if (saldo > 0) {
				this.saldo = this.saldo + saldo;
				System.out.println("Nuevo deposito: "+ saldo);
				return true;
			}else {
				System.out.println("Lo sentimos no se pudo, intente de nuevo o cambie de cajero");
				return false;
			}
		}
		
		public boolean retirar(double valor) {
				if  (this.saldo >= valor) {
					this.saldo -= valor;
					//this.saldo = this.saldo -valor;
					
					System.out.println("Retiro exitoso!!!");
					System.out.println(valor);
					return true;
				}else {
					return false;
				}
		}
		public boolean trasnferir(double valor, Cuenta cuenta) {
			if (this.saldo >= valor) {
				
				this.saldo = this.saldo - valor;
				cuenta.depositar(valor);
				System.out.println("Transferencia exitosa!!");
				System.out.println("Se envio "+ valor + " a la cuenta de "+ cuenta.titular);
				return true;
			}else {
				return false;
			}
		}
		
		public double getSaldo() {
			return this.saldo;
		}
		
		public int getAgencia() {
			return agencia;
		}
		
		public void setTitular(Cliente titular) {
			this.titular = titular;
		}
		
		public Cliente getTitular() {
			return titular;
		}
		public static int getTotal() {
			return Cuenta.total;
		}
		
		
		}
			

