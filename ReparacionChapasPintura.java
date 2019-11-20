package reparaciones;

class ReparacionChapasPintura extends Trabajo {

    public double precioMaterial;

    public ReparacionChapasPintura() {
    }

    public ReparacionChapasPintura(double precioMaterial) {
        this.precioMaterial = precioMaterial;
    }

    public ReparacionChapasPintura(double precioMaterial, int id, String descripcion,
            double numeroHoras, String estado,
            double costoTrabajo, int plazo) {
        super(id, descripcion, numeroHoras, estado, costoTrabajo, plazo);
        this.precioMaterial = precioMaterial;
    }

    public double calcularCostoTrabajo() {
        this.costoTrabajo = super.calcularCosto() + (costoTrabajo * 1.3);
        return this.costoTrabajo;
    }

    public String aumentarPrecioMat(double precioMaterial) {
        String msj = "Error, estado del trabajo: finalizado";
        if (!this.estado.equals("finalizado")) {
            this.precioMaterial += precioMaterial;
            msj = "Precio del material aumentado con: $”"
                    + precioMaterial;
        }
        return msj;
    }

    @Override
    public String toString() {

        return String.format("%s \nPrecio de material: &%.2f",
                super.toString(), precioMaterial);
    }
}
