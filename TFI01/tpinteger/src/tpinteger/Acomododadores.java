package tpinteger;

public class Acomododadores extends Empleado implements ParaAcomodadores {

	private String Salas;
	
	public Acomododadores(String nombre, int edad) {
		super(nombre, edad);
		}

	public void setSalas(String salas) {
		Salas = salas;
	}
	
	public String getSalas() {
		return Salas;
	}
	
	public double getSueldo() {
		return Sueldo;
	}

	@Override
	public String toString() {
		return "Acomododadores [Salas=" + Salas + "]";
	}

	
	
	
	
	
	

}
