package tpinteger;

public abstract class Personas {
	
	public String Nombre;
	public int Edad;
	
	public String getNombre() {
		return Nombre;
	}
	public void setNombre(String nombre) {
		this.Nombre = nombre;
	}
	public int getEdad() {
		return Edad;
	}
	public void setEdad(int edad) {
		this.Edad = edad;
	}
	@Override
	public String toString() {
		return "Personas [nombre=" + Nombre + ", toString()=" + toString() + "]";
	}
	
	
	public int compareTo(String Nombre) {
		
		return Nombre.compareTo(Nombre);
	}
	
	public void clase () {
		
	}
	
	public void VerDatosPersonales () {
		System.out.println(Nombre + Edad );
	}
	
	
	
	
	

}
