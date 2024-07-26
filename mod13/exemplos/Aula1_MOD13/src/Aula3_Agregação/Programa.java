package Aula3_Agregação;

public class Programa {

    public static void main (String args[]) {
    Produto produtoTV = criarProduto(1L, 10d, "TV");
    Produto produtoCel = criarProduto(12L, 1000d, "Celular");

    Vendedor vendedor = criarVendedor("Pedro", 10d);

    Comprador comprador = criarComprador("Jorge", 2000d);

    Venda venda = new Venda();
    venda.setVendedor(vendedor);
    venda.setComprador(comprador);
    venda.add(produtoTV);
    venda.add(produtoCel);

    venda.concretizarVenda();
    System.out.println("Vendido");
    System.out.println(produtoTV.getNome());
    venda.cancelarVenda();
    venda = null;
    }

    private static Comprador criarComprador(String nome, double verba) {
        return new Comprador(nome, verba);
    }

    private static Vendedor criarVendedor(String nome, double comissao) {
        Vendedor vendedor = new Vendedor();
        vendedor.setComissao(comissao);
        vendedor.setNome(nome);
        return vendedor;
    }

    private static Produto criarProduto(Long codigo, Double valor, String nome) {
        Produto produto = new Produto();
        produto.setCodigo(codigo);
        produto.setPreco(valor);
        produto.setNome(nome);
        return produto;
    }
}
