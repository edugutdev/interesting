import java.time.LocalDate;
import java.util.Objects;


public final class CalculadoraVencimientos {


    public static LocalDate calcularVencimiento(LocalDate fecha, int dias, int meses, int anios) {
        Objects.requireNonNull(fecha, "La fecha no puede ser null");
        return fecha.plusYears(anios).plusMonths(meses).plusDays(dias);
    }
}
