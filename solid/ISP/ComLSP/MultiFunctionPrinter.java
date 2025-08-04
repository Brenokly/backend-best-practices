
public class MultiFunctionPrinter implements Printer, Scanner {

    @Override
    public void print() {
        System.out.println("Imprimindo...");
    }

    @Override
    public void scan() {
        System.out.println("Escaneando...");
    }
}
