class Pedido {
    List<PedidoItem> listaPedidos;

    public Pedido() {
        listaPedidos = new ArrayList<>();
    }

    public void adicionarPedido(PedidoItem item) {
        listaPedidos.add(item);
    }

    public void cancelarPedido(int numero) {
        if (numero >= 0 && numero < listaPedidos.size()) {
            listaPedidos.remove(numero);
            System.out.println("pedido cancelado");
        } else {
            System.out.println("numero de pedido invalido");
        }
    }

    public void gerarRelatorio() {
        double total = 0;
        if (listaPedidos.size() == 0) {
            System.out.println("nenhum pedido feito ainda");
            return;
        }
        for (int i = 0; i < listaPedidos.size(); i++) {
            PedidoItem item = listaPedidos.get(i);
            System.out.println("pedido " + i + ": " + item.getPizza().getNome() + ", tamanho: " + item.getTamanho() + ", entrega: " + item.getEndereco() + ", valor: " + item.getPizza().getValor() + " reais");
            total += item.getPizza().getValor();
        }
        System.out.println("total de pedidos: " + listaPedidos.size());
        System.out.println("media de valor dos pedidos: " + (total / listaPedidos.size()) + " reais");
    }
}
