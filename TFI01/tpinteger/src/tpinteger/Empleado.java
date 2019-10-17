package tpinteger;

public class Empleado extends Personas {
	
	public double Sueldo;
	
	public Empleado (String nombre, int edad) {
		Nombre = nombre;
		Edad = edad;
	}

	public void setSueldo(double sueldo) {
		Sueldo = sueldo;
	}

	@Override
	public String toString() {
		return "Empleado [Nombre=" + Nombre + ", Edad=" + Edad + ", toString()=" + toString() + "]";
	}

	
	
	

}
