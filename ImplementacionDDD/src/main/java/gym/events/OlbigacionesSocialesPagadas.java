package gym.events;

import co.com.sofka.domain.generic.DomainEvent;
import gym.values.EntrenadorPersonalizadoId;
import gym.values.MensualidadUsuario;
import gym.values.ObligacionSocial;

public class OlbigacionesSocialesPagadas extends DomainEvent {

    private final EntrenadorPersonalizadoId entrenadorPersonalizadoId;
    private final ObligacionSocial obligacionSocial;

    public OlbigacionesSocialesPagadas(EntrenadorPersonalizadoId entrenadorPersonalizadoId, ObligacionSocial obligacionSocial) {
        super("sofka.gym.olbigacionessocialespagadas");
        this.entrenadorPersonalizadoId = entrenadorPersonalizadoId;
        this.obligacionSocial = obligacionSocial;
    }

    //Getters
    public EntrenadorPersonalizadoId getEntrenadorPersonalizadoId() {
        return entrenadorPersonalizadoId;
    }

    public ObligacionSocial getObligacionSocial() {
        return obligacionSocial;
    }

}
