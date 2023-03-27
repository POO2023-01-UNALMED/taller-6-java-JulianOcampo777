package vehiculos;
import java.util.HashMap;
import java.util.Map;
import java.util.Map.Entry;


public class Pais {
	private String nombre;
	
	
	
	static Map<Pais, Integer>ventasPorPais = new HashMap <Pais, Integer>();
	public static Pais paisMasVendedor() {
		
		int valorMax=-1;
		Pais paisMasVendedor=null;
		
		for(Entry<Pais, Integer>Entry:ventasPorPais.entrySet()) {
			final int valorActual = Entry.getValue();
			if (valorActual>valorMax) {
				valorMax=valorActual;
				paisMasVendedor=Entry.getKey();
				
			}
		}
		return paisMasVendedor;
	}

	
	public Pais(String nombre) {
		this.nombre=nombre;
	}
	
	
	
	public String getNombre() {
		return nombre;
	}

	public void setNombre(String nombre) {
		this.nombre = nombre;
	}
	
}
