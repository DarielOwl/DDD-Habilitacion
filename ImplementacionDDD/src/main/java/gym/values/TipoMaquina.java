package gym.values;

import co.com.sofka.domain.generic.ValueObject;

import java.util.Objects;

public class TipoMaquina implements ValueObject<String> {

    private final String value;

    //En los VO se deberia hacer las comparaciones
    public TipoMaquina(String value) {
        this.value = Objects.requireNonNull(value); //Que no sea nulo

        //Verificaciones--------------
        if(this.value.isBlank()) //Que no sea vacio
            new IllegalArgumentException("El Tipo Maquina no puede estar vacio.");

    }

    //Este vendria ser el get para obtener el objeto valor
    @Override
    public String value() {
        return value;
    }

}
