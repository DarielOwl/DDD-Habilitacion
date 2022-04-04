package gym.values;

import co.com.sofka.domain.generic.Identity;

public class EntrenadorPersonalizadoId  extends Identity {

    //Constructor Vacio por las dudas
    public EntrenadorPersonalizadoId(){}

    //Constructor
    private EntrenadorPersonalizadoId(String id){
        super(id);
    }

    //Metodo que devuelve el ID
    public static EntrenadorPersonalizadoId of(String id){
        return new EntrenadorPersonalizadoId(id);
    }

}
