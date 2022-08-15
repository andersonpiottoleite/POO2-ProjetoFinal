package br.com.ada.projetofinal.entrega;

import java.math.BigDecimal;

public class ModoEntregaComum implements ModoEntrega {
    @Override
    public BigDecimal getValor() {
        return new BigDecimal(5.00);
    }
}
