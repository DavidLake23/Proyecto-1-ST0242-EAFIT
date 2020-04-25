public class Vehiculo {
	
	public static Vehiculo[] vehiculos = new Vehiculo[10];
	public static int tamano = 10;
	public static int posAnadir = 0;
	
	private int modelo;
	private String marca;
	private double valorComercial;
	private String color;
	
	public Vehiculo() {
		
		Vehiculo.vehiculos[posAnadir] = this;
		Vehiculo.posAnadir++;
	}
	
	public Vehiculo(int mo, String ma, double va) {
		
		this(mo, ma, va, "verde");
		
	//    vehiculos[posAnadir] = this;
	//	  posAnadir++;
	}
	
	public Vehiculo(int mo, String ma, double va, String co) {
		
		this.modelo = mo;
		this.marca = ma;
		this.valorComercial = va;
		this.color = co;
		
		Vehiculo.vehiculos[posAnadir] = this;
		Vehiculo.posAnadir++;
	}
	
	public String toString() {
		
		return String.valueOf(this.modelo).concat(" " + this.marca).concat(String.valueOf(" " + this.valorComercial)).concat(" " + this.color);
	}
	
	public static String toStringVehiculos() {
		
		String resultado = "";
		
		for(int i = 0; i < Vehiculo.cantidadVehiculos(); i++) {
			
			resultado = resultado.concat("Vehículo en posición #" + i + ": " + Vehiculo.vehiculos[i].toString() + "\n");
		}
		
		return resultado;
	}
	
	public static String toStringVehiculosVerdes() {
		
		String resultado = "";
		
		for(int i = 0; i < Vehiculo.cantidadVehiculos(); i++) {
			
			if(vehiculos[i].getColor().equalsIgnoreCase("verde")) {
				
				resultado = resultado.concat("Vehículo en posición #" + i + ": " + Vehiculo.vehiculos[i].toString() + "\n");
			}
		}
		
		return resultado;
	}
	
	
	public static int cantidadVehiculos() {
		
		return Vehiculo.posAnadir;
	}
	
	//Getters
	
	public int getModelo() {
		
		return this.modelo;
	}
	
	public String getMarca() {
		
		return this.marca;
	}
	
	public double getValorComercial() {
		
		return this.valorComercial;
	}
	
	public String getColor() {
		
		return this.color;
	}
	
	//Setters
	
	public void setModelo(int nuevoModelo) {
		
		this.modelo = nuevoModelo;
	}
	
	public void setMarca(String nuevaMarca) {
		
		this.marca = nuevaMarca;
	}
	
	public void setValorComercial(double nuevoValor) {
		
		this.valorComercial = nuevoValor;
	}
	
	public void setColor(String nuevoColor) {
		
		this.color = nuevoColor;
	}
}