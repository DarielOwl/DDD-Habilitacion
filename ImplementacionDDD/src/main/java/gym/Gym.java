package gym;

import co.com.sofka.domain.generic.AggregateEvent;
import co.com.sofka.domain.generic.DomainEvent;
import gym.events.GymCreado;
import gym.events.MensualidadUsuarioCobrada;
import gym.events.OlbigacionesSocialesPagadas;
import gym.values.EntrenadorPersonalizadoId;
import gym.values.GymId;
import gym.values.MensualidadUsuario;
import gym.values.ObligacionSocial;
import usuario.values.UsuarioId;

import java.util.List;
import java.util.Objects;
import java.util.Set;

public class Gym extends AggregateEvent<GymId> {

    //Atributos y Metodos
    protected GymId gymId;
    protected UsuarioId usuarioId;
    protected EntrenadorPlanta entrenadorPlanta;
    protected EntrenadorPersonalizado entrenadorPersonalizado;
    protected Set<Maquina> maquinas;


    //Constructor del Agregado
    public Gym(GymId entityId, UsuarioId usuarioId, EntrenadorPlanta entrenadorPlanta,EntrenadorPersonalizado entrenadorPersonalizado,Set<Maquina> maquinas) {
        super(entityId);
        appendChange(new GymCreado(usuarioId, entrenadorPlanta, entrenadorPersonalizado,maquinas)).apply();
    }

    //Para cambiar el estado del los objetos
    private Gym(GymId entityId) {
        super(entityId);
        subscribe(new GymChange(this));
    }

    //Esto es para que una Persona ejecute cada lista de dominios (Constructor con Factoria)
    public static Gym from(GymId gymId, List<DomainEvent> events) {
        var gym = new Gym(gymId);
        events.forEach(gym::applyEvent);
        return gym;
    }

    //Comportamientos--------------------------------
    public void CobrarMensualidadUsuario(EntrenadorPersonalizadoId entrenadorPersonalizadoId, MensualidadUsuario mensualidadUsuario){
        appendChange(new MensualidadUsuarioCobrada(entrenadorPersonalizadoId,mensualidadUsuario)).apply();
    }


    public void PagarObligacionesSociales(EntrenadorPersonalizadoId entrenadorPersonalizadoId, ObligacionSocial obligacionSocial){
        appendChange(new OlbigacionesSocialesPagadas(entrenadorPersonalizadoId,obligacionSocial)).apply();
    }

}
