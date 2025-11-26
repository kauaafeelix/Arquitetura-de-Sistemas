package com.ocp.infra;

import com.ocp.domain.model.Pedido;
import com.ocp.domain.ports.EstrategiaDesconto;

public class DescontoSazonal implements EstrategiaDesconto {

    @Override
    public double aplicarDesconto(double valorBruto) {
        return valorBruto * 0.95;
    }
}
