# LSP

Este diretório contém material, exemplos e implementações relacionados ao Language Server Protocol (LSP) usados nas atividades do repositório "Arquitetura-de-Sistemas".

## Descrição

Aqui você encontrará servidores e clientes LSP de exemplo, experimentos e notas para entender como integrar suporte a linguagem em editores (por exemplo, Visual Studio Code) usando o protocolo LSP.

> Observação: se houver subprojetos dentro desta pasta, verifique o README de cada subpasta para instruções específicas.

## Estrutura sugerida

- `server/` — implementação do servidor LSP (ex.: Node, Python, Java)
- `client/` — cliente de demonstração ou integração com um editor
- `examples/` — exemplos de código e testes de recursos do LSP
- `docs/` — documentação e notas de design
- `scripts/` — scripts auxiliares para executar ou testar

Nem todos esses diretórios precisam existir — a estrutura acima serve como guia para organização.

## Requisitos

Dependendo da implementação presente nesta pasta, você pode precisar de:

- Node.js (recomendado >= 14) e npm/yarn
- Python 3.8+
- Java 11+ e Maven/Gradle
- Visual Studio Code (para testar integrações com extensão)

## Como usar

1. Abra um terminal e navegue até a pasta do subprojeto que deseja executar, por exemplo:

   ```bash
   cd LSP/server
   ```

2. Siga as instruções específicas do subprojeto (instalar dependências, compilar, executar). Normalmente: 

   - Node.js: `npm install` e `npm run start` ou `npm run debug`
   - Python: criar e ativar um virtualenv e executar o servidor (`python main.py` ou conforme indicado)
   - Java: `mvn clean install` e `mvn exec:java` ou usar sua IDE

3. Para testar a integração com o VS Code, abra a pasta raiz do repositório no VS Code e siga as instruções de depuração/instrução do subprojeto LSP.

## Contribuições

Contribuições são bem-vindas. Se for adicionar um novo subprojeto LSP, por favor:

- Inclua um README próprio na subpasta com instruções detalhadas.
- Documente dependências e comandos de execução.
- Abra um Pull Request descrevendo as mudanças.

## Licença

Veja a licença do repositório principal.

## Contato

Para dúvidas, abra uma issue ou contate o mantenedor do repositório.
