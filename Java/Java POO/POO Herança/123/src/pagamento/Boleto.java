package pagamento;

public class Boleto extends Pagamento {

    // Atributo da classe filho
    private double desconto;

    // Construtor da classe filho
    public Boleto(String pagamento, double valor, double desconto) {
        super(valor, pagamento);
        this.desconto = desconto;
    }

    // Método da classe filho
    public void realizarPagamento() {
        super.realizarPagamento();
        System.out.printf("Desconto: %2f %n %n", desconto);
    }

    // Método Getter e Setter
    public double getDesconto() {
        return desconto;
    }

    public void setDesconto(double desconto) {
        this.desconto = desconto;
    }

}
