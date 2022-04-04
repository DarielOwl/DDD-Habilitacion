package gym.values;

import co.com.sofka.domain.generic.Identity;

public class MaquinaId extends Identity {

    //Constructor Vacio por las dudas
    public MaquinaId(){}

    //Constructor
    private MaquinaId(String id){
        super(id);
    }

    //Metodo que devuelve el ID
    public static MaquinaId of(String id){
        return new MaquinaId(id);
    }
}
