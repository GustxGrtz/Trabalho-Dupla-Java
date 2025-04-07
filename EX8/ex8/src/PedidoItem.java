class PedidoItem {
    private Pizza pizza;
    private String tamanho;
    private String endereco;

    public PedidoItem(Pizza pizza, String tamanho, String endereco) {
        this.pizza = pizza;
        this.tamanho = tamanho;
        this.endereco = endereco;
    }

    public Pizza getPizza() {
        return pizza;
    }

    public String getTamanho() {
        return tamanho;
    }

    public String getEndereco() {
        return endereco;
    }
}