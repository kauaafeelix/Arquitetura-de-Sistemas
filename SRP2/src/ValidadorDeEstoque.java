//2. Validação: `ValidadorDeEstoque` (Responsabilidade 1)
//Responsável **APENAS** por verificar regras de negócio antes do processamento.

// 1. Responsabilidade: Apenas garantir que o pedido pode ser processado.

/**
 * Validador responsável apenas por verificar regras de estoque antes do
 * processamento de um {@code Pedido}.
 *
 * <p>Responsabilidade única: garantir que a quantidade solicitada pode ser
 * atendida. Não realiza persistência, notificações nem mutações além de lançar
 * exceções quando a validação falha.</p>
 * Observação: a implementação atual lança {@link Exception}; recomenda-se definir
 * exceções de validação mais específicas (por exemplo, {@code ValidationException})
 * e evitar saída direta via {@code System.out.println} em código de produção.</p>
 *
 * @author Kauã Felix da Silva Costa
 * @version 2.0
 * @since 2025-11-26
 */

public class ValidadorDeEstoque {
    /**
     * Valida se o {@code pedido} atende as restrições de estoque.
     *
     * <p>Pré-condições:
     * - {@code pedido} não pode ser {@code null};
     * - Se a quantidade de itens do pedido exceder o estoque suportado, é lançada
     *   uma exceção de validação.</p>
     *
     * Efeitos colaterais: nenhum, além do lançamento de exceções em caso de validação falha.
     *
     * @param pedido instância de {@code Pedido} a validar; não pode ser {@code null}
     * @throws Exception em caso de estoque insuficiente (comportamento atual)
     */
    public void validar(Pedido pedido) throws Exception {
        // Esta classe muda SOMENTE se a regra de validação de estoque ou quantidade mudar.
        if (pedido.getQuantidadeItens() > 100) {
            throw new Exception("Estoque insuficiente para a quantidade solicitada.");
        }
        System.out.println("-> Validação de estoque OK.");
    }
}