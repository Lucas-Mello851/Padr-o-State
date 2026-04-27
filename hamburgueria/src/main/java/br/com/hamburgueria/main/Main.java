package br.com.hamburgueria.main;

import br.com.hamburgueria.cardapio.Cardapio;
import br.com.hamburgueria.component.Lanche;
import br.com.hamburgueria.concretedecorator.*;
import br.com.hamburgueria.pedido.Pedido;

public class Main {

    public static void main(String[] args) {

        Cardapio cardapio = Cardapio.getInstance();
        cardapio.exibirCardapio();

        System.out.println(" ");
        System.out.println("  SIMULAÇÃO DE PEDIDOS");
        System.out.println("\n");

        Lanche lanche1 = cardapio.getFabrica("Clássico").criar();
        lanche1 = new Queijo(lanche1);
        lanche1 = new Bacon(lanche1);
        lanche1 = new MolhoEspecial(lanche1);

        Pedido p1 = new Pedido("P001", lanche1);
        p1.confirmar();
        p1.ficarPronto();
        p1.entregar();
        p1.exibirStatus();

        System.out.println();

        Lanche lanche2 = cardapio.getFabrica("Vegano").criar();
        lanche2 = new Alface(lanche2);
        lanche2 = new Tomate(lanche2);

        Pedido p2 = new Pedido("P002", lanche2);
        p2.confirmar();
        p2.cancelar();
        p2.exibirStatus();

        System.out.println();

        Lanche lanche3 = cardapio.getFabrica("Smash").criar();
        lanche3 = new Queijo(lanche3);
        lanche3 = new Queijo(lanche3);
        lanche3 = new Bacon(lanche3);

        Pedido p3 = new Pedido("P003", lanche3);
        p3.cancelar();
        p3.exibirStatus();

        System.out.println();

        Lanche lanche4 = cardapio.getFabrica("Smash").criar();
        lanche4 = new MolhoEspecial(lanche4);

        Pedido p4 = new Pedido("P004", lanche4);
        p4.confirmar();
        p4.ficarPronto();
        p4.entregar();

        try {
            p4.cancelar();
        } catch (IllegalStateException e) {
            System.out.println("[P004] Erro esperado: " + e.getMessage());
        }
        p4.exibirStatus();

        System.out.println("\n_______________________________________");
    }
}
