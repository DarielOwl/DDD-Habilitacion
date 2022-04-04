package gym.values;

import co.com.sofka.domain.generic.ValueObject;

import java.util.Objects;

public class Rutina implements ValueObject<String> {

    private final String value;

    //En los VO se deberia hacer las comparaciones
    public Rutina(String value) {
        this.value = Objects.requireNonNull(value); //Que no sea nulo

        //Verificaciones--------------
        if(this.value.isBlank()) //Que no sea vacio
            new IllegalArgumentException("La Rutina no puede estar vacia.");
    }

    //Este vendria ser el get para obtener el objeto valor
    @Override
    public String value() {
        return value;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Rutina rutina = (Rutina) o;
        return Objects.equals(value, rutina.value);
    }

    @Override
    public int hashCode() {
        return Objects.hash(value);
    }
}
