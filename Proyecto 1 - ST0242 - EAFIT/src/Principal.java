import java.util.Scanner;

public class Principal {
	
	public static void main(String[] args) {
		
		mostrarMenu();
	}
	
	public static void mostrarMenu() {
		
		Scanner S = new Scanner(System.in);
		
		while(true) {
			
			System.out.print("Ingresa un número: ");
			int vNumero = S.nextInt();
			
			if(vNumero == 0) {
				
				return;
			}
			
			else if(vNumero == 1) {
				
				if(Vehiculo.cantidadVehiculos() >= Vehiculo.tamano) {
					
					System.out.println("Error, base de datos llena.");
					continue;
				}
				
				System.out.print("Ingresa el modelo: ");
				int vModelo = S.nextInt();
				
				System.out.print("Ingresa la marca: ");
				String vMarca = S.next();
				
				System.out.print("Ingresa el valor comercial: ");
				double vValor = S.nextDouble();
				
				System.out.print("Ingresa el color: ");
				String vColor = S.next();
				
				Vehiculo vCarro = new Vehiculo(vModelo, vMarca, vValor, vColor);
				continue;
			}
			
			else if(vNumero == 2) {
				
				System.out.println(Vehiculo.toStringVehiculos());
				continue;
			}
			
			else if(vNumero == 3) {
				
				System.out.println("Cantidad de vehículos actual: " + Vehiculo.cantidadVehiculos());
				continue;
			}
			
			else if(vNumero == 4) {
				
				System.out.println(Vehiculo.toStringVehiculosVerdes());
				continue;
			}
			
			else if(vNumero == 5) {
				
				if(Sensor.cantidadSensores() >= Sensor.tamano) {
					
					System.out.println("Error, base de datos llena.");
					continue;
				}
				
				System.out.print("Ingresa el tipo del sensor: ");
				String vTipo = S.next();
				System.out.print("Ingresa el valor del sensor: ");
				double vValor = S.nextDouble();
				
				Sensor vSensor = new Sensor(vTipo, vValor);
				continue;
			}
			
			else if(vNumero == 6) {
				
				System.out.println(Sensor.toStringSensores());
				continue;
			}
			
			else if(vNumero == 7) {
				
				System.out.println("Cantidad de sensores actual: " + Sensor.cantidadSensores());
				continue;
			}
			
			else if(vNumero == 8) {
				
				System.out.println(Sensor.toStringSensoresTemperatura());
				continue;
			}
			
			else if(vNumero == 666) {
				
				Sensor[] vSensores = Sensor.sensoresOrdenadosTemperatura();
				
				for(int i = 0; i < vSensores.length; i++) {
					
					System.out.println("Posición #" + i + ":" + vSensores[i].getValor());
				}
				
				continue;
			}
			
			else {
				
				System.out.println("Número no válido");
				continue;
			}
		}
	}
}
