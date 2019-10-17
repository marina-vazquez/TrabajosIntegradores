package tpinteger;

public class Espectador extends Personas {
	
	public String Fila;
	public int Silla;
	private String Butaca;
	
	
	
	public void Espectadors(String nombre, int edad, String fila, int silla) {
		Nombre = nombre;
		Edad = edad;
		Fila = fila;
		Silla = silla;
	
	}


	public String getButaca() {
		return Butaca;
	}


	public String getFila() {
		return Fila;
	}


	public void setFila(String fila) {
		Fila = fila;
	}


	public int getSilla() {
		return Silla;
	}


	public void setSilla(int silla) {
		Silla = silla;
	}
		
	
	
	
	

}
