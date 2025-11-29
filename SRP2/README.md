# SRP2 - Single Responsibility Principle (Exemplo 2)

## 📖 Descrição

Este módulo demonstra o **Princípio da Responsabilidade Única (SRP)** através de um sistema completo de processamento de pedidos. Cada classe possui uma responsabilidade única e bem definida, facilitando a manutenção e evolução do sistema.

## 🎯 O que é SRP?

> "Uma classe deve ter apenas um motivo para mudar."

Neste exemplo avançado, o SRP é aplicado em conjunto com o **Princípio de Inversão de Dependência (DIP)** através de injeção de dependências.

## 📁 Estrutura do Módulo

```
src/
├── Pedido.java                          # Entidade de dados (modelo)
├── ValidadorDeEstoque.java              # Responsabilidade: Validação
├── CalculadoraDeTaxas.java              # Responsabilidade: Cálculos fiscais
├── RepositorioDePedido.java             # Responsabilidade: Persistência
├── NotificadorDePedido.java             # Responsabilidade: Notificações
├── ServicoDeProcessamentoDePedido.java  # Responsabilidade: Orquestração
└── Aplicacao.java                       # Ponto de entrada da aplicação
```

## 🔍 Classes e Responsabilidades

### `Pedido.java`
**Responsabilidade:** Representar os dados de um pedido
- Atributos: id, valor bruto, valor final, quantidade de itens, status de pagamento, email do cliente
- Classe focada apenas em armazenar dados

### `ValidadorDeEstoque.java`
**Responsabilidade:** Validar regras de estoque
- Verifica se a quantidade solicitada pode ser atendida
- Limite: máximo 100 itens por pedido
- **Muda apenas se:** as regras de validação de estoque mudarem

### `CalculadoraDeTaxas.java`
**Responsabilidade:** Calcular valores fiscais e frete
- Calcula frete: R$ 50,00 para compras abaixo de R$ 500,00
- Calcula impostos: 15% fixo
- **Muda apenas se:** as regras fiscais ou de frete mudarem

### `RepositorioDePedido.java`
**Responsabilidade:** Persistir pedidos
- Salva pedidos no banco de dados (simulação)
- **Muda apenas se:** a tecnologia de persistência mudar

### `NotificadorDePedido.java`
**Responsabilidade:** Enviar notificações
- Envia confirmação por email quando pedido é pago
- **Muda apenas se:** o serviço de notificação mudar

### `ServicoDeProcessamentoDePedido.java`
**Responsabilidade:** Orquestrar o fluxo de processamento
- Coordena a sequência: Validação → Cálculo → Persistência → Notificação
- Utiliza injeção de dependências (DIP)
- **Muda apenas se:** o fluxo de negócio mudar

### `Aplicacao.java`
**Responsabilidade:** Inicializar e executar a aplicação
- Instancia todas as dependências
- Executa o processamento de um pedido de exemplo

## ▶️ Como Executar

1. Compile todos os arquivos Java no diretório `src/`
2. Execute a classe `Aplicacao`

```bash
cd src
javac *.java
java Aplicacao
```

## 📤 Saída Esperada

```
--- INICIANDO PROCESSAMENTO DO PEDIDO ---
-> Validação de estoque OK.
-> Frete (R$50.0) e Impostos (R$67.5) calculados.
-> Persistência: Pedido PED-100 salvo no banco de dados.
-> Notificação: Email de confirmação enviado para: kfelixcosta11@gmail.com

--- RESULTADO FINAL ---
Status do Pedido PED-100: PAGO
Valor Bruto: R$450.0
Valor Final (com taxas): R$567.5
```

## 🔄 Fluxo de Processamento

```
┌─────────────────┐
│    Aplicacao    │
└────────┬────────┘
         │ processar(pedido)
         ▼
┌─────────────────────────────────┐
│ ServicoDeProcessamentoDePedido  │
│         (Orquestrador)          │
└─────────────────────────────────┘
         │
    ┌────┴────┬────────────┬──────────────┐
    ▼         ▼            ▼              ▼
┌────────┐ ┌────────┐ ┌──────────┐ ┌────────────┐
│Validar │ │Calcular│ │ Persistir│ │ Notificar  │
└────────┘ └────────┘ └──────────┘ └────────────┘
```

## ✅ Benefícios do SRP neste exemplo

1. **Baixo Acoplamento:** Cada classe opera independentemente
2. **Alta Coesão:** Cada classe tem foco único
3. **Facilidade de Testes:** Cada componente pode ser testado isoladamente
4. **Extensibilidade:** Novas funcionalidades podem ser adicionadas sem modificar classes existentes
5. **Injeção de Dependências:** Facilita substituição de implementações

## 👤 Autor

**Kauã Felix da Silva Costa**
- Email: kfelixcosta11@gmail.com
- Versão: 2.0
- Data: 26/11/2025
