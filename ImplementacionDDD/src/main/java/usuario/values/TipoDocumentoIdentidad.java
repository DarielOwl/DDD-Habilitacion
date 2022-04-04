package usuario.values;

import co.com.sofka.domain.generic.ValueObject;

import java.util.Objects;

public class TipoDocumentoIdentidad implements ValueObject<String> {

    private final String value;

    public TipoDocumentoIdentidad(String value) {
        this.value = Objects.requireNonNull(value); //Que no sea nulo

        //Verificaciones--------------
        if(this.value.isBlank()) //Que no sea vacio
            new IllegalArgumentException("El Documento debe tener un tipo");
    }


    @Override
    public String value() {
        return value;
    }


    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        TipoDocumentoIdentidad that = (TipoDocumentoIdentidad) o;
        return Objects.equals(value, that.value);
    }

    @Override
    public int hashCode() {
        return Objects.hash(value);
    }

}
