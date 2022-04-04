package usuario;

import co.com.sofka.domain.generic.EventChange;
import usuario.events.DocumentoIdentidadIngresado;
import usuario.events.HuellaDactilarRegistrada;
import usuario.events.UsuarioCreado;

public class UsuarioChange extends EventChange {

    //El suscribe atendera a todos los eventos del dominio
    public UsuarioChange(Usuario usuario) {

        //Crear un consumidor (Esto recibe lo que se espera que haga el evento)
        apply((UsuarioCreado event) -> {
            usuario.nombre = event.getNombre();
            usuario.documentoIdentidad = event.getDocumentoIdentidad();
            usuario.huellaDactilar = event.getHuellaDactilar();
        });


        apply((DocumentoIdentidadIngresado event) -> {
            usuario.documentoIdentidad = event.getDocumentoIdentidad();
        });


        apply((HuellaDactilarRegistrada event) -> {
            usuario.huellaDactilar = event.getHuellaDactilar();
        });

    }

}
