package com.ocp.domain.model;

import com.ocp.domain.model.enuns.TipoDesconto;

public class Pedido {
    private String id;
    private double valorBruto;
    private int quantidadeItens;
    private boolean isPago;
    private String emailCliente;
    private TipoDesconto tipoDesconto; // Tipo de desconto a ser aplicado
    public Pedido(String id, double valorBruto, int quantidadeItens, String
            emailCliente, TipoDesconto tipoDesconto) {
        this.id = id;
        this.valorBruto = valorBruto;
        this.quantidadeItens = quantidadeItens;
        this.isPago = false;
        this.emailCliente = emailCliente;
        this.tipoDesconto = tipoDesconto;
    }
    // --- GETTERS ---
    public String getId() { return id; }
    public double getValorBruto() { return valorBruto; }
    public int getQuantidadeItens() { return quantidadeItens; }
    public boolean isPago() { return isPago; }
    public String getEmailCliente() { return emailCliente; }
    public TipoDesconto getTipoDesconto() { return tipoDesconto; }
    // --- SETTERS ---
    public void setValorBruto(double valorBruto) { this.valorBruto = valorBruto; }
    public void setQuantidadeItens(int quantidadeItens) { this.quantidadeItens =
            quantidadeItens; }
    public void setPago(boolean pago) { isPago = pago; }
    public void setTipoDesconto(TipoDesconto tipoDesconto) { this.tipoDesconto =
            tipoDesconto; }
}
