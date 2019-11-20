package reparaciones;

public class Trabajo {

    public int id;
    public String descripcion;
    public double numeroHoras;
    public String estado;
    public double costoTrabajo;
    public int plazo;

    public Trabajo() {
    }

    public Trabajo(int id, String descripcion, double numeroHoras, String estado, double costoTrabajo, int plazo) {
        this.id = id;
        this.descripcion = descripcion;
        this.numeroHoras = numeroHoras;
        this.estado = estado;
        this.costoTrabajo = costoTrabajo;
        this.plazo = plazo;
    }

    public String aumentarHoras(double numeroHoras) {
        String msj = "Error, estado del trabajo: finalizado";
        if (!this.estado.equals("finalizado")) {
            this.numeroHoras += numeroHoras;
            msj = "Horas actualizadas con: " + numeroHoras;
        }
        return msj;
    }

    public double calcularCosto() {
        costoTrabajo = numeroHoras * 30;
        return costoTrabajo;
    }

    public void setEstado(String estado) {
        this.estado = estado;
    }

    public String toString() {
        return String.format("Id: %d \nDescripcion: %s"
                + "\nNumero de horas: %.2f"
                + "\nEstado: %s \nCosto de trabajo: %.2f"
                + "\nPlazo: %d", id, descripcion, numeroHoras, estado,
                costoTrabajo, plazo);
    }
}
