public class RepositorioDePedido {
    public void salvar(Pedido pedido) {
        // Esta classe muda SOMENTE se a tecnologia de persistência mudar (ex: de SQL para JPA).
        System.out.println("-> Persistência: Pedido " + pedido.getId() + " salvo no banco de dados.");
    }
}
