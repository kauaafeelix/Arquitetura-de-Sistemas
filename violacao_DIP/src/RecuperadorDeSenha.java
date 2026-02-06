public class RecuperadorDeSenha {
    private NotificacaoService notificacaoService;


    public RecuperadorDeSenha(NotificacaoService notificacaoService) {
// VIOLAÇÃO: Instanciação interna (acoplamento forte)
        this.notificacaoService = notificacaoService;
    }
    public void recuperar(String email) {
        String link = "http: /techstore.com/reset?token=123";
        notificacaoService.mensagem("Clique no link para resetar sua senha: " +
                link);
    }
}
