package tpinteger;

import java.util.Scanner;

public class Cine {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Scanner sc = new Scanner(System.in);
		Personas persona = new Personas();
		Espectador espectador = new Espectador();
			
		System.out.println("Bienvennido, espectador. Ingrese su nombre");
		persona.getNombre();
		System.out.println("Ingrese su edad");
		persona.getEdad();
		System.out.println("Ingrese fila");
		espectador.getFila();
		System.out.println("Ingrese numero de silla");
		espectador.getSilla();
	
		persona.VerDatosPersonales();
		
		int salon  = 3;
		String peli = "Jocker";
		String salan = "Sala 01";
		
		Salas sala = new Salas(salon, peli, salan);
	
		
		Acomododadores acomodador = new Acomododadores ("Juanito", 21);
		acomodador.getSalas();
		
		double sueldu = 50000;
		acomodador.getSueldo();
		System.out.println(Acomododadores.class);
		
		Empleado empleadu = new Empleado ("Felipe", 33);
		System.out.println(Empleado.class);
		
		
	}

}
