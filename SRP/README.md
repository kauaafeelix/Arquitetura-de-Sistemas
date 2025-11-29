# SRP - Single Responsibility Principle (Exemplo 1)

## 📖 Descrição

Este módulo demonstra o **Princípio da Responsabilidade Única (SRP)** através de um sistema de gerenciamento de funcionários. Cada classe possui uma única responsabilidade bem definida.

## 🎯 O que é SRP?

> "Uma classe deve ter apenas um motivo para mudar."

O SRP afirma que cada classe deve ter apenas uma responsabilidade, ou seja, cada classe deve fazer apenas uma coisa e fazê-la bem.

## 📁 Estrutura do Módulo

```
src/
├── Funcionario.java           # Entidade de dados (modelo)
├── CalculadoraService.java    # Responsabilidade: Cálculo de salário
├── PersisteFuncionario.java   # Interface para persistência
├── PersisteFuncionarioImpl.java # Responsabilidade: Persistência de dados
├── ImprimeFuncionario.java    # Responsabilidade: Geração de relatórios
└── Main.java                  # Ponto de entrada da aplicação
```

## 🔍 Classes e Responsabilidades

### `Funcionario.java`
**Responsabilidade:** Representar os dados de um funcionário
- Armazena: nome, salário base, cargo
- Fornece getters e setters para acesso aos atributos

### `CalculadoraService.java`
**Responsabilidade:** Calcular o salário líquido
- Aplica regras de desconto baseadas no salário base
- Salários > R$ 5.000: desconto de 10%
- Salários ≤ R$ 5.000: desconto de 5%

### `PersisteFuncionario.java` (Interface)
**Responsabilidade:** Definir contrato para persistência
- Define o método `salvar(Funcionario)`

### `PersisteFuncionarioImpl.java`
**Responsabilidade:** Implementar a persistência de funcionários
- Salva os dados do funcionário (simulação)

### `ImprimeFuncionario.java`
**Responsabilidade:** Gerar relatórios de funcionários
- Imprime informações do funcionário
- Utiliza `CalculadoraService` para obter o salário líquido

### `Main.java`
**Responsabilidade:** Orquestrar a execução
- Instancia os serviços necessários
- Executa o fluxo de demonstração

## ▶️ Como Executar

1. Compile todos os arquivos Java no diretório `src/`
2. Execute a classe `Main`

```bash
cd src
javac *.java
java Main
```

## 📤 Saída Esperada

```
Funcionario João Silva salvo com Sucesso.
--- Relatório de Funcionário ---
Nome: João Silva
Salário Base: R$ 6000.0
Salário Líquido Calculado: R$ 5400.0
--------------------------------
```

## ✅ Benefícios do SRP neste exemplo

1. **Manutenibilidade:** Alterações nas regras de cálculo afetam apenas `CalculadoraService`
2. **Testabilidade:** Cada classe pode ser testada isoladamente
3. **Reutilização:** Classes podem ser reutilizadas em diferentes contextos
4. **Clareza:** Código mais legível e organizado
