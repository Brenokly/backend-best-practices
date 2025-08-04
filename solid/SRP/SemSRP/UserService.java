// Classe UserService com múltiplas responsabilidades:
// cadastrar usuário, enviar email e registrar logs.
// Isso dificulta manutenção e testes.

public class UserService {

    public void registerUser(String name, String email) {
        // Lógica de cadastro
        System.out.println("Usuário cadastrado: " + name);

        // Envio de email (responsabilidade extra)
        System.out.println("Enviando email para " + email);

        // Registro de log (responsabilidade extra)
        System.out.println("Log: usuário registrado com sucesso");
    }
}

// Aqui está acontecendo uma violação do princípio SRP (Single Responsability Principle)
