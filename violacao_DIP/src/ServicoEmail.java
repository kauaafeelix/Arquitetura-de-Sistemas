public class ServicoEmail implements NotificacaoService {

    @Override
    public void mensagem(String mensagem) {
        System.out.println("Enviando E-mail SMTP: "+mensagem);
    }
}
