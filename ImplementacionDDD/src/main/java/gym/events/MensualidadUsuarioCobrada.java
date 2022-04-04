package gym.events;

import co.com.sofka.domain.generic.DomainEvent;
import gym.EntrenadorPersonalizado;
import gym.values.EntrenadorPersonalizadoId;
import gym.values.MensualidadUsuario;

public class MensualidadUsuarioCobrada extends DomainEvent {

    private final EntrenadorPersonalizadoId entrenadorPersonalizadoId;
    private final MensualidadUsuario mensualidadUsuario;

    public MensualidadUsuarioCobrada(EntrenadorPersonalizadoId entrenadorPersonalizadoId,MensualidadUsuario mensualidadUsuario) {
        super("sofka.gym.mensualidadusuariocobrada");
        this.entrenadorPersonalizadoId = entrenadorPersonalizadoId;
        this.mensualidadUsuario = mensualidadUsuario;
    }


    //Getters------------------------------
    public EntrenadorPersonalizadoId getEntrenadorPersonalizadoId() {
        return entrenadorPersonalizadoId;
    }

    public MensualidadUsuario getMensualidadUsuario() {
        return mensualidadUsuario;
    }



}
