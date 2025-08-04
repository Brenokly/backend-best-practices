
public class CreditCardPayment implements PaymentMethod {

    @Override
    public void pay() {
        System.out.println("Pagamento via Cartão de Crédito");
    }
}
