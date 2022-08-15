package br.com.ada.projetofinal.entrega;

import java.math.BigDecimal;

public class ModoEntregaSedex12 implements ModoEntrega {
    @Override
    public BigDecimal getValor() {

        return new BigDecimal(20.00);
    }
}
