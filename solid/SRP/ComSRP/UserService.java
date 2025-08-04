// Agora, cada classe (UserService) tem apenas UMA responsabilidade.

public class UserService {

    private final EmailService emailService;
    private final LogService logService;

    public UserService(EmailService emailService, LogService logService) {
        this.emailService = emailService;
        this.logService = logService;
    }

    public void registerUser(String name, String email) {
        System.out.println("Usuário cadastrado: " + name);
        emailService.sendEmail(email, "Bem-vindo, " + name);
        logService.log("Usuário " + name + " registrado com sucesso");
    }
}
