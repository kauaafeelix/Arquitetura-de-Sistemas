# Arquitetura de Sistemas - Princípios SOLID

Este repositório contém exemplos práticos de implementação dos princípios SOLID em Java, desenvolvidos para estudo e demonstração de boas práticas de arquitetura de software.

## 📚 O que são os Princípios SOLID?

SOLID é um acrônimo que representa cinco princípios fundamentais da programação orientada a objetos:

- **S** - Single Responsibility Principle (SRP)
- **O** - Open/Closed Principle (OCP)
- **L** - Liskov Substitution Principle (LSP)
- **I** - Interface Segregation Principle (ISP)
- **D** - Dependency Inversion Principle (DIP)

## 📁 Estrutura do Projeto

```
├── SRP/          # Exemplo 1 - Single Responsibility Principle (Funcionários)
├── SRP2/         # Exemplo 2 - Single Responsibility Principle (Pedidos)
├── OCP/          # Open/Closed Principle (Sistema de Descontos)
└── LSP/          # Liskov Substitution Principle (exemplos e notas)
```

## 📂 Diretórios

### [SRP - Single Responsibility Principle (Exemplo 1)](./SRP/)
Sistema de gerenciamento de funcionários demonstrando a separação de responsabilidades em classes distintas para cálculo de salário, persistência e impressão de relatórios.

### [SRP2 - Single Responsibility Principle (Exemplo 2)](./SRP2/)
Sistema de processamento de pedidos com classes especializadas para validação de estoque, cálculo de taxas, persistência e notificação.

### [OCP - Open/Closed Principle](./OCP/)
Sistema de descontos utilizando o padrão Strategy, demonstrando como adicionar novos tipos de desconto sem modificar o código existente.

### [LSP - Liskov Substitution Principle](./LSP/)
Exemplos e exercícios que ilustram o Princípio da Substituição de Liskov — como projetar hierarquias de classes que permitam substituir instâncias das subclasses pelas superclasses sem quebrar o comportamento esperado.

## 🛠️ Tecnologias Utilizadas

- **Java** - Linguagem de programação principal
- **IntelliJ IDEA** - IDE de desenvolvimento

## 🚀 Como Executar

1. Clone o repositório:
```bash
git clone https://github.com/kauaafeelix/Arquitetura-de-Sistemas.git
```

2. Abra o projeto na sua IDE preferida (IntelliJ IDEA recomendado)

3. Navegue até a classe `Main` ou `Aplicacao` de cada diretório e execute

## 👤 Autor

**Kauã Felix da Silva Costa**
- Email: kfelixcosta11@gmail.com

## 📝 Licença

Este projeto foi desenvolvido para fins educacionais e de estudo.
