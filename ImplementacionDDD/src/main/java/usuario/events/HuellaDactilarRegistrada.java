package usuario.events;

import co.com.sofka.domain.generic.DomainEvent;
import usuario.values.DocumentoIdentidad;
import usuario.values.HuellaDactilar;
import usuario.values.UsuarioId;

public class HuellaDactilarRegistrada extends DomainEvent {

    private final UsuarioId usuarioId;
    private final HuellaDactilar huellaDactilar;

    public HuellaDactilarRegistrada(UsuarioId usuarioId, HuellaDactilar huellaDactilar) {
        super("sofka.usuario.documentoidentidadingresado");
        this.usuarioId = usuarioId;
        this.huellaDactilar = huellaDactilar;
    }

    //Getters
    public UsuarioId getUsuarioId() {
        return usuarioId;
    }

    public HuellaDactilar getHuellaDactilar() {
        return huellaDactilar;
    }

}
