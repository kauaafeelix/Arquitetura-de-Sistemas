//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main {
    public static void main(String[] args) {
        RepositoryPedido repositorio = new PedidoRepoImpl();
        Notificador notificador = new NotificadorEmail();

        Processador processador = new ProcessadorDePedido(repositorio, notificador);

        Pedido pedido = new Pedido("PED-999", 1200.00, 5, "cliente@exemplo.com");

        try{
            double total = processador.processar(pedido);
            System.out.println("Sucesso! Total processado: R$"+total);
        } catch (Exception e) {
            System.out.println("Erro: " + e.getMessage());
        }
    }
}