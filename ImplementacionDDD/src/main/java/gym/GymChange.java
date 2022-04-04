package gym;

import co.com.sofka.domain.generic.EventChange;
import gym.events.GymCreado;
import usuario.events.UsuarioCreado;

public class GymChange extends EventChange {


    public GymChange(Gym gym) {

        apply((GymCreado event) -> {
            gym.usuarioId = event.getUsuarioId();
            gym.entrenadorPersonalizado = event.getEntrenadorPersonalizado();
            gym.entrenadorPlanta = event.getEntrenadorPlanta();
            gym.maquinas = event.getMaquinas();
        });
    }


}
