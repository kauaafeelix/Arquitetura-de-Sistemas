public class FretePadrao implements EstrategiaDeFrete {

    private double valorDoFrete;

    public FretePadrao(double valorDoFrete) {
            if (valorDoFrete < 0) {
                throw new IllegalArgumentException("Frete não pode ser negativo.");
            }
            this.valorDoFrete = valorDoFrete;
        }

    @Override
    public double calcularValorFinal(Pedido pedido) {
        return pedido.getValorBruto() + this.valorDoFrete;
    }
}