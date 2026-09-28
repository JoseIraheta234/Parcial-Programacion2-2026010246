public class Vendedor extends Empleado {

    public Vendedor(String nombre, double ventasMes, EstrategiaComision estrategia) {
        super(nombre, ventasMes, estrategia);
    }

    @Override
    public void mostrarDetalle() {
        double comision = estrategia.calcularComision(ventasMes);
        System.out.println("===== DETALLE DE VENTAS =====");
        System.out.println("Empleado: " + nombre);
        System.out.println("Venta Total del Mes: $" + ventasMes);
        System.out.println("Comisión Calculada: $" + comision);
        System.out.println("=============================");
    }
}