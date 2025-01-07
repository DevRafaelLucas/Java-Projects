package transporte;

public class Terrestre extends Transporte {

    // Atributos da classe super filho(Terrestre)
    public String tipoCombustivel;

    // Construtor da classe super filho(Terrestre) que chama da classe super
    // pai(Transporte)
    public Terrestre(String transporte, int capacidade, double velocidadeMaxima, String tipoCombustivel) {
        super(transporte, capacidade, velocidadeMaxima);
        this.tipoCombustivel = tipoCombustivel;
    }

    // Método da classe super filho(Transporte) que chamada da classe super
    // pai(Terrestre)
    public void exibirInformacoes() {
        super.exibirInformacoes();
        System.out.printf("Tipo de combustivel: %s %n %n", tipoCombustivel);
    }

    // Getter e Setter da classe super filho(Terrestre)
    public String getTipoCombustivel() {
        return tipoCombustivel;
    }

    public void setTipoCombustivel(String tipoCombustivel) {
        this.tipoCombustivel = tipoCombustivel;
    }
}
