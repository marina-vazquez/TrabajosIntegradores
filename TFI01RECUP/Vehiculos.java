package TFI01RECUP;

public class Vehiculos extends Automovil {

    private String Matricula;
    private int Capacidad;

    public String getMatricula() {
        return Matricula;
    }

    public void setMatricula(String matricula) {
        Matricula = matricula;
    }

    public int getCapacidad() {
        return Capacidad;
    }

    public void setCapacidad(int capacidad) {
        Capacidad = capacidad;
    }

    public void Lugares (String Origen, String Destino) {
    }


   public String [] ListadePasajeros () {
        return ListadePasajeros();
    }

    public String Chofer() {
        return Chofer();
    }

    @Override
    public String verDatos() {
        return null;
    }

    public void ingresodatosvehiculo () {
        System.out.println("Ingrese matricula del vehiculo");
        getMatricula();
    }

    @Override
    public void getName() {

    }
}
