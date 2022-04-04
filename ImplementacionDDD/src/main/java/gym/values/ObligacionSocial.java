package gym.values;

import co.com.sofka.domain.generic.ValueObject;

import java.util.Objects;

public class ObligacionSocial implements ValueObject<Double> {

    private final Double value;

    //En los VO se deberia hacer las comparaciones
    public ObligacionSocial(Double value) {
        this.value = Objects.requireNonNull(value); //Que no sea nulo
    }

    //Este vendria ser el get para obtener el objeto valor
    @Override
    public Double value() {
        return value;
    }

}
