public class ProcessadorDePedido implements Processador{

    private final RepositoryPedido repositorio;
    private final Notificador notificador;

    public ProcessadorDePedido(RepositoryPedido repo, Notificador noti){
        this.notificador = noti;
        this.repositorio = repo;
    }

    @Override
    public double processar(Pedido pedido) throws Exception {
        if (pedido.getQuantidadeItens() > 100) {
            throw new Exception("Estoque insuficiente.");
        }

        double valorFinal = pedido.getValorTotal();

        pedido.setPago(true);

        repositorio.salvarNoBancoDeDados(pedido, valorFinal);

        notificador.enviarConfirmacao(pedido.getEmailCliente(), pedido.getId());

        return valorFinal;
    }
}

