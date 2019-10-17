package tpinteger;

public class Salas {
	
	public int Capacidad;
	public String Pelicula;
	public String Nombre;
	private String Espectadores[];
	
	public Salas(int capacidad, String pelicula, String nombre) {
		Capacidad = capacidad;
		Pelicula = pelicula;
		Nombre = nombre;
	}

	public void setPelicula(String pelicula) {
		Pelicula = pelicula;
	}

	public String[] getEspectadores() {
		return Espectadores;
	}

	public void setEspectadores(String[] espectadores) {
		Espectadores = espectadores;
	}

	@Override
	public String toString() {
		return toString();
	}
	
	

	
	
	
	
	
	
	
	
	

}
