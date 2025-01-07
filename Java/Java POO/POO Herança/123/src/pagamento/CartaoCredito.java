package pagamento;

public class CartaoCredito extends Pagamento {

    // Atributo da classe filho
    private double taxa;

    // Construtor da classe filho
    public CartaoCredito(String pagamento, double valor, double taxa) {
        super(valor, pagamento);
        this.taxa = taxa;
    }

    // Método da classe filho
    public void realizarPagamento() {
        super.realizarPagamento();
        System.out.printf("Taxa: %2f %n %n", taxa);
    }

    // Método Getter e Setter
    public double getTaxa() {
        return taxa;
    }

    public void setTaxa(double taxa) {
        this.taxa = taxa;
    }
}
