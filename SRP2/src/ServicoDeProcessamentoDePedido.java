//6\. Orquestrador: `ServicoDeProcessamentoDePedido` (Classe de Coordenação)
//Esta nova classe assume a responsabilidade única de coordenar e gerenciar o fluxo de trabalho, garantindo que as
//classes especializadas sejam chamadas na ordem correta.


public class ServicoDeProcessamentoDePedido {
    private final ValidadorDeEstoque validador;
    private final CalculadoraDeTaxas calculadora;
    private final RepositorioDePedido repositorio;
    private final NotificadorDePedido notificador;

    // Construtor para Injeção de Dependência (DIP)
    public ServicoDeProcessamentoDePedido(
            ValidadorDeEstoque validador,
            CalculadoraDeTaxas calculadora,
            RepositorioDePedido repositorio,
            NotificadorDePedido notificador) {

        this.validador = validador;
        this.calculadora = calculadora;
        this.repositorio = repositorio;
        this.notificador = notificador;

    }
    // A única responsabilidade deste método é garantir o FLUXO
    public Pedido processar(Pedido pedido) throws Exception {
        // 1. Validação
        validador.validar(pedido);

        // 2. Cálculo
        double valorFinal = calculadora.calcularValorFinal(pedido);
        pedido.setValorFinal(valorFinal);

        // Simulação de pagamento
        pedido.setPago(true);

        // 3. Persistência
        repositorio.salvar(pedido);

        // 4. Notificação
        notificador.enviarConfirmacao(pedido);

        return pedido;

    }
}