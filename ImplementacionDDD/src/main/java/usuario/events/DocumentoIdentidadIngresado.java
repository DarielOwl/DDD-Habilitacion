package usuario.events;

import co.com.sofka.domain.generic.DomainEvent;
import usuario.values.DocumentoIdentidad;
import usuario.values.UsuarioId;

public class DocumentoIdentidadIngresado extends DomainEvent {

    private final UsuarioId usuarioId;
    private final DocumentoIdentidad documentoIdentidad;

    public DocumentoIdentidadIngresado(UsuarioId usuarioId, DocumentoIdentidad documentoIdentidad) {
        super("sofka.usuario.documentoidentidadingresado");
        this.usuarioId = usuarioId;
        this.documentoIdentidad = documentoIdentidad;
    }

    //Getters
    public UsuarioId getUsuarioId() {
        return usuarioId;
    }

    public DocumentoIdentidad getDocumentoIdentidad() {
        return documentoIdentidad;
    }

}
