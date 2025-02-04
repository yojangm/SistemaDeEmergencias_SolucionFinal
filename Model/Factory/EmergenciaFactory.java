package Model.Factory;

import Model.Emergencia;


public class EmergenciaFactory {
    
    public Emergencia crearEmergencia(String tipo, String ubicacion, int gravedad) {
        return new Emergencia(tipo, ubicacion, gravedad);
    }

}
