import java.time.LocalDate;

class Pasaporte {
    private String numero;
    private String nacionalidad;
    private LocalDate fechaEmision;
    private LocalDate fechaVencimiento;
    private boolean estaVigente;

    public Pasaporte(String numero, String nacionalidad, LocalDate fechaEmision, LocalDate fechaVencimiento, boolean estaVigente) {
        this.numero = numero;
        this.nacionalidad = nacionalidad;
        this.fechaEmision = fechaEmision;
        this.fechaVencimiento = fechaVencimiento;
        this.estaVigente = estaVigente;
    }

    public boolean isEstaVigente() {
        return estaVigente;
    }
}