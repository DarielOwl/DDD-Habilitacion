package usuario.values;

import co.com.sofka.domain.generic.Identity;

public class UsuarioId extends Identity {

    //Constructor Vacio por las dudas
    public UsuarioId(){}

    //Constructor
    private UsuarioId(String id){
        super(id);
    }

    //Metodo que devuelve el ID
    public static UsuarioId of(String id){
        return new UsuarioId(id);
    }

}
