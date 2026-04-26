package br.com.hamburgueria.concretecomponent;

import br.com.hamburgueria.component.Lanche;

/**
 * ConcreteComponent — Smash Burger base.
 * Pão potato + dois discos smash 80g.
 */
public class HamburguerSmash implements Lanche {

    @Override
    public String getDescricao() {
        return "Smash Burger (Pão Potato + 2x Smash 80g)";
    }

    @Override
    public double getPreco() {
        return 28.00;
    }
}
