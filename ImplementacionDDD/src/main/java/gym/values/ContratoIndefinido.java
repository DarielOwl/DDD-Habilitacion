package gym.values;

import co.com.sofka.domain.generic.ValueObject;

import java.util.Objects;

public class ContratoIndefinido implements ValueObject<String> {

    private final String value;

    //En los VO se deberia hacer las comparaciones
    public ContratoIndefinido(String value) {
        this.value = Objects.requireNonNull(value); //Que no sea nulo

        //Verificaciones--------------
        if(this.value.isBlank()) //Que no sea vacio
            new IllegalArgumentException("El Contrato Indefinido no puede estar vacio.");

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
        ContratoIndefinido that = (ContratoIndefinido) o;
        return Objects.equals(value, that.value);
    }

    @Override
    public int hashCode() {
        return Objects.hash(value);
    }
}
