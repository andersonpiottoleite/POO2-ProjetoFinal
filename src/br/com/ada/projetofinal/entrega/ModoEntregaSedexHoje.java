package br.com.ada.projetofinal.entrega;

import java.math.BigDecimal;

public class ModoEntregaSedexHoje implements ModoEntrega {
    @Override
    public BigDecimal getValor() {

        return new BigDecimal(25.00);
    }
}
