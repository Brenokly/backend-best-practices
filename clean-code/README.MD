## 📁 `clean-code/README.md`

# 🧼 Clean Code

**Clean Code** é um conjunto de práticas para escrever código **simples, claro e fácil de manter**.
Não se trata apenas de "funcionar", mas de tornar o código **legível, expressivo e sustentável**.

---

## 🔑 Princípios básicos
1. **Nomes claros e significativos**
   - Variáveis e funções devem refletir sua real intenção.
   ```java
   // Ruim
   int d; // dias?
   // Bom
   int diasRestantesParaEntrega;

2. **Funções pequenas e coesas**

   * Cada função deve fazer apenas **uma coisa bem feita**.

3. **Evitar duplicação de código**

   * Use métodos reutilizáveis e extraia lógica repetida.

4. **Eliminar comentários desnecessários**

   * Código limpo deve ser autoexplicativo, reduzindo a necessidade de comentários redundantes.

5. **Reduzir dependências desnecessárias**

   * Não acople classes ou módulos que podem mudar independentemente.

---

## 📂 Estrutura desta pasta

```
📂 clean-code/
 ├── README.md
 └── exemplos/
     ├── nomes-claros/
     ├── funcoes-pequenas/
     ├── eliminar-duplicacao/
     └── ...
```

Cada exemplo mostrará um **"código ruim" e sua refatoração limpa**.

---