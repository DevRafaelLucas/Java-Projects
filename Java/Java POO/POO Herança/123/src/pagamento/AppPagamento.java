package pagamento;

public class AppPagamento {
    public static void main(String[] args) throws Exception {
        CartaoCredito cartaocredito = new CartaoCredito("Cartão de Crédito", 10000, 1000000);
        cartaocredito.realizarPagamento();

        Boleto boleto = new Boleto("Boleto", 1000000, 15000);
        boleto.realizarPagamento();

        Pix pix = new Pix("Pix", 10000, 1500);
        pix.realizarPagamento();
    }
}
