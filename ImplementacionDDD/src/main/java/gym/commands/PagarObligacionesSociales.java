package gym.commands;

import co.com.sofka.domain.generic.Command;
import gym.values.EntrenadorPersonalizadoId;
import gym.values.ObligacionSocial;

public class PagarObligacionesSociales extends Command {

    protected EntrenadorPersonalizadoId entrenadorPersonalizadoId;
    protected ObligacionSocial obligacionSocial;


    public PagarObligacionesSociales(EntrenadorPersonalizadoId entrenadorPersonalizadoId, ObligacionSocial obligacionSocial) {
        this.entrenadorPersonalizadoId = entrenadorPersonalizadoId;
        this.obligacionSocial = obligacionSocial;
    }

    public EntrenadorPersonalizadoId getEntrenadorPersonalizadoId() {
        return entrenadorPersonalizadoId;
    }

    public ObligacionSocial getObligacionSocial() {
        return obligacionSocial;
    }

}
