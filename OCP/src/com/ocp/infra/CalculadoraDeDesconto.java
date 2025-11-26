package com.ocp.infra;

import com.ocp.domain.model.Pedido;
import com.ocp.domain.model.enuns.TipoDesconto;
import com.ocp.domain.ports.EstrategiaDesconto;

public class CalculadoraDeDesconto {
    public double aplicarDesconto(Pedido pedido, EstrategiaDesconto estrategia) {
        return estrategia.aplicarDesconto(pedido.getValorBruto());

    }
}
