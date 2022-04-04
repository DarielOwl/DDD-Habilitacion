package gym;

import co.com.sofka.domain.generic.Entity;
import gym.values.*;
import usuario.values.Nombre;
import usuario.values.UsuarioId;

import java.util.Objects;
import java.util.Set;

public class EntrenadorPersonalizado extends Entity<EntrenadorPersonalizadoId> {

    //Atributos
    private UsuarioId usuarioId;
    private Nombre nombre;
    private ContratoPrestacionServicio contratoPrestacionServicio;
    private Rutina rutina;
    private Ejercicio ejercicio;
    private MensualidadUsuario mensualidadUsuario;
    private ObligacionSocial obligacionSocial;

    //Constructor
    public EntrenadorPersonalizado(EntrenadorPersonalizadoId entityId, UsuarioId usuarioId, Nombre nombre, ContratoPrestacionServicio contratoPrestacionServicio, Rutina rutina, Ejercicio ejercicio, MensualidadUsuario mensualidadUsuario) {
        super(entityId);
        this.usuarioId = usuarioId;
        this.nombre = nombre;
        this.contratoPrestacionServicio = contratoPrestacionServicio;
        this.rutina = rutina;
        this.ejercicio = ejercicio;
        this.mensualidadUsuario = mensualidadUsuario;
    }


    //Comportamientos---------------------
    public String AconsejarRutina(Rutina rutina){
        this.rutina = Objects.requireNonNull(rutina);
        return "Como hacer la rutina:\n" + this.rutina.toString();
    }

    public String AconsejarEjercicio(Ejercicio ejercicio){
        this.ejercicio = Objects.requireNonNull(ejercicio);
        return "Como hacer el ejercicio:\n" + this.ejercicio.toString();
    }

    //Le asigna el usuario al Entrenador Personalizado
    public void AcompañarUsuario(UsuarioId usuarioId){
        this.usuarioId = Objects.requireNonNull(usuarioId);
    }

    public void CobrarMensualidadUsuario(MensualidadUsuario mensualidadUsuario){
        this.mensualidadUsuario = Objects.requireNonNull(mensualidadUsuario);
    }

    public void PagarObligacionesSociales(ObligacionSocial obligacionSocial){
        this.obligacionSocial = Objects.requireNonNull(obligacionSocial);
    }

    public String BrindarClasesGrupales(){
        return "Dirigir clase grupal\n";
    }

    //Getters----------------------
    public UsuarioId getUsuarioId() {
        return usuarioId;
    }

    public Nombre getNombre() {
        return nombre;
    }

    public ContratoPrestacionServicio getContratoPrestacionServicio() {
        return contratoPrestacionServicio;
    }

    public Rutina getRutina() {
        return rutina;
    }

    public Ejercicio getEjercicio() {
        return ejercicio;
    }

    public MensualidadUsuario getMensualidadUsuario() {
        return mensualidadUsuario;
    }

}
