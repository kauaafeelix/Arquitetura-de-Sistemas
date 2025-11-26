/**
 * @author Kauã Felix da Silva Costa
 * @version 2.0
 * <br>
 * <p><strong>Aplicação</strong> da execução de todo o escopo de código</p>
 * @since 2025-11-26
 */
public class Aplicacao {
    public static void main(String[] args) {

        /**
         * Instancia das classes especializadas
         *
         */
        ValidadorDeEstoque validador = new ValidadorDeEstoque();
        CalculadoraDeTaxas calculadora = new CalculadoraDeTaxas();
        RepositorioDePedido repositorio = new RepositorioDePedido();
        NotificadorDePedido notificador = new NotificadorDePedido();

        /**
         * Instanciação do serviço de coordenação
         *
         */
        ServicoDeProcessamentoDePedido servico = new ServicoDeProcessamentoDePedido(
                validador, calculadora, repositorio, notificador
        );
        Pedido pedido1 = new Pedido("PED-100", 450.00, 2, "kfelixcosta11@gmail.com");

        System.out.println("--- INICIANDO PROCESSAMENTO DO PEDIDO ---");


        try {
            Pedido pedidoProcessado = servico.processar(pedido1);

            System.out.println("\n--- RESULTADO FINAL ---");
            System.out.println("Status do Pedido " + pedidoProcessado.getId() + ": PAGO");
            System.out.println("Valor Bruto: R$" + pedidoProcessado.getValorBruto());
            System.out.println("Valor Final (com taxas): R$" + pedidoProcessado.getValorFinal());

        } catch (Exception e) {
            System.out.println("Falha no processamento: " + e.getMessage());
        }
    }
}