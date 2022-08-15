package br.com.ada.projetofinal.entrega;

import br.com.ada.projetofinal.entrega.ModoEntrega;

import java.math.BigDecimal;

public class CalculoModoEntrega {

    public BigDecimal calculaEntrega(ModoEntrega modoEntrega){
        return modoEntrega.getValor();
    }
}
