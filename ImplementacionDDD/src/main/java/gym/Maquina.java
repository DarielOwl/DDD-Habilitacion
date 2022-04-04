package gym;

import co.com.sofka.domain.generic.Entity;
import gym.values.MaquinaId;
import gym.values.TipoMaquina;

public class Maquina extends Entity<MaquinaId> {

    private TipoMaquina tipoMaquina;

    //Constructor
    public Maquina(MaquinaId entityId, TipoMaquina tipoMaquina) {
        super(entityId);
        this.tipoMaquina = tipoMaquina;
    }

    //Getters---------------------
    public TipoMaquina getTipoMaquina() {
        return tipoMaquina;
    }
}
