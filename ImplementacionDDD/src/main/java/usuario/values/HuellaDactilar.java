package usuario.values;

import co.com.sofka.domain.generic.ValueObject;

import java.util.Objects;

public class HuellaDactilar implements ValueObject<String> {
    private final String value;

    //En los VO se deberia hacer las comparaciones
    public HuellaDactilar(String value) {
        this.value = Objects.requireNonNull(value); //Que no sea nulo

        //Verificaciones--------------
        if(this.value.isBlank()) //Que no sea vacio
            new IllegalArgumentException("La Huella Dactilar no puede estar vacia.");

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
        HuellaDactilar that = (HuellaDactilar) o;
        return Objects.equals(value, that.value);
    }

    @Override
    public int hashCode() {
        return Objects.hash(value);
    }
}
