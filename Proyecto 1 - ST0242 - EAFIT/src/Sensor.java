public class Sensor {
	
	public static Sensor[] sensores = new Sensor[8];
	public static int tamano = 8;
	public static int posAnadir = 0;
	
	private String tipo;
	private double valor;
	
	public Sensor() {
		
		sensores[posAnadir] = this;
		posAnadir++;
	}
	
	public Sensor(String t, double v) {
		
		tipo = t;
		valor = v;
		
		sensores[posAnadir] = this;
		posAnadir++;
	}
	
	public String toString() {
		
		return "(" + getTipo() + " , " + getValor() + ")";
	}
	
	public static String toStringSensores() {
		
		String resultado = "";
		
		for(int i = 0; i < sensores.length; i++) {
			
			resultado = resultado.concat("Sensor en posición #" + i + ": " + sensores[i].toString() + "\n");
		}
		
		return resultado;
	}
	
	public static String toStringSensoresTemperatura() {
		
		String resultado = "";
		
		for(int i = 0; i < cantidadSensores(); i++) {
			
			if(sensores[i].getTipo().equalsIgnoreCase("temperatura")) {
				
				resultado = resultado.concat("Sensor en posición #" + i + ": " + sensores[i].toString() + "\n");
			}
		}
		
		return resultado;
	}
	
	
	public static Sensor[] sensoresOrdenadosTemperatura(){
		
		Sensor[] arregloOrdenado = new Sensor[Sensor.cantidadSensores()];
		System.arraycopy(sensores, 0, arregloOrdenado, 0, Sensor.cantidadSensores());
		
		for(int x = 0; x < arregloOrdenado.length; x++) {
			
	        for (int i = 0; i < arregloOrdenado.length-x-1; i++) {
	        	
	            if(arregloOrdenado[i].getValor() > arregloOrdenado[i+1].getValor()){
	            	
	                Sensor temp = arregloOrdenado[i+1];
	                arregloOrdenado[i+1] = arregloOrdenado[i];
	                arregloOrdenado[i] = temp;
	            }
	        }
		}
		
		int vContador = 0;
		
		for(int i = 0; i < arregloOrdenado.length; i++) {
			
			if(arregloOrdenado[i].getTipo().equalsIgnoreCase("temperatura")) {
				
				vContador++;
			}
		}
		
		Sensor[] arregloFinal = new Sensor[vContador];
		vContador = 0;
		
		for(int i = 0; i < arregloOrdenado.length; i++) {
			
			if(arregloOrdenado[i].getTipo().equalsIgnoreCase("temperatura")) {
				
				arregloFinal[vContador] = arregloOrdenado[i];
				vContador++;
			}
		}
		
		return arregloFinal;
	}
	
	public static int cantidadSensores() {
		
		return posAnadir;
	}
	
	//Getters
	
	public String getTipo() {
		
		return tipo;
	}
	
	public double getValor() {
		
		return valor;
	}
	
	//Setters
	
	public void setTipo(String t) {
		
		tipo = t;
	}
	
	public void setValor(double v) {
		
		valor = v;
	}
}
