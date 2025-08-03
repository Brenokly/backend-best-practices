## 📁 `solid/README.md`

# 🧩 Princípios SOLID

Os princípios SOLID são cinco diretrizes fundamentais para design orientado a objetos que facilitam a manutenção, evolução e escalabilidade do software.

---

## 🔑 Os 5 Princípios
1. **SRP (Single Responsibility Principle)**
   - Uma classe deve ter **apenas uma responsabilidade**.
   - Exemplo: Separar cadastro de usuário do envio de e-mails.

2. **OCP (Open/Closed Principle)**
   - Classes devem estar **abertas para extensão** e **fechadas para modificação**.
   - Exemplo: Adicionar novos métodos de pagamento sem alterar o código existente.

3. **LSP (Liskov Substitution Principle)**
   - Subclasses devem poder **substituir suas superclasses** sem quebrar o código.
   - Exemplo: Se `Quadrado` herda de `Retângulo`, ele deve se comportar como tal.

4. **ISP (Interface Segregation Principle)**
   - Criar interfaces **específicas e pequenas**, em vez de uma única interface genérica.
   - Exemplo: Interfaces distintas para `IPrinter` e `IScanner`, em vez de `IMachine`.

5. **DIP (Dependency Inversion Principle)**
   - Dependa de abstrações, não de implementações concretas.
   - Exemplo: Usar interfaces para injetar dependências em vez de classes fixas.

---

## 🧩 Estrutura desta pasta
```

📂 solid/
├── 📂 srp/   # Single Responsibility Principle
├── 📂 ocp/   # Open/Closed Principle
├── 📂 lsp/   # Liskov Substitution Principle
├── 📂 isp/   # Interface Segregation Principle
└── 📂 dip/   # Dependency Inversion Principle

```
---