
// Agora UserService depende de uma abstração (interface).
// E isso que o princípio DIP prega: dependa de abstrações,
// não de implementações.
public interface EmailService {

    void sendEmail(String to, String content);
}
