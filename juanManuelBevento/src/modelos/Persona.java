package modelos;

public class Persona {
    private String nombre;
    private String apellido;
    private Integer edad;
    private String barrio;
    private String dni;
    private String ocupacion;
    private Integer numeroKit;

    public Persona(String nombre, String apellido, Integer edad, String barrio, String dni, String ocupacion, Integer numeroKit) {
        this.nombre = nombre;
        this.apellido = apellido;
        this.edad = edad;
        this.barrio = barrio;
        this.dni = dni;
        this.ocupacion = ocupacion;
        this.numeroKit = numeroKit;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public String getApellido() {
        return apellido;
    }

    public void setApellido(String apellido) {
        this.apellido = apellido;
    }

    public Integer getEdad() {
        return edad;
    }

    public void setEdad(Integer edad) {
        this.edad = edad;
    }

    public String getBarrio() {
        return barrio;
    }

    public void setBarrio(String barrio) {
        this.barrio = barrio;
    }

    public String getDni() {
        return dni;
    }

    public void setDni(String dni) {
        this.dni = dni;
    }

    public String getOcupacion() {
        return ocupacion;
    }

    public void setOcupacion(String ocupacion) {
        this.ocupacion = ocupacion;
    }

    public Integer getNumeroKit() {
        return numeroKit;
    }

    public void setNumeroKit(Integer numeroKit) {
        this.numeroKit = numeroKit;
    }

    @Override
    public String toString() {
        return "nombre:" + nombre +", apellido:" + apellido +", edad:" + edad + ", barrio:" + barrio + ", dni: " + dni + ", ocupacion: " + ocupacion + ", numeroKit: " + numeroKit;
    }
}
