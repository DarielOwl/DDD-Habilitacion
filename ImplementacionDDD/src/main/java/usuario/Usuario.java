package usuario;

import co.com.sofka.domain.generic.AggregateEvent;
import co.com.sofka.domain.generic.DomainEvent;
import usuario.events.UsuarioCreado;
import usuario.values.*;

import java.util.List;

public class Usuario extends AggregateEvent<UsuarioId> {


    //Atributos y Metodos
    protected UsuarioId usuarioId;
    protected DocumentoIdentidad documentoIdentidad;
    protected TipoDocumentoIdentidad tipoDocumentoIdentidad;
    protected HuellaDactilar huellaDactilar;
    protected Nombre nombre;


    //Constructor del Agregado
    public Usuario(UsuarioId entityId, Nombre nombre,DocumentoIdentidad documentoIdentidad,HuellaDactilar huellaDactilar) {
        super(entityId);

        //Esto lanza un evento dominio llamado UsuarioCreado
        //Pasa como parametro "nombre","documentoIdentidad" y "huellaDactilar"
        //y que es "aplicada" en este contexto
        appendChange(new UsuarioCreado(nombre,documentoIdentidad,huellaDactilar)).apply();
    }

    //Para cambiar el estado del los objetos
    private Usuario(UsuarioId entityId) {
        super(entityId);

        //El suscribe nos permite cambiar el estado del agregado (a traves de los eventos)
        subscribe(new UsuarioChange(this));
    }

    //Esto es para que una Persona ejecute cada lista de dominios (Constructor con Factoria)
    public static Usuario from(UsuarioId usuarioId, List<DomainEvent> events) {
        var usuario = new Usuario(usuarioId);
        events.forEach(usuario::applyEvent);
        return usuario;
    }
}
