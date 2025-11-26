/**
 * <p><strong>NotificadorDePedido</strong> classe com método para enviar notificação de um pedido</p>
 * @author Kauã Felix da Silva Costa
 * @version 2.0
 * @since 2025-11-26
 */


public class NotificadorDePedido {
    /**
     *
     * @param pedido passa como parâmetro um objeto Pedido para envio de confirmação.
     */
    public void enviarConfirmacao(Pedido pedido) {
        // Esta classe muda SOMENTE se o serviço de notificação (e-mail, SMS) mudar.
        if (pedido.isPago()) {
            System.out.println("-> Notificação: Email de confirmação enviado para: " + pedido.getEmailCliente());
        }
    }
}
