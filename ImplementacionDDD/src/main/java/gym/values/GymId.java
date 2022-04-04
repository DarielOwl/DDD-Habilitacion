package gym.values;

import co.com.sofka.domain.generic.Identity;
import usuario.values.UsuarioId;

public class GymId extends Identity {

    //Constructor Vacio por las dudas
    public GymId(){}

    //Constructor
    private GymId(String id){
        super(id);
    }

    //Metodo que devuelve el ID
    public static GymId of(String id){
        return new GymId(id);
    }

}
