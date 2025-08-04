
public class PaymentProcessor {

    public void process(PaymentMethod method) {
        method.pay();
    }
}

// Uso:
// PaymentProcessor processor = new PaymentProcessor();
// processor.process(new PixPayment());
