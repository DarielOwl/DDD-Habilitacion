package usuario.commands;

import co.com.sofka.domain.generic.Command;
import usuario.values.DocumentoIdentidad;
import usuario.values.HuellaDactilar;
import usuario.values.UsuarioId;

public class registrarHuellaDactilar extends Command {

    private final UsuarioId usuarioId;
    private final HuellaDactilar huellaDactilar;


    public registrarHuellaDactilar(UsuarioId usuarioId, HuellaDactilar huellaDactilar) {
        this.usuarioId = usuarioId;
        this.huellaDactilar = huellaDactilar;
    }


    public UsuarioId getUsuarioId() {
        return usuarioId;
    }

    public HuellaDactilar getHuellaDactilar() {
        return huellaDactilar;
    }
}
