package usuario.commands;

import co.com.sofka.domain.generic.Command;
import usuario.values.DocumentoIdentidad;
import usuario.values.UsuarioId;

public class ingresarDocumentoIdentidad extends Command {

    private final UsuarioId usuarioId;
    private final DocumentoIdentidad documentoIdentidad;


    public ingresarDocumentoIdentidad(UsuarioId usuarioId, DocumentoIdentidad documentoIdentidad) {
        this.usuarioId = usuarioId;
        this.documentoIdentidad = documentoIdentidad;
    }


    public UsuarioId getUsuarioId() {
        return usuarioId;
    }

    public DocumentoIdentidad getDocumentoIdentidad() {
        return documentoIdentidad;
    }

}
