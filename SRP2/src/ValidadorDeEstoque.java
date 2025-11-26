//2. Validação: `ValidadorDeEstoque` (Responsabilidade 1)
//Responsável **APENAS** por verificar regras de negócio antes do processamento.

// 1. Responsabilidade: Apenas garantir que o pedido pode ser processado.

public class ValidadorDeEstoque {
    public void validar(Pedido pedido) throws Exception {
        // Esta classe muda SOMENTE se a regra de validação de estoque ou quantidade mudar.
        if (pedido.getQuantidadeItens() > 100) {
            throw new Exception("Estoque insuficiente para a quantidade solicitada.");
        }
        System.out.println("-> Validação de estoque OK.");
    }
}