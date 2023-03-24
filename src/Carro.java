
public class Carro {
	private int año;
	private String modelo;
	private double precio;
	
	public Carro(int año,String modelo,double precio){
		if (año < 2000 && año != 2023) {
			this.año = año;
			System.out.println("Este modelo se ajusta al estandar: "+ año);
		}else {
			System.out.println("El modelo no esta dentro del estandar");
			this.año = 2000;
		}
		if (modelo != null) {
			this.modelo = modelo;
		}else {
			System.out.println("El modelo es fantasma, se usara por defecto H1!!!");
			this.modelo = "H1";
		}
		if (precio < 5000) {
			System.out.println("Bromeas esto sera un posible descuento en soles");
			this.precio = 35000;
		}
	}
	
	public int getAño() {
		return this.año;
	}
	
	public String getModelo() {
		return this.modelo;
	}
	
	public double getPrecio() {
		return this.precio;
	}
}
