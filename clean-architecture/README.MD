## 📁 `clean-architecture/README.md`

# 🏛 Clean Architecture

**Clean Architecture** é um padrão arquitetural que separa regras de negócio da infraestrutura, promovendo **baixo acoplamento** e **alta testabilidade**.

---

## 🔑 Conceitos principais
- **Entities (Domínio):** Regras de negócio independentes de qualquer tecnologia.
- **Use Cases (Aplicação):** Casos de uso que orquestram as entidades.
- **Interface Adapters:** Adaptadores que traduzem dados entre a aplicação e frameworks.
- **Frameworks & Drivers:** Detalhes externos, como bancos de dados e APIs REST.

---

## 🎨 Camadas da arquitetura
```

+----------------------+
\|   Framework & UI     |  -> (ex: Controllers, REST)
+----------------------+
\|  Interface Adapters  |  -> (DTOs, Repositórios)
+----------------------+
\|     Use Cases        |  -> (Lógica de aplicação)
+----------------------+
\|      Entities        |  -> (Regras de negócio)
+----------------------+

```
---
```

## 📂 Estrutura desta pasta

📂 clean-architecture/
├── README.md
└── projeto/
├── entities/
├── usecases/
├── adapters/
└── infra/
```
---
