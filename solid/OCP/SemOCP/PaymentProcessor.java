// Classe PaymentProcess precisa ser modificada toda vez que adicionamos um novo método de pagamento.

public class PaymentProcessor {

    public void processPayment(String type) {
        switch (type) {
            case "PIX" ->
                System.out.println("Pagamento via PIX");
            case "CREDIT_CARD" ->
                System.out.println("Pagamento via Cartão de Crédito");
            case "BOLETO" ->
                System.out.println("Pagamento via Boleto");
            default -> {
            }
        }
    }
}
