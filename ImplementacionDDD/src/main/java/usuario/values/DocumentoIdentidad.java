package usuario.values;

import co.com.sofka.domain.generic.ValueObject;

import java.util.Objects;

public class DocumentoIdentidad implements ValueObject<String> {
    private final String value;

    //En los VO se deberia hacer las comparaciones
    public DocumentoIdentidad(String value) {
        this.value = Objects.requireNonNull(value); //Que no sea nulo

        //Verificaciones--------------
        if(this.value.isBlank()) //Que no sea vacio
            new IllegalArgumentException("El Docuemnto de Identidad no puede estar vacio");

    }

    //Este vendria ser el get para obtener el objeto valor
    @Override
    public String value() {
        return value;
    }
}
