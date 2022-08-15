package br.com.ada.projetofinal.test;

import br.com.ada.projetofinal.entrega.CalculoModoEntrega;
import br.com.ada.projetofinal.entrega.ModoEntregaComum;
import br.com.ada.projetofinal.entrega.ModoEntregaSedex12;
import br.com.ada.projetofinal.entrega.ModoEntregaSedexHoje;

public class ModoEntregaTest {

    public static void main(String[] args) {
        CalculoModoEntrega modoEntrega = new CalculoModoEntrega();
        System.out.println(modoEntrega.calculaEntrega(new ModoEntregaComum()));
        System.out.println(modoEntrega.calculaEntrega(new ModoEntregaSedex12()));
        System.out.println(modoEntrega.calculaEntrega(new ModoEntregaSedexHoje()));
    }
}
