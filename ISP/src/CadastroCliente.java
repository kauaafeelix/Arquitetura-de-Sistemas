public interface CadastroCliente {
    void cadastrarCliente(String nome, String email);
    String buscarClientePorEmail(String email);
}
