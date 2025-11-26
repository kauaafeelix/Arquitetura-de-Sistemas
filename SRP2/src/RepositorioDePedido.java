/**
 * <p><strong>RepositorioDePedido</strong> classe com método de salvar pedidos</p>
 * @author Kauã Felix da Silva Costa
 * @version 2.0
 * @since 2025-11-26
 */


public class RepositorioDePedido {

    /**
     <p>Contrato:
     * - {@code pedido} não pode ser {@code null}.
     * - Implementações reais podem lançar exceções de I/O ou de persistência (por
     *   exemplo {@code SQLException} ou exceções específicas do framework).</p>
     *
     * @param pedido objecto {@code Pedido} a ser salvo; não pode ser {@code null}
     */
    public void salvar(Pedido pedido) {
        // Esta classe muda SOMENTE se a tecnologia de persistência mudar (ex: de SQL para JPA).
        System.out.println("-> Persistência: Pedido " + pedido.getId() + " salvo no banco de dados.");
    }
}
