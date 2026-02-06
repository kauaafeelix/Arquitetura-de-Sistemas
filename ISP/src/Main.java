
public class Main {
    public static void main(String[] args) {
        System.out.println("--- TESTANDO CLIENTE COMUM ---");
        ClienteComumService serviceComum = new ClienteComumService();
        serviceComum.cadastrarCliente("Nicollas França", "mbappe@email.com");
        System.out.println(serviceComum.buscarClientePorEmail("mbappe@email.com"));


        System.out.println("\n--- TESTANDO CLIENTE VIP ---");
        ClienteVipService serviceVip = new ClienteVipService();
        serviceVip.cadastrarCliente("Bruno Luis Herdeiro", "herdeiro@vip.com");
        serviceVip.enviarNotificacao("herdeiro@vip.com", "Bem-vindo ao clube!");
        serviceVip.aplicarDescontoVIP("herdeiro@vip.com", 15.0);


    }
}