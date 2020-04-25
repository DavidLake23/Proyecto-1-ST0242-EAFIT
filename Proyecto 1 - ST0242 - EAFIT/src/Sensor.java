public class Sensor {
	
	public static Sensor[] sensores = new Sensor[8];
	public static int tamano = 8;
	public static int posAnadir = 0;
	
	private String tipo;
	private double valor;
	
	public Sensor() {
		
		Sensor.sensores[posAnadir] = this;
		Sensor.posAnadir++;
	}
	
	public Sensor(String t, double v) {
		
		this.tipo = t;
		this.valor = v;
		
		Sensor.sensores[posAnadir] = this;
		Sensor.posAnadir++;
	}
	
	public String toString() {
		
		return "(" + this.getTipo() + " , " + this.getValor() + ")";
	}
	
	public static String toStringSensores(String tipo) {
		
		String resultado = "";
		
		if(tipo != null) {
			
			for(int i = 0; i < Sensor.cantidadSensores(); i++) {
				
				if(sensores[i].getTipo().equalsIgnoreCase(tipo)) {
					
					resultado = resultado.concat("Sensor en posición #" + i + ": " + Sensor.sensores[i].toString() + "\n");
				}
			}
		}
		
		else for(int i = 0; i < cantidadSensores(); i++) {
			
			resultado = resultado.concat("Sensor en posición #" + i + ": " + Sensor.sensores[i].toString() + "\n");
		}
		
		return resultado;
	}
	
	public static String toStringSensoresTemperatura() {
		
		return Sensor.toStringSensores("temperatura");
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
		
		return Sensor.posAnadir;
	}
	
	//Getters
	
	public String getTipo() {
		
		return this.tipo;
	}
	
	public double getValor() {
		
		return this.valor;
	}
	
	//Setters
	
	public void setTipo(String t) {
		
		this.tipo = t;
	}
	
	public void setValor(double v) {
		
		this.valor = v;
	}
}
