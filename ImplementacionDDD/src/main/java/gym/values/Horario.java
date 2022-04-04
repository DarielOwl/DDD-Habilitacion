package gym.values;

import co.com.sofka.domain.generic.ValueObject;

import java.time.LocalDate;
import java.util.Date;
import java.util.Objects;

public class Horario implements ValueObject<Date> {

    private final Date value;

    //En los VO se deberia hacer las comparaciones
    public Horario(Date value) {
        this.value = Objects.requireNonNull(value); //Que no sea nulo
    }

    //Este vendria ser el get para obtener el objeto valor
    @Override
    public Date value() {
        return value;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Horario horario = (Horario) o;
        return Objects.equals(value, horario.value);
    }

    @Override
    public int hashCode() {
        return Objects.hash(value);
    }
}
