class Cuenta {
		double saldo;
		int agencia;
		int numero;
		String titular;
		
		// No retorna valor
		public void depositar(double saldo) {
		this.saldo = this.saldo + saldo;
		}
		
		public boolean retirar(double valor) {
				if  (this.saldo >= valor) {
					this.saldo = this.saldo -valor;
					
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
		
		
		}
			

