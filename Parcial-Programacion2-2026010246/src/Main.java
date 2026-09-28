public class Main {
    public static void main(String[] args) {
        int letrasPrimerNombre = 4;
        EstrategiaComision estrategiaPersonalizada = new ComisionPersonalizada(letrasPrimerNombre);

        Vendedor vendedor = new Vendedor("José", 1000.0, estrategiaPersonalizada);
        vendedor.mostrarDetalle();
    }
}