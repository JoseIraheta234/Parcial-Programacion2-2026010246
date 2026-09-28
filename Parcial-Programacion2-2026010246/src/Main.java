public class Main {
    public static void main(String[] args) {
        EstrategiaComision estrategiaEstandar = new ComisionEstandar();
        Vendedor vendedor = new Vendedor("Carlos", 1000.0, estrategiaEstandar);

        vendedor.mostrarDetalle();
    }
}