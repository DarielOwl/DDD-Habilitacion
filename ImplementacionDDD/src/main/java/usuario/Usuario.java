package usuario;

import co.com.sofka.domain.generic.AggregateEvent;
import co.com.sofka.domain.generic.DomainEvent;
import usuario.events.DocumentoIdentidadIngresado;
import usuario.events.HuellaDactilarRegistrada;
import usuario.events.UsuarioCreado;
import usuario.values.*;

import java.util.List;
import java.util.Objects;

public class Usuario extends AggregateEvent<UsuarioId> {


    //Atributos y Metodos
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


    //Comportamientos--------------------------------
    public void ingresarDocumentoIdentidad(UsuarioId entityId, DocumentoIdentidad documentoIdentidad){

        //Validar que no sean nulos
        Objects.requireNonNull(entityId);
        Objects.requireNonNull(documentoIdentidad);

        //Agregar un evento
        appendChange(new DocumentoIdentidadIngresado(entityId,documentoIdentidad)).apply();
    }

    public void registrarHuellaDactilar(UsuarioId entityId, HuellaDactilar huellaDactilar){

        //Validar que no sean nulos
        Objects.requireNonNull(entityId);
        Objects.requireNonNull(huellaDactilar);

        //Agregar un evento
        appendChange(new HuellaDactilarRegistrada(entityId,huellaDactilar)).apply();
    }


    //Getters------------------------
    public DocumentoIdentidad documentoIdentidad() {
        return documentoIdentidad;
    }

    public TipoDocumentoIdentidad tipoDocumentoIdentidad() {
        return tipoDocumentoIdentidad;
    }

    public HuellaDactilar huellaDactilar() {
        return huellaDactilar;
    }

    public Nombre nombre() {
        return nombre;
    }
}
