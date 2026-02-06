# DIP - Dependency Inversion Principle (Implementação Correta)

## 📖 Descrição

Este módulo demonstra a **implementação correta do Princípio da Inversão de Dependência (DIP)** através de um sistema de recuperação de senha com múltiplos canais de notificação.

## 🎯 O que é DIP?

> "Módulos de alto nível não devem depender de módulos de baixo nível. Ambos devem depender de abstrações."

> "Abstrações não devem depender de detalhes. Detalhes devem depender de abstrações."

## 📁 Estrutura do Módulo

```
violacao_DIP/
└── src/
    ├── NotificacaoService.java      # Abstração (Interface)
    ├── ServicoEmail.java            # Implementação concreta: Email
    ├── ServicoSMS.java              # Implementação concreta: SMS
    ├── RecuperadorDeSenha.java      # Módulo de alto nível
    └── Main.java                    # Ponto de entrada da aplicação
```

## 🔍 Análise da Implementação

### ✅ Pontos Positivos (Seguem DIP)

#### 1. **Abstração através de Interface**
```java
public interface NotificacaoService {
    public void mensagem(String mensagem);
}
```
- ✅ Define um contrato abstrato
- ✅ Permite múltiplas implementações

#### 2. **Injeção de Dependência**
```java
public class RecuperadorDeSenha {
    private NotificacaoService notificacaoService;
    
    public RecuperadorDeSenha(NotificacaoService notificacaoService) {
        this.notificacaoService = notificacaoService;
    }
}
```
- ✅ Dependência é injetada via construtor
- ✅ Classe depende da abstração (NotificacaoService)
- ✅ Não instancia implementações concretas internamente

#### 3. **Implementações Intercambiáveis**
```java
// Email
NotificacaoService notificacaoEmail = new ServicoEmail();
RecuperadorDeSenha recuperador = new RecuperadorDeSenha(notificacaoEmail);

// SMS
NotificacaoService notificacaoSMS = new ServicoSMS();
recuperador = new RecuperadorDeSenha(notificacaoSMS);
```
- ✅ Fácil trocar implementações
- ✅ Baixo acoplamento

## 🏗️ Arquitetura

```
┌─────────────────────────────────┐
│   RecuperadorDeSenha            │ ← Módulo de Alto Nível
│   (depende de abstração)        │
└────────────┬──────��─────────────┘
             │ depende de
             ▼
┌─────────────────────────────────┐
│   NotificacaoService            │ ← Abstração (Interface)
│   + mensagem(String)            │
└────────────┬────────────────────┘
             │ implementado por
       ┌─────┴─────┐
       ▼           ▼
┌────────────┐ ┌──────────────┐
│ServicoEmail│ │ ServicoSMS   │   ← Módulos de Baixo Nível
└────────────┘ └──────────────┘
```

## ▶️ Como Executar

```bash
cd violacao_DIP/src
javac *.java
java Main
```

## 📤 Saída Esperada

```
Enviando E-mail SMTP: Clique no link para resetar sua senha: http: /techstore.com/reset?token=123
Enviando SMS: Clique no link para resetar sua senha: http: /techstore.com/reset?token=123
```

## ✅ Benefícios do DIP neste Exemplo

1. **Baixo Acoplamento:** `RecuperadorDeSenha` não conhece detalhes de implementação
2. **Extensibilidade:** Novos canais (WhatsApp, Push) podem ser adicionados facilmente
3. **Testabilidade:** Fácil criar mocks de `NotificacaoService` para testes
4. **Flexibilidade:** Comportamento pode ser alterado em tempo de execução
5. **Manutenibilidade:** Mudanças em implementações não afetam o módulo de alto nível

## 🔴 Observação sobre o Nome do Diretório

Apesar do nome "violacao_DIP", este código **implementa corretamente** o DIP através de:
- Interface como abstração
- Injeção de dependências
- Inversão de controle

O nome pode ser histórico de um exemplo anterior que foi refatorado.

## 🎓 Como Adicionar Novo Canal de Notificação

1. Crie nova classe implementando `NotificacaoService`:

```java
public class ServicoWhatsApp implements NotificacaoService {
    @Override
    public void mensagem(String mensagem) {
        System.out.println("Enviando WhatsApp: " + mensagem);
    }
}
```

2. Use-a sem modificar código existente:

```java
NotificacaoService whatsapp = new ServicoWhatsApp();
RecuperadorDeSenha recuperador = new RecuperadorDeSenha(whatsapp);
recuperador.recuperar("mensagem");
```

## 📊 Comparação: Com DIP vs Sem DIP

| Aspecto | Sem DIP | Com DIP (Este Exemplo) |
|---------|---------|------------------------|
| Acoplamento | Alto | Baixo |
| Testabilidade | Difícil | Fácil |
| Extensibilidade | Requer modificação | Apenas extensão |
| Flexibilidade | Rígida | Flexível |
| Manutenibilidade | Complexa | Simples |

## 🔗 Relação com Outros Princípios

- **OCP:** Aberto para extensão, fechado para modificação
- **LSP:** Implementações podem ser substituídas
- **ISP:** Interface focada e coesa
- **SRP:** Cada classe tem uma responsabilidade única