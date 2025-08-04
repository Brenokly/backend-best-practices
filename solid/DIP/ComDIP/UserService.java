
// Agora userService depende de uma abstração (EmailService)
// e não de uma implementação concreta (SmtpEmailService).
// Logo, amanhã, se quisermos trocar a implementação do serviço de email,
// não precisaremos alterar o UserService, apenas injetar uma nova implementação.
public class UserService {

    private final EmailService emailService;

    public UserService(EmailService emailService) {
        this.emailService = emailService;
    }

    public void register(String email) {
        emailService.sendEmail(email, "Bem-vindo!");
    }
}
