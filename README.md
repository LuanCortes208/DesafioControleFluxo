# **Sistema de Validação de Processo Seletivo em Java**

Programa que valida parâmetros e executa contagem personalizada, demonstrando tratamento de exceções em Java.

## 📝 **Funcionalidades**
- **Validação de parâmetros**: Verifica se o segundo número é maior que o primeiro
- **Contagem inteligente**: Calcula e imprime a diferença entre os números
- **Tratamento robusto**: Exceção personalizada (`ParametrosInvalidosException`)
- **Gerenciamento de recursos**: Fecha `Scanner` automaticamente no `finally`

## 🛠️ **Como Executar**
1. Clone o repositório:
```bash
git clone https://github.com/LuanCortes208/DesafioControleFluxo.git
```

2. Compile e execute
```bash
javac Contador.java
java Contador
```

3. Siga as instruções no terminal
```bash
Digite o primeiro parâmetro: [valor]
Digite o segundo parâmetro: [valor]
```

## ⚙️ **Lógica do Programa**
### **Fluxo Principal**
Recebe dois números inteiros como entrada

Verifica se o segundo parâmetro é maior que o primeiro

Se válidos, imprime uma contagem progressiva

Se inválidos, lança exceção personalizada

### **Métodos Implementados**
**verificar()**: Valida os parâmetros usando ParametrosInvalidosException

**contar()**: Executa a contagem baseada na diferença entre números

**main()**: Gerencia o fluxo e recursos (com try-catch-finally)

## 🧠 **Conceitos Aplicados**
✔ Tratamento de exceções personalizadas
✔ Controle de fluxo com try-catch-finally
✔ Manipulação de entrada/saída com Scanner
✔ Boas práticas de fechamento de recursos
