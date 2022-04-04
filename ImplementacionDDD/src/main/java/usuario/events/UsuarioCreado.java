package usuario.events;

import co.com.sofka.domain.generic.DomainEvent;
import usuario.values.DocumentoIdentidad;
import usuario.values.HuellaDactilar;
import usuario.values.Nombre;

public class UsuarioCreado extends DomainEvent {

    //Atributos
    private final Nombre nombre;
    private final DocumentoIdentidad documentoIdentidad;
    private final HuellaDactilar huellaDactilar;

    //Creando un Evento
    public UsuarioCreado(Nombre nombre,DocumentoIdentidad documentoIdentidad,HuellaDactilar huellaDactilar) {
        super("sofka.usuario.usuariocreado");
        this.nombre = nombre;
        this.documentoIdentidad = documentoIdentidad;
        this.huellaDactilar = huellaDactilar;

    }

    //Getters
    public Nombre getNombre() {
        return nombre;
    }

    public DocumentoIdentidad getDocumentoIdentidad() {
        return documentoIdentidad;
    }

    public HuellaDactilar getHuellaDactilar() {
        return huellaDactilar;
    }
}
