package gym.values;

import co.com.sofka.domain.generic.ValueObject;

import java.util.Objects;

public class AppMovil implements ValueObject<Ejercicio> {

    private final Ejercicio value;

    //En los VO se deberia hacer las comparaciones
    public AppMovil(Ejercicio value) {
        this.value = Objects.requireNonNull(value); //Que no sea nulo
    }

    //Este vendria ser el get para obtener el objeto valor
    @Override
    public Ejercicio value() {
        return value;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        AppMovil appMovil = (AppMovil) o;
        return Objects.equals(value, appMovil.value);
    }

    @Override
    public int hashCode() {
        return Objects.hash(value);
    }
}
