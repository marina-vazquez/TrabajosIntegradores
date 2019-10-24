package TFI01RECUP;

import java.util.Arrays;

public abstract class Automovil implements ParaMostrar {

    private String Chofer;
    private String Destino;
    private String[] ListadePasajeros;


    public abstract String verDatos();

    @Override
    public String toString() {
        return "Automovil{" +
                "Chofer='" + Chofer + '\'' +
                ", Destino='" + Destino + '\'' +
                ", ListadePasajeros=" + Arrays.toString(ListadePasajeros) +
                '}';
    }

    public void setChofer(String choferes) {
        Chofer = choferes;
    }

    public void setDestino(String destinos) {
        Destino = destinos;
    }

    public void setListadePasajeros(String[] Pasajeros) {
        ListadePasajeros = Pasajeros;
    }








}
