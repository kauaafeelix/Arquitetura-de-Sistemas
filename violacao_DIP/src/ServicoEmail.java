public class ServicoEmail implements NotificacaoService {
    public void enviarEmail(String mensagem) {
        System.out.println("Enviando E-mail SMTP: " + mensagem);
    }

    @Override
    public void mensagem(String mensagem) {
        System.out.println("Enviando E-mail SMTP: "+mensagem);
    }
}
