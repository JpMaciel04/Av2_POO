package br.com;

import java.util.ArrayList;
import java.util.Date;

public class Pedido {
    private int numeroPedido;
    private Date dataHoraPedido;
    private  double precoTotal;
    private int statusPedido;

    public void inserirPedido(int numeroPedido, Date dataHoraPedido, double precoTotal, int statusPedido) {
        this.numeroPedido = numeroPedido;
        this.dataHoraPedido = dataHoraPedido;
        this.precoTotal = precoTotal;
        this.statusPedido = statusPedido;
    }

    public int getNumeroPedido() {
        return numeroPedido;
    }

    public void setNumeroPedido(int numeroPedido) {
        this.numeroPedido = numeroPedido;
    }

    public Date getDataHoraPedido() {
        return dataHoraPedido;
    }

    public void setDataHoraPedido(Date dataHoraPedido) {
        this.dataHoraPedido = dataHoraPedido;
    }

    public double getPrecoTotal() {
        return precoTotal;
    }

    public void setPrecoTotal(double precoTotal) {
        this.precoTotal = precoTotal;
    }

    public int getStatusPedido() {
        return statusPedido;
    }

    public void setStatusPedido(int statusPedido) {
        this.statusPedido = statusPedido;
    }

    public void imprimirPedido(){

    }

    public void alterarStatus(int novoStatus){
        this.statusPedido = novoStatus;
    }

    public boolean consultarPedido(Pedido outroPedido){
        boolean result;
        if (outroPedido.equals(getNumeroPedido())){
        result = true;
        }
            else{
                result = false;
    }
        return result;
    }

    public void inserirItensPedidos(PedidosItem pedidoItem){
        ArrayList<PedidosItem> itensPedido = new ArrayList<>();
    }
    public void excluirItensPedidos(PedidosItem pedidoExcluir){

    }
    public void calcularTotalPagar(){

    }


}
