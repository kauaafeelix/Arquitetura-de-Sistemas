public class ProcessarPagamento {


        public void processar(Pedido pedido, EstrategiaDeFrete estrategia) {

            double valorFinal = estrategia.calcularValorFinal(pedido);

            if (valorFinal < pedido.getValorBruto()) {
                throw new IllegalStateException("Erro: O valor final não deve ser menor que o valor bruto.");
            }

            System.out.printf("Processamento concluído. Valor Bruto: %.2f | Valor Final: %.2f%n",
                    pedido.getValorBruto(), valorFinal);
        }
}



