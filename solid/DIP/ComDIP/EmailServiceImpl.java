
public class EmailServiceImpl implements EmailService {

    @Override
    public void sendEmail(String to, String content) {
        System.out.println("Enviando email: " + content);
    }
}
