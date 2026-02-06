public class ServicoSMS implements NotificacaoService{

    @Override
    public void mensagem(String mensagem){
        System.out.println("Enviando SMS: "+mensagem);
    }
}
