package gym.events;

import co.com.sofka.domain.generic.DomainEvent;
import gym.EntrenadorPersonalizado;
import gym.EntrenadorPlanta;
import gym.Maquina;
import gym.values.GymId;
import usuario.values.UsuarioId;

import java.util.Set;

public class GymCreado extends DomainEvent {

    protected UsuarioId usuarioId;
    protected EntrenadorPlanta entrenadorPlanta;
    protected EntrenadorPersonalizado entrenadorPersonalizado;
    protected Set<Maquina> maquinas;

    public GymCreado(UsuarioId usuarioId, EntrenadorPlanta entrenadorPlanta, EntrenadorPersonalizado entrenadorPersonalizado, Set<Maquina> maquinas) {
        super("sofka.gym.gymcreado");
        this.usuarioId = usuarioId;
        this.entrenadorPlanta = entrenadorPlanta;
        this.entrenadorPersonalizado = entrenadorPersonalizado;
        this.maquinas = maquinas;
    }

    //Getters-----------------
    public UsuarioId getUsuarioId() {
        return usuarioId;
    }

    public EntrenadorPlanta getEntrenadorPlanta() {
        return entrenadorPlanta;
    }

    public EntrenadorPersonalizado getEntrenadorPersonalizado() {
        return entrenadorPersonalizado;
    }

    public Set<Maquina> getMaquinas() {
        return maquinas;
    }

}
