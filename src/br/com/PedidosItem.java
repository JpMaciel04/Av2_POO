package br.com;

public class PedidosItem   {
    public String nomeEvento;
    public int qtdIngresso;
    public double precoIngreso;

    public PedidosItem(String nomeEvento, int qtdIngresso, double precoIngreso) {
        this.nomeEvento = nomeEvento;
        this.qtdIngresso = qtdIngresso;
        this.precoIngreso = precoIngreso;
    }
    public void PedidoItem(){

    }
    public boolean atualizaEstoqueIngresso(){

        return false;
    }
}
