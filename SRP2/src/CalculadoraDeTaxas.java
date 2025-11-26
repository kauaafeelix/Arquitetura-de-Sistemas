/**
 * <p><strong>CalculadoraDeTaxas</strong> classe com métodos para calcular valores</p>
 * @author Kauã Felix da Silva Costa
 * @version 2.0
 * @since 2025-11-26
 */

public class CalculadoraDeTaxas {

    /**
     *
     * @param pedido passa como paramentro um objeto Pedido
     * @return retorna valor final depois de passar pela lógica aplicada
     */
    public double calcularValorFinal(Pedido pedido) {
        double valor = pedido.getValorBruto();
        double frete = calcularFrete(valor);
        double impostos = valor * 0.15; // 15% de imposto fixo

        double valorFinal = valor + frete + impostos;

        System.out.println("-> Frete (R$" + frete + ") e Impostos (R$" + impostos + ") calculados.");

        // Esta classe muda SOMENTE se as regras fiscais ou de frete mudarem.
        return valorFinal;
    }

    /**
     *
     * @param valor passa como parametro o valor que será aplicado ao frete
     * @return tem dois retornos, se o valor for menor que 500.00, retorna 50, se for maior ou igual, retorna 0
     */
    private double calcularFrete(double valor) {
        if (valor < 500.00) {
            return 50.00;
        }
        return 0.0;
    }

}
