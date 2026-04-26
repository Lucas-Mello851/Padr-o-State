package br.com.hamburgueria.pedido;

import br.com.hamburgueria.component.Lanche;
import br.com.hamburgueria.state.PedidoState;
import br.com.hamburgueria.state.RecebidoState;

public class Pedido {

    private final String id;
    private final Lanche lanche;
    private PedidoState state;

    public Pedido(String id, Lanche lanche) {
        this.id = id;
        this.lanche = lanche;
        this.state = new RecebidoState();
        System.out.println("[" + id + "] Pedido criado → " + lanche.getDescricao());
        System.out.printf("[" + id + "] Total: R$ %.2f%n", lanche.getPreco());
    }

    public void confirmar()   { state.confirmar(this); }
    public void preparar()    { state.preparar(this); }
    public void ficarPronto() { state.ficarPronto(this); }
    public void entregar()    { state.entregar(this); }
    public void cancelar()    { state.cancelar(this); }

    public void setState(PedidoState novoState) {
        this.state = novoState;
    }

    public PedidoState getState() {
        return state;
    }

    public String getId() {
        return id;
    }

    public Lanche getLanche() {
        return lanche;
    }

    public void exibirStatus() {
        System.out.println("[" + id + "] Estado atual: " + state.getNome());
    }
}
