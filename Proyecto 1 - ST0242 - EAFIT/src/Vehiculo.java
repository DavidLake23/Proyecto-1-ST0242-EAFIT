public class Vehiculo {
	
	public static Vehiculo[] vehiculos = new Vehiculo[10];
	public static int tamano = 10;
	public static int posAnadir = 0;
	
	private int modelo;
	private String marca;
	private double valorComercial;
	private String color;
	
	public Vehiculo() {
		
		vehiculos[posAnadir] = this;
		posAnadir++;
	}
	
	public Vehiculo(int mo, String ma, double va) {
		
		this(mo, ma, va, "verde");
		
	    vehiculos[posAnadir] = this;
		posAnadir++;
	}
	
	public Vehiculo(int mo, String ma, double va, String co) {
		
		modelo = mo;
		marca = ma;
		valorComercial = va;
		color = co;
		
		vehiculos[posAnadir] = this;
		posAnadir++;
	}
	
	public String toString() {
		
		return String.valueOf(modelo).concat(" " + marca).concat(String.valueOf(" " + valorComercial)).concat(" " + color);
	}
	
	public static String toStringVehiculos() {
		
		String resultado = "";
		
		for(int i = 0; i < cantidadVehiculos(); i++) {
			
			resultado = resultado.concat("Vehículo en posición #" + i + ": " + vehiculos[i].toString() + "\n");
		}
		
		return resultado;
	}
	
	public static String toStringVehiculosVerdes() {
		
		String resultado = "";
		
		for(int i = 0; i < cantidadVehiculos(); i++) {
			
			if(vehiculos[i].getColor().equalsIgnoreCase("verde")) {
				
				resultado = resultado.concat("Vehículo en posición #" + i + ": " + vehiculos[i].toString() + "\n");
			}
		}
		
		return resultado;
	}
	
	
	public static int cantidadVehiculos() {
		
		return posAnadir;
	}
	
	//Getters
	
	public int getModelo() {
		
		return modelo;
	}
	
	public String getMarca() {
		
		return marca;
	}
	
	public double getValorComercial() {
		
		return valorComercial;
	}
	
	public String getColor() {
		
		return color;
	}
	
	//Setters
	
	public void setModelo(int nuevoModelo) {
		
		modelo = nuevoModelo;
	}
	
	public void setMarca(String nuevaMarca) {
		
		marca = nuevaMarca;
	}
	
	public void setValorComercial(double nuevoValor) {
		
		valorComercial = nuevoValor;
	}
	
	public void setColor(String nuevoColor) {
		
		color = nuevoColor;
	}
}