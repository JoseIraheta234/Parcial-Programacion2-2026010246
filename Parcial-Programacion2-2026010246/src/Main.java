public class Main {
    public static void main(String[] args) {
        EstrategiaComision estrategiaEstandar = new ComisionEstandar();
        Vendedor vendedor = new Vendedor("José", 1000.0, estrategiaEstandar);

        vendedor.mostrarDetalle();
    }
}