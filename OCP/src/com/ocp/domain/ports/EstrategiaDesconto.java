package com.ocp.domain.ports;

import com.ocp.domain.model.Pedido;

public interface EstrategiaDesconto {

    double aplicarDesconto(double valorBruto);

}