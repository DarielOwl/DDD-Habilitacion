package gym.values;

import co.com.sofka.domain.generic.Identity;

public class EntrenadorPlantaId extends Identity {

    //Constructor Vacio por las dudas
    public EntrenadorPlantaId(){}

    //Constructor
    private EntrenadorPlantaId(String id){
        super(id);
    }

    //Metodo que devuelve el ID
    public static EntrenadorPlantaId of(String id){
        return new EntrenadorPlantaId(id);
    }
}
