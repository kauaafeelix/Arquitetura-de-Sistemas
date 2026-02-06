//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main {
    public static void main(String[] args) {

        NotificacaoService notificacaoEmail = new ServicoEmail();
        NotificacaoService notificacaoSMS = new ServicoSMS();

        RecuperadorDeSenha recuperadorDeSenha = new RecuperadorDeSenha(notificacaoEmail);

        recuperadorDeSenha.recuperar("Recuperando senha por email.");

        recuperadorDeSenha = new RecuperadorDeSenha(notificacaoSMS);
        recuperadorDeSenha.recuperar("Recuperando senha por SMS");
    }
}