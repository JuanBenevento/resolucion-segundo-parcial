package modelos;

public class ExcepcionTempreaturaMayor extends Exception {
    private int numeroKit;
    private String barrio;

    public ExcepcionTempreaturaMayor(int numeroKit, String barrio) {
        super("La persona con kit #" + numeroKit + " del barrio " + barrio + " tiene fiebre alta.");
        this.numeroKit = numeroKit;
        this.barrio = barrio;
    }

    public int getNumeroKit() {
        return numeroKit;
    }

    public String getBarrio() {
        return barrio;
    }

}
