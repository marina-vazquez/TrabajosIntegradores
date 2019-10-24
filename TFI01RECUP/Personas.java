package TFI01RECUP;

public class Personas implements ParaMostrar {


    private String Nombre;
    private int DNI;

    public String getNombre() {
        return Nombre;
    }

    public void setNombre(String nombre) {
        Nombre = nombre;
    }


    public int getDNI() {
        return DNI;
    }

    public void setDNI(int DNI) {
        this.DNI = DNI;
    }


    @Override
    public String toString() {
        return "Personas{" +
                "Nombre='" + Nombre + '\'' +
                ", DNI=" + DNI +
                '}';
    }


    @Override
    public void getName() {

    }
}
