package vehiculos;

public class Vehiculo {
	private String placa;
	private int puertas;
	private int velocidadMaxima;
	private String nombre;
	private int precio;
	private int peso;
	private String traccion;
	private Fabricante fabricante;
	private static int cantidadVehiculos;
	
	public Vehiculo(String placa, int puertas, int velo, String name, int precio, int peso, String tracc, Fabricante fab){
		this.setPlaca(placa);
		this.setPuertas(puertas);
		this.setVelocidadMaxima(velo);
		this.setNombre(name);
		this.setPrecio(precio);
		this.setPeso(peso);
		this.setTraccion(tracc);
		this.setFabricante(fab);
		cantidadVehiculos++;
		this.fabricante.getPais().setTotaPais(this.fabricante.getPais().getTotaPais()+1);
		this.fabricante.setTotaMarca(this.fabricante.getTotaMarca()+1);
	}
	
	
	
	public String getPlaca() {
		return placa;
	}
	public void setPlaca(String placa) {
		this.placa = placa;
	}
	public int getPuertas() {
		return puertas;
	}
	public void setPuertas(int puertas) {
		this.puertas = puertas;
	}
	public int getVelocidadMaxima() {
		return velocidadMaxima;
	}
	public void setVelocidadMaxima(int velocidadMaxima) {
		this.velocidadMaxima = velocidadMaxima;
	}
	public String getNombre() {
		return nombre;
	}
	public void setNombre(String nombre) {
		this.nombre = nombre;
	}
	public int getPrecio() {
		return precio;
	}
	public void setPrecio(int precio) {
		this.precio = precio;
	}
	public int getPeso() {
		return peso;
	}
	public void setPeso(int peso) {
		this.peso = peso;
	}
	public String getTraccion() {
		return traccion;
	}
	public void setTraccion(String traccion) {
		this.traccion = traccion;
	}
	public Fabricante getFabricante() {
		return fabricante;
	}
	public void setFabricante(Fabricante fabricante) {
		this.fabricante = fabricante;
	}



	public static int getCantidadVehiculos() {
		return cantidadVehiculos;
	}



	public static void setCantidadVehiculos(int cantidadVehiculos) {
		Vehiculo.cantidadVehiculos = cantidadVehiculos;
	}
	
	
	public String vehiculosPorTipo() {
		return "Automoviles: "+Automovil.getTotalAutos()+"\n" + 
				"Camionetas: "+Camioneta.getTotalCamionetas()+"\n" + 
				"Camiones: "+Camion.getTotalCamiones();
	}
	
	
}
