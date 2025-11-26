/**
 * @author Kauã Felix da Silva Costa
 * @version 2.0
 * <br>
 * <p><strong>Pedido</strong> classe que representa os atributos de um Pedido</p>
 * @since 2025-11-26
 */

// 1. Entidade de Dados: `Pedido`
//Permanece quase inalterada, focada apenas em dados.
public class Pedido {
    private String id;
    private double valorBruto;
    private double valorFinal; // Novo campo para armazenar o valor calculado
    private int quantidadeItens;
    private boolean isPago;
    private String emailCliente;

    public Pedido(String id, double valorBruto, int quantidadeItens, String emailCliente) {
        this.id = id;
        this.valorBruto = valorBruto;
        this.quantidadeItens = quantidadeItens;
        this.isPago = false;
        this.emailCliente = emailCliente;
        this.valorFinal = valorBruto; // Inicializa com o valor bruto
    }

    public void setId(String id) {
        this.id = id;
    }
    public void setValorBruto(double valorBruto) {
        this.valorBruto = valorBruto;
    }
    public void setQuantidadeItens(int quantidadeItens) {
        this.quantidadeItens = quantidadeItens;
    }
    public void setEmailCliente(String emailCliente) {
        this.emailCliente = emailCliente;
    }

    public String getId() { return id; }
    public double getValorBruto() { return valorBruto; }
    public int getQuantidadeItens() { return quantidadeItens; }
    public boolean isPago() { return isPago; }
    public String getEmailCliente() { return emailCliente; }

    public double getValorFinal() { return valorFinal; }
    public void setValorFinal(double valorFinal) { this.valorFinal = valorFinal; }
    public void setPago(boolean pago) { this.isPago = pago; }
    // ...

}