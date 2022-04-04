package gym.values;

import co.com.sofka.domain.generic.ValueObject;

import java.util.Objects;

public class Postura implements ValueObject<String> {

    private final String value;

    //En los VO se deberia hacer las comparaciones
    public Postura(String value) {
        this.value = Objects.requireNonNull(value); //Que no sea nulo

        //Verificaciones--------------
        if(this.value.isBlank()) //Que no sea vacio
            new IllegalArgumentException("La postura no puede estar vacia.");

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
        Postura postura = (Postura) o;
        return Objects.equals(value, postura.value);
    }

    @Override
    public int hashCode() {
        return Objects.hash(value);
    }


    @Override
    public String toString() {
        return "Postura{" +
                "value='" + value + '\'' +
                '}';
    }
}
