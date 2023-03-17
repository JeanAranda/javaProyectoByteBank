class Cuenta {
		private double saldo;
		private int agencia;
		private int numero;
		Cliente titular;
		
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
		
		public void setAgencia(int agencia){
			if(agencia > 0 ) {
				this.agencia = agencia;
			}else {
				System.out.println("No se permite valores negativos");
			}
		}
		
		public int getAgencia() {
			return agencia;
		}
		
		
		}
			

