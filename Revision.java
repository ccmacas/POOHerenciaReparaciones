package reparaciones;

class Revision extends Trabajo {

    public Revision() {
    }

    @Override
    public double calcularCosto() {
        this.costoTrabajo = super.calcularCosto() + (this.numeroHoras * 20);
        return this.costoTrabajo;
    }
}

class PruebaTrabajos {

    public static void main(String[] args) {
        ReparacionMecanica reparacionMecan1 = new ReparacionMecanica(100, 0,
                "Es mi reparacionMecan1", 10, "Iniciado", 0, 14);
        System.out.println("\nREPARACION MECAN.1\n==================\n"
                + reparacionMecan1);
        reparacionMecan1.calcularCosto();
        System.out.println("\nREPARACION MECAN.1 <costoTrab. Update>"
                + "\n==================\n” "
                + reparacionMecan1);
        System.out.println("\n”"
                + reparacionMecan1.aumentarPrecioMat(15));
        System.out.println("\nREPARACION MECAN.1\n"
                + "==================\n"
                + reparacionMecan1);
        System.out.println("\n” "
                + reparacionMecan1.aumentarHoras(25));
        System.out.println("\nREPARACION MECAN.1\n"
                + "==================\n"
                + reparacionMecan1);
        reparacionMecan1.setEstado("finalizado");
        System.out.println("\n" + reparacionMecan1.aumentarHoras(25));
    }
}
