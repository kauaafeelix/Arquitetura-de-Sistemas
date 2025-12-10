public class FreteGratis implements EstrategiaDeFrete {

    @Override
    public double calcularValorFinal(Pedido pedido) {
        return pedido.getValorBruto();
    }
}
