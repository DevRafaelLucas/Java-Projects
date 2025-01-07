package pagamento;
public class Pix extends Pagamento{

    //Atributo da classe filho
    private double pix;

    //Construtor da classe filho
    public Pix(String pagamento, double valor, double pix) {
        super(valor, pagamento);
        this.pix = pix;
    }

    //Método da classe filho
    public void realizarPagamento() {
        super.realizarPagamento();
        System.out.printf("Pix: %2f ", pix);
    }

    //Método Getter e Setter
    public double getPix() {
        return pix;
    }
    public void setPix(double pix) {
        this.pix = pix;
    }
    
}
