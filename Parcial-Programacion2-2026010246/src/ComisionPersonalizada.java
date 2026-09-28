public class ComisionPersonalizada implements EstrategiaComision {
    private final int cantidadLetrasNombre;

    public ComisionPersonalizada(int cantidadLetrasNombre) {
        this.cantidadLetrasNombre = cantidadLetrasNombre;
    }

    @Override
    public double calcularComision(double montoVenta) {
        double porcentaje = (5.0 + cantidadLetrasNombre) / 100.0;
        return montoVenta * porcentaje;
    }
}