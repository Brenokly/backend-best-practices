
public class BasicPrinter implements IMachine {

    @Override
    public void print() {
        System.out.println("Imprimindo...");
    }

    @Override
    public void scan() {
        throw new UnsupportedOperationException();
    }

    @Override
    public void fax() {
        throw new UnsupportedOperationException();
    }
}
