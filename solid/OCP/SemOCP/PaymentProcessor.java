// Classe PaymentProcess precisa ser modificada toda vez que adicionamos um novo método de pagamento.
public class PaymentProcessor {
    public void processPayment(String type) {
        if (type.equals("PIX")) {
            System.out.println("Pagamento via PIX");
        } else if (type.equals("CREDIT_CARD")) {
            System.out.println("Pagamento via Cartão de Crédito");
        } else if (type.equals("BOLETO")) {
            System.out.println("Pagamento via Boleto");
        }
    }
}
