package vehiculos;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;

public class Fabricante {
	private String nombre;
	private Pais pais;
	private static ArrayList<Fabricante> marcas = new ArrayList<Fabricante>();
	private int totaMarca;
	
	public Fabricante(String name, Pais pais){
		this.setNombre(name);
		this.setPais(pais);
		marcas.add(this);
	}

	public String getNombre() {
		return nombre;
	}
	public void setNombre(String nombre) {
		this.nombre = nombre;
	}
	public Pais getPais() {
		return pais;
	}
	public void setPais(Pais pais) {
		this.pais = pais;
	}
	public static ArrayList<Fabricante> getMarcas() {
		return marcas;
	}
	public static void setMarcas(ArrayList<Fabricante> marcas) {
		Fabricante.marcas = marcas;
	}
	public int getTotaMarca() {
		return totaMarca;
	}
	public void setTotaMarca(int totaMarca) {
		this.totaMarca = totaMarca;
	}
	
	public static Fabricante fabricaMayorVentas() {
		Collections.sort(marcas, new Comparator<Fabricante>() {
			   public int compare(Fabricante obj1, Fabricante obj2) {
			      return new Integer(obj2.getTotaMarca()).compareTo(obj1.getTotaMarca());
			   }
			});
		return marcas.get(0);
	}
	
}
