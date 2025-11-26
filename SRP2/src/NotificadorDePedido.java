public class NotificadorDePedido {
    public void enviarConfirmacao(Pedido pedido) {
        // Esta classe muda SOMENTE se o serviço de notificação (e-mail, SMS) mudar.
        if (pedido.isPago()) {
            System.out.println("-> Notificação: Email de confirmação enviado para: " + pedido.getEmailCliente());
        }
    }
}
