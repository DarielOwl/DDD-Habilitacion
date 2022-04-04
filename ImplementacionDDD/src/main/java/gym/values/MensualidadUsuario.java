package gym.values;

import co.com.sofka.domain.generic.ValueObject;

import java.util.Objects;

public class MensualidadUsuario implements ValueObject<Double> {
    private final Double value;

    //En los VO se deberia hacer las comparaciones
    public MensualidadUsuario(Double value) {
        this.value = Objects.requireNonNull(value); //Que no sea nulo
    }

    //Este vendria ser el get para obtener el objeto valor
    @Override
    public Double value() {
        return value;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        MensualidadUsuario that = (MensualidadUsuario) o;
        return Objects.equals(value, that.value);
    }

    @Override
    public int hashCode() {
        return Objects.hash(value);
    }
}
