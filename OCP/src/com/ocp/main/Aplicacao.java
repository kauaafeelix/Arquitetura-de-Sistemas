package com.ocp.main;

import com.ocp.domain.model.Pedido;
import com.ocp.domain.ports.EstrategiaDesconto;
import com.ocp.infra.CalculadoraDeDesconto;
import com.ocp.infra.DescontoAniversario;
import com.ocp.infra.DescontoCupom;

public class Aplicacao {
    public static void main(String[] args) {

        Pedido pedido = new Pedido("1", 1000.0, 5,"kfelixcosta11@gmail.com" ,null);

        CalculadoraDeDesconto calculadora = new CalculadoraDeDesconto();
        EstrategiaDesconto estrategia = new DescontoCupom();

        double valorFinal = calculadora.aplicarDesconto(pedido, estrategia);

        System.out.println("Valor bruto do pedido: " + pedido.getValorBruto());
        System.out.println("Valor final após desconto: " + valorFinal);
    }
}