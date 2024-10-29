package modelos;

import java.util.Objects;

public class Registro {
    private String dni;
    private Double temperatura;

    public Registro(String dni, double temperatura) {
        this.dni = dni;
        this.temperatura = temperatura;
    }

    public String getDni() {
        return dni;
    }

    public double getTemperatura() {
        return temperatura;
    }

    @Override
    public String toString() {
        return "DNI: " + dni + ", Temperatura: " + temperatura + "°C";
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (!(o instanceof Registro registro)) return false;
        return Objects.equals(dni, registro.dni) && Objects.equals(temperatura, registro.temperatura);
    }

    @Override
    public int hashCode() {
        return Objects.hash(dni, temperatura);
    }
}
