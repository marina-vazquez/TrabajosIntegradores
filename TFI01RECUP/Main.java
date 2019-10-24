package TFI01RECUP;

import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
	// write your code here
        Scanner sc = new Scanner(System.in);


        Pasajeros[] pasajeros = new Pasajeros[];
        Choferes chofer = new Choferes();
        Vehiculos vehiculos = new Vehiculos();

        System.out.println ("Ingrese la cantidad de pasajeros");
        int capacidad = sc.nextInt();
        vehiculos.getCapacidad();
        vehiculos.ingresodatosvehiculo();

        chofer.datoschofer();

        System.out.println("\nIngrese los pasajeros en la siguiente lista");

        if (pasajeros.length<capacidad) {

        for(int i=0; i<=pasajeros.length-1; i++)

            try {

                System.out.println("Nombre:");
                String nombre = sc.next();

                System.out.println("DNI:");
                int dni = sc.nextInt();

                pasajeros[i] = new Pasajeros();


            } catch (Exception e) {
                // TODO: handle exception
                System.out.println("ERROR EN EL INGRESO DE DATOS");
                break;
            }

    } else { System.out.println("LA LISTA DE PASAJEROS ES SUPERIOR A LA CAPACIDAD DEL VEHÍCULO");
        }

        System.out.println("Lista de Pasajeros: \n");
        for (int k = 0; k<=pasajeros.length; k++) {
            System.out.println(pasajeros[k]);
        }


        }

}
