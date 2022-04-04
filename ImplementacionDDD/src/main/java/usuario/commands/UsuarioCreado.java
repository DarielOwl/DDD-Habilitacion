package usuario.commands;

import co.com.sofka.domain.generic.Command;
import usuario.values.DocumentoIdentidad;
import usuario.values.HuellaDactilar;
import usuario.values.Nombre;
import usuario.values.UsuarioId;

public class UsuarioCreado extends Command {

    private final UsuarioId usuarioId;
    private final Nombre nombre;
    private final DocumentoIdentidad documentoIdentidad;
    private final HuellaDactilar huellaDactilar;


    public UsuarioCreado(UsuarioId usuarioId, Nombre nombre, DocumentoIdentidad documentoIdentidad, HuellaDactilar huellaDactilar) {
        this.usuarioId = usuarioId;
        this.nombre = nombre;
        this.documentoIdentidad = documentoIdentidad;
        this.huellaDactilar = huellaDactilar;
    }


    //Getters-------------------------
    public UsuarioId getUsuarioId() {
        return usuarioId;
    }

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
