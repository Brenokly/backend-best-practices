# 🏗 Backend Best Practices: Clean Code, SOLID e Clean Architecture

> **Repositório de estudo e demonstração de boas práticas de programação backend.**  
> Aplicando princípios como **Clean Code**, **SOLID**, **Clean Architecture**, **Design Patterns** e **boas práticas de testes automatizados**.

---

## 🎯 Objetivo
Este repositório tem como objetivo documentar e exemplificar boas práticas de desenvolvimento backend, criando um guia prático e incremental para escrever **código limpo, sustentável, escalável e fácil de manter**.

A ideia é que cada conceito seja apresentado com:
- **Explicação teórica resumida**
- **Exemplos práticos (antes e depois)**
- **Aplicação em pequenos projetos ou APIs**

---

## 📚 Conteúdo do Repositório

A estrutura será organizada por temas:

```

📂 backend-best-practices
├── 📂 solid/                # Princípios SOLID
│    ├── README.md
│    └── exemplos/
│
├── 📂 clean-code/           # Código limpo e refatorações
│    ├── README.md
│    └── exemplos/
│
├── 📂 clean-architecture/   # Aplicação da Arquitetura Limpa
│    ├── README.md
│    └── projeto/
│
├── 📂 design-patterns/      # Padrões de projeto (GoF e práticos)
│    ├── README.md
│    └── exemplos/
│
├── 📂 testing/              # Boas práticas de testes (TDD, unitários, integração)
│    ├── README.md
│    └── exemplos/
│
└── README.md

````

---

## 🚀 Tecnologias Utilizadas
Este repositório irá focar em linguagens e frameworks amplamente usados no backend:

- **Java (Spring Boot)** – para Clean Architecture, SOLID e APIs REST
- **Node.js (TypeScript)** – para práticas rápidas e exemplos de APIs limpas

Cada conceito terá exemplos implementados **em pelo menos uma dessas linguagens**.

---

## 📌 Tópicos Estudados
- ✅ **SOLID**
  - SRP – Single Responsibility Principle
  - OCP – Open/Closed Principle
  - LSP – Liskov Substitution Principle
  - ISP – Interface Segregation Principle
  - DIP – Dependency Inversion Principle
- ✅ **Clean Code**
  - Nomeação de variáveis e funções
  - Funções pequenas e responsabilidades claras
  - Eliminação de código duplicado
  - Comentários desnecessários e más práticas
- 🔄 **Clean Architecture**
  - Entidades, Casos de Uso, Interfaces e Infraestrutura
  - Separação de camadas e dependências invertidas
- 🔄 **Design Patterns**
  - Singleton, Factory, Strategy, Observer, Repository
  - Aplicações práticas no backend
- 🔄 **Testing**
  - Testes unitários (JUnit, Jest, PyTest)
  - TDD e cobertura de testes
  - Testes de integração para APIs

---

## 🛠 Roadmap de Evolução
```
- [x] Revisar e aplicar princípios SOLID
- [x] Criar exemplos de refatoração com Clean Code
- [ ] Implementar API usando Clean Architecture
- [ ] Aplicar padrões de projeto em casos reais
- [ ] Configurar testes automatizados com boas práticas
- [ ] Documentar boas práticas de versionamento e CI/CD
````

---

## 🧠 Filosofia do Projeto

O foco é estudar e aplicar:

* **Código simples e expressivo** (Clean Code)
* **Arquitetura desacoplada e flexível** (Clean Architecture, SOLID)
* **Testabilidade e manutenção** (TDD, CI/CD)
* **Documentação clara e didática**

---

## 📂 Como Executar os Exemplos

Cada pasta contém um **README.md** específico com:

* Explicação do conceito abordado
* Passos para rodar os exemplos

Exemplo:

```bash
cd solid/srp/exemplos/java
mvn spring-boot:run
```

---

## 🧩 Exemplo Inicial (SRP – Single Responsibility Principle)

### Código Ruim (violando SRP)

```java
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
```

### Código Bom (aplicando SRP)

```java
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

public class EmailService {
    public void sendEmail(String to, String content) {
        System.out.println("Enviando email para " + to + ": " + content);
    }
}

public class LogService {
    public void log(String message) {
        System.out.println("Log: " + message);
    }
}
```

---

## 🤝 Contribuições

Este repositório é público e qualquer contribuição é bem-vinda!
Se quiser sugerir melhorias, envie uma **issue** ou abra um **pull request**.

---

## 📝 Licença

Este projeto é distribuído sob a licença MIT.
Sinta-se livre para usar e adaptar os exemplos conforme necessário.

---

> **Autor:** Breno Klywer
> 💼 [LinkedIn](https://www.linkedin.com/in/brenokl/) | 🌐 [GitHub](https://github.com/seu-usuario)

```

---
