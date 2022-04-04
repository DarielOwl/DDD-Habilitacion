package gym.commands;

import co.com.sofka.domain.generic.Command;
import gym.EntrenadorPersonalizado;
import gym.EntrenadorPlanta;
import gym.Maquina;
import gym.values.GymId;
import usuario.values.UsuarioId;

import java.util.Set;

public class CrearGym extends Command {

    protected GymId gymId;
    protected UsuarioId usuarioId;
    protected EntrenadorPlanta entrenadorPlanta;
    protected EntrenadorPersonalizado entrenadorPersonalizado;
    protected Set<Maquina> maquinas;

    public CrearGym(GymId gymId, UsuarioId usuarioId, EntrenadorPlanta entrenadorPlanta, EntrenadorPersonalizado entrenadorPersonalizado, Set<Maquina> maquinas) {
        this.gymId = gymId;
        this.usuarioId = usuarioId;
        this.entrenadorPlanta = entrenadorPlanta;
        this.entrenadorPersonalizado = entrenadorPersonalizado;
        this.maquinas = maquinas;
    }

    public GymId getGymId() {
        return gymId;
    }

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
