package br.com
import java.util.ArrayList;
import java.util.Date;

public class Main {
    public static void main(String[] args) {

        Categoria categoria1 = new Categoria("Jogos Brasileirão");


        Evento evento1 = new Evento("JOGO 1", new Date(), 10, "Jogo valido pela 34 rodada do Basileirão seria A", 40000, categoria1);
        Evento evento2 = new Evento("JOGO 2", new Date(), 20, "Jogo valido pela 35 rodada do Basileirão seria A", 45000, categoria1);
        Evento evento3 = new Evento("JOGO 3", new Date(), 30, "Jogo valido pela 36 rodada do Basileirão seria A", 50000, categoria1);
        Evento evento4 = new Evento("JOGO 4", new Date(), 40, "Jogo valido pela 37 rodada do Basileirão seria A", 55000, categoria1);
        Evento evento5 = new Evento("JOGO 5", new Date(), 50, "Jogo valido pela 38 rodada do Basileirão seria A",60000, categoria1);

        ArrayList<Evento> eventos = new ArrayList<>();
        eventos.add(evento1);
        eventos.add(evento2);
        eventos.add(evento3);
        eventos.add(evento4);
        eventos.add(evento5);

        Pedido pedido1 = new Pedido(1);
        Pedido pedido2 = new Pedido(2);

        ArrayList<Pedido> pedidos = new ArrayList<>();
        pedidos.add(pedido1);
        pedidos.add(pedido2);

        PedidosItem item1 = new PedidosItem("JOGO 3", 2, 30);
        PedidosItem item2 = new PedidosItem("JOGO 2", 1, 20);


        for (Pedido pedido : pedidos) {
            for (PedidosItem item : pedido.getItensPedido()) {

                boolean eventoExistente = false;
                for (Evento evento : eventos) {
                    if (evento.buscarEvento(item)) {
                        eventoExistente = true;


                        break;
                    }
                }

                if (!eventoExistente) {
                    System.out.println("Erro: Evento não existe para o item do pedido.");
                    return;
                }
            }


            pedido.alterarStatus(2);


            pedido.calcularTotalPagar();
        }


        for (Pedido pedido : pedidos) {
            System.out.println("Pedido " + pedido.getNumeroPedido() + ":");
            System.out.println("Status: " + pedido.getStatusPedido());
            System.out.println("Total a pagar: " + pedido.getPrecoTotal());
            System.out.println("Itens do Pedido:");

            for (PedidosItem item : PedidosItem.getItensPedido()) {
                System.out.println(" - " + Evento.() + ", Qtde: " + PedidosItem.getQtdeIngresso() +
                        ", Preço: " + item.getPrecoIngresso());
            }

            System.out.println("----------------------");
        }
    }
}