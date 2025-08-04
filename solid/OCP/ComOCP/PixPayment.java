
public class PixPayment implements PaymentMethod {

    @Override
    public void pay() {
        System.out.println("Pagamento via PIX");
    }
}
