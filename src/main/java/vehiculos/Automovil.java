package vehiculos;

public class Automovil extends Vehiculo {
	private int puestos;
	private static int totalAutos;
	
	public Automovil(String placa, String nombre, int precio, int peso, Fabricante fab, int puestos){
		super(placa, 4, 100, nombre, precio, peso, "FWD", fab);
		this.setPuestos(puestos);
		totalAutos++;
	}
	
	
	
	
	
	public int getPuestos() {
		return puestos;
	}

	public void setPuestos(int puestos) {
		this.puestos = puestos;
	}





	public static int getTotalAutos() {
		return totalAutos;
	}





	public static void setTotalAutos(int totalAutos) {
		Automovil.totalAutos = totalAutos;
	}
	

}
