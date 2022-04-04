package gym;

import co.com.sofka.domain.generic.Entity;
import gym.values.*;
import usuario.values.Nombre;

import java.util.Objects;
import java.util.Set;

public class EntrenadorPlanta extends Entity<EntrenadorPlantaId> {

    //Atributos
    private Nombre nombre;
    private ContratoIndefinido contratoIndefinido;
    private Horario horario;
    private AppMovil appMovil;
    private Postura postura;
    private Ejercicio ejercicio;
    private Set<Maquina> maquinas;

    //Constructor
    public EntrenadorPlanta(EntrenadorPlantaId entityId, Nombre nombre, ContratoIndefinido contratoIndefinido, Horario horario, AppMovil appMovil, Postura postura, Ejercicio ejercicio, Set<Maquina> maquinas) {
        super(entityId);
        this.nombre = nombre;
        this.contratoIndefinido = contratoIndefinido;
        this.horario = horario;
        this.appMovil = appMovil;
        this.postura = postura;
        this.ejercicio = ejercicio;
        this.maquinas = maquinas;
    }

    //Comportamientos---------------------
    public String AsesorarUsuarioEnMaquinas(Set<Maquina> maquinas){
        this.maquinas = Objects.requireNonNull(maquinas);
        return "Tipos de Maquinas:\n" + this.maquinas.toString();
    }

    public String AsesorarUsuarioEnEjercicios(Ejercicio ejercicio){
        this.ejercicio = Objects.requireNonNull(ejercicio);
        return "Ejercicios a Realizar:\n" + this.ejercicio.toString();
    }

    public String AsesorarUsuarioEnPosturas(Postura postura){
        this.postura = Objects.requireNonNull(postura);
        return "Posturas a Realizar:\n" + this.postura.toString();
    }

    public String GuiarEnAppMovil(AppMovil appMovil){
        this.appMovil = Objects.requireNonNull(appMovil);
        return "Ejercicios de la AppMovil:\n" + this.appMovil.toString();
    }

    //Getters
    public Nombre nombre() {
        return nombre;
    }

    public ContratoIndefinido contratoIndefinido() {
        return contratoIndefinido;
    }

    public Horario horario() {
        return horario;
    }

    public AppMovil appMovil() {
        return appMovil;
    }

    public Postura postura() {
        return postura;
    }

    public Ejercicio ejercicio() {
        return ejercicio;
    }
    
}
