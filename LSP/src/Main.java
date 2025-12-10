
public class Main {
    public static void main(String[] args) {
        Pedido pedidoEletronicos = new Pedido(100.00);

        ProcessarPagamento processador = new ProcessarPagamento();

        System.out.println("--- Frete Padrão ---");
        EstrategiaDeFrete regraNormal = new FretePadrao(20.00);

        processador.processar(pedidoEletronicos, regraNormal);

        System.out.println("\n--- Frete Grátis (Campanha) ---");
        EstrategiaDeFrete regraPromocional = new FreteGratis();

        processador.processar(pedidoEletronicos, regraPromocional);
    }
}