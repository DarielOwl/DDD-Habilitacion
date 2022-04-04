package gym.commands;

import co.com.sofka.domain.generic.Command;
import gym.values.EntrenadorPersonalizadoId;
import gym.values.MensualidadUsuario;

public class CobrarMensualidadUsuario extends Command {

    protected EntrenadorPersonalizadoId entrenadorPersonalizadoId;
    protected MensualidadUsuario mensualidadUsuario;

    public CobrarMensualidadUsuario(EntrenadorPersonalizadoId entrenadorPersonalizadoId, MensualidadUsuario mensualidadUsuario) {
        this.entrenadorPersonalizadoId = entrenadorPersonalizadoId;
        this.mensualidadUsuario = mensualidadUsuario;
    }

    public EntrenadorPersonalizadoId getEntrenadorPersonalizadoId() {
        return entrenadorPersonalizadoId;
    }

    public MensualidadUsuario getMensualidadUsuario() {
        return mensualidadUsuario;
    }

}
