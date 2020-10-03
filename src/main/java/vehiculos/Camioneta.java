package vehiculos;

public class Camioneta extends Vehiculo {
	private boolean volco;
	private static int totalCamionetas;
	
	public Camioneta(String placa, int puertas, String name, int precio, int peso, Fabricante fab, boolean volco){
		super(placa, puertas, 90, name, precio, peso, "4X4", fab);
		this.setVolco(volco);
		totalCamionetas++;
	}


	public boolean isVolco() {
		return volco;
	}


	public void setVolco(boolean volco) {
		this.volco = volco;
	}


	public static int getTotalCamionetas() {
		return totalCamionetas;
	}


	public static void setTotalCamionetas(int totalCamionetas) {
		Camioneta.totalCamionetas = totalCamionetas;
	}
	
}
