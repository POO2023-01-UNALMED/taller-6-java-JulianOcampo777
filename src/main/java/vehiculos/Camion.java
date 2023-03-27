package vehiculos;

public class Camion extends Vehiculo {
	private static int cantidadCamiones;
	private int ejes;
	

	public Camion(String placa, String nombre, int precio, int peso,Fabricante fabricante, int ejes) {
		super(placa, 2, 80, nombre, precio, peso, "4X2", fabricante);
		// TODO Auto-generated constructor stub
		this.setEjes(ejes);
		Camion.cantidadCamiones++;
	}


	public static int getCantidadCamiones() {
		return cantidadCamiones;
	}


	public static void setCantidadCamiones(int cantidadCamiones) {
		Camion.cantidadCamiones = cantidadCamiones;
	}


	public int getEjes() {
		return ejes;
	}


	public void setEjes(int ejes) {
		this.ejes = ejes;
	}

}
