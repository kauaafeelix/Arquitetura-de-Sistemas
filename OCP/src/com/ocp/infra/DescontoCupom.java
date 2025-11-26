package com.ocp.infra;

import com.ocp.domain.model.Pedido;
import com.ocp.domain.ports.EstrategiaDesconto;

public class DescontoCupom implements EstrategiaDesconto {

    @Override
    public double aplicarDesconto(double valorBruto) {
        return valorBruto * 0.90;
    }
}
