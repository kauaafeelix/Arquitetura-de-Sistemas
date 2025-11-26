//6\. Orquestrador: `ServicoDeProcessamentoDePedido` (Classe de Coordenação)
//Esta nova classe assume a responsabilidade única de coordenar e gerenciar o fluxo de trabalho, garantindo que as
//classes especializadas sejam chamadas na ordem correta.
/**
 * Serviço orquestrador que coordena o fluxo de processamento de um {@code Pedido}.
 *
 * <p>Responsabilidade única: coordenar a sequência de operações necessárias para
 * processar um pedido sem implementar a lógica de validação, cálculo, persistência
 * ou notificação — essas responsabilidades ficam com as dependências injetadas:
 * {@code ValidadorDeEstoque}, {@code CalculadoraDeTaxas}, {@code RepositorioDePedido}
 * e {@code NotificadorDePedido}.</p>
 *
 * <p>Efeitos colaterais: o método {@link #processar(Pedido)} modifica o estado do
 * {@code Pedido} (por exemplo, define o valor final e marca como pago), persiste o
 * pedido e envia notificações externas.</p>
 *
 * @author Kauã Felix da Silva Costa
 * @version 2.0
 * @since 2025-11-26
 */


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

    /**
     * Processa o {@code pedido}: valida, calcula o valor final, marca como pago,
     * persiste e envia confirmação.
     *
     * <p>Efeitos colaterais:
     * - Altera o estado do objeto {@code Pedido} (ex: {@code setValorFinal}, {@code setPago}).
     * - Persiste dados via {@code RepositorioDePedido}.
     * - Envia mensagens/notifications via {@code NotificadorDePedido}.</p>
     *
     * Exceções: o método declara {@code throws Exception} na assinatura atual; recomenda-se
     * especificar exceções mais precisas (p.ex., {@code ValidationException}, {@code PersistenceException},
     * {@code NotificationException}) conforme a implementação evoluir.</p>
     *
     * @param pedido instância de {@code Pedido} a ser processada; não pode ser {@code null}
     * @return o mesmo {@code Pedido} com as alterações aplicadas (valor final, estado de pagamento)
     */
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