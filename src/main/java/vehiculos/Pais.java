package vehiculos;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;

public class Pais {
	private String nombre;
	private static ArrayList<Pais> paises = new ArrayList<Pais>();
	private int totaPais;

	
	public Pais(String name){
		this.setNombre(name);
		paises.add(this);
	}
	
	public String getNombre() {
		return nombre;
	}





	public void setNombre(String nombre) {
		this.nombre = nombre;
	}
	


	public static ArrayList<Pais> getPaises() {
		return paises;
	}

	public static void setPaises(ArrayList<Pais> paises) {
		Pais.paises = paises;
	}
	
	
	public int getTotaPais() {
		return totaPais;
	}

	public void setTotaPais(int totaPais) {
		this.totaPais = totaPais;
	}

	public static Pais paisMasVendedor() {
		Collections.sort(paises, new Comparator<Pais>() {
			   public int compare(Pais obj1, Pais obj2) {
			      return new Integer(obj2.getTotaPais()).compareTo(obj1.getTotaPais());
			   }
			});
		return paises.get(0);
		
	}
}
