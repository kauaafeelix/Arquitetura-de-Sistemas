# OCP - Open/Closed Principle

## 📖 Descrição

Este módulo demonstra o **Princípio Aberto/Fechado (OCP)** através de um sistema de cálculo de descontos utilizando o **padrão Strategy**. O sistema permite adicionar novos tipos de desconto sem modificar o código existente.

## 🎯 O que é OCP?

> "Entidades de software devem estar abertas para extensão, mas fechadas para modificação."

O OCP afirma que você deve ser capaz de estender o comportamento de uma classe sem modificá-la. Isso é alcançado através de abstrações e polimorfismo.

## 📁 Estrutura do Módulo

```
src/com/ocp/
├── domain/
│   ├── model/
│   │   ├── Pedido.java              # Entidade de dados
│   │   └── enuns/
│   │       └── TipoDesconto.java    # Enum com tipos de desconto
│   └── ports/
│       └── EstrategiaDesconto.java  # Interface (contrato)
├── infra/
│   ├── CalculadoraDeDesconto.java   # Serviço de aplicação de descontos
│   ├── DescontoAniversario.java     # Estratégia: 20% de desconto
│   ├── DescontoCupom.java           # Estratégia: 10% de desconto
│   ├── DescontoSazonal.java         # Estratégia: 5% de desconto
│   └── DescontoVip.java             # Estratégia: 15% de desconto
└── main/
    └── Aplicacao.java               # Ponto de entrada da aplicação
```

## 🔍 Classes e Responsabilidades

### Domain Layer (Camada de Domínio)

#### `Pedido.java`
**Responsabilidade:** Representar os dados de um pedido
- Atributos: id, valor bruto, quantidade de itens, email do cliente, tipo de desconto

#### `TipoDesconto.java` (Enum)
**Responsabilidade:** Definir os tipos de desconto disponíveis
- CUPOM, VIP, SAZONAL, ANIVERSARIO

#### `EstrategiaDesconto.java` (Interface)
**Responsabilidade:** Definir o contrato para estratégias de desconto
- Método: `aplicarDesconto(double valorBruto)`
- Esta é a **abstração** que permite o OCP

### Infrastructure Layer (Camada de Infraestrutura)

#### `CalculadoraDeDesconto.java`
**Responsabilidade:** Aplicar descontos utilizando a estratégia fornecida
- Recebe qualquer implementação de `EstrategiaDesconto`
- **Fechada para modificação:** não precisa ser alterada para novos descontos

#### Implementações de Estratégias:

| Classe | Desconto | Descrição |
|--------|----------|-----------|
| `DescontoCupom.java` | 10% | Desconto padrão para cupons |
| `DescontoVip.java` | 15% | Desconto para clientes VIP |
| `DescontoAniversario.java` | 20% | Desconto especial de aniversário |
| `DescontoSazonal.java` | 5% | Desconto em promoções sazonais |

### Application Layer (Camada de Aplicação)

#### `Aplicacao.java`
**Responsabilidade:** Demonstrar o uso do sistema de descontos
- Cria um pedido e aplica uma estratégia de desconto

## ▶️ Como Executar

1. Compile todos os arquivos Java
2. Execute a classe `Aplicacao`

```bash
cd src
javac com/ocp/domain/model/*.java com/ocp/domain/model/enuns/*.java com/ocp/domain/ports/*.java com/ocp/infra/*.java com/ocp/main/*.java
java com.ocp.main.Aplicacao
```

Ou, alternativamente, compile usando a IDE IntelliJ IDEA.

## 📤 Saída Esperada

```
Valor bruto do pedido: 1000.0
Valor final após desconto: 900.0
```

## 🎨 Padrão Strategy

O **padrão Strategy** permite definir uma família de algoritmos, encapsular cada um deles e torná-los intercambiáveis. Isso é exatamente o que o OCP requer.

```
                    ┌──────────────────────┐
                    │  EstrategiaDesconto  │
                    │     <<interface>>    │
                    └──────────┬───────────┘
                               │
        ┌──────────────────────┼──────────────────────┐
        │                      │                      │
        ▼                      ▼                      ▼
┌───────────────┐    ┌───────────────┐    ┌───────────────┐
│ DescontoCupom │    │  DescontoVip  │    │DescontoSazonal│
│    (10%)      │    │     (15%)     │    │     (5%)      │
└───────────────┘    └───────────────┘    └───────────────┘
```

## ➕ Como Adicionar Novo Desconto

Para adicionar um novo tipo de desconto (ex: Black Friday com 30%), basta:

1. Criar uma nova classe implementando `EstrategiaDesconto`:

```java
public class DescontoBlackFriday implements EstrategiaDesconto {
    @Override
    public double aplicarDesconto(double valorBruto) {
        return valorBruto * 0.70; // 30% de desconto
    }
}
```

2. Adicionar o tipo ao enum (opcional):

```java
public enum TipoDesconto {
    CUPOM, VIP, SAZONAL, ANIVERSARIO, BLACK_FRIDAY
}
```

**Nenhuma classe existente precisa ser modificada!** Isso é o OCP em ação.

## ✅ Benefícios do OCP neste exemplo

1. **Extensibilidade:** Novos descontos são adicionados sem modificar código existente
2. **Risco Reduzido:** Código existente não é alterado, minimizando bugs
3. **Manutenibilidade:** Cada estratégia é isolada e fácil de manter
4. **Testabilidade:** Estratégias podem ser testadas independentemente
5. **Flexibilidade:** Fácil troca de estratégias em tempo de execução

## 🏛️ Arquitetura

O projeto segue uma estrutura em camadas inspirada na **Arquitetura Hexagonal**:

- **domain/model:** Entidades e objetos de valor
- **domain/ports:** Interfaces (portas) que definem contratos
- **infra:** Implementações concretas das portas
- **main:** Configuração e inicialização da aplicação
