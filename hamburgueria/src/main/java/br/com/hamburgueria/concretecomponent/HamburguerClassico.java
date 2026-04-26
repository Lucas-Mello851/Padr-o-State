package br.com.hamburgueria.concretecomponent;

import br.com.hamburgueria.component.Lanche;

/**
 * ConcreteComponent — Hambúrguer Clássico base.
 * Pão brioche + blend 160g. Sem adicionais.
 */
public class HamburguerClassico implements Lanche {

    @Override
    public String getDescricao() {
        return "Hambúrguer Clássico (Pão Brioche + Blend 160g)";
    }

    @Override
    public double getPreco() {
        return 22.00;
    }
}
