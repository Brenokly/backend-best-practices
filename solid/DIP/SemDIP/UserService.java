
// UserService depende diretamente de EmailServiceImpl, dificultando testes
// futuras manutenções e mudança. Se amanhã eu quiser mudar esse serviço de email
// para um outro tipo de serviço de envio de notificação, eu teria que alterar a implementação
// de userService!
public class UserService {

    private final EmailServiceImpl emailService = new EmailServiceImpl();

    public void register(String email) {
        emailService.sendEmail(email, "Bem-vindo!");
    }
}
