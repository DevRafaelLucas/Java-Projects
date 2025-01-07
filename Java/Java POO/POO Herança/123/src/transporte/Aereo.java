package transporte;

public class Aereo extends Transporte {

    // Atributos da classe super filho(Terrestre)
    public double altitudeMaxima;

    // Construtor da classe super filho(Terrestre) que chama da classe super
    // pai(Transporte)
    public Aereo(String transporte, int capacidade, double velocidadeMaxima, double altitudeMaxima) {
        super(transporte, capacidade, velocidadeMaxima);
        this.altitudeMaxima = altitudeMaxima;
    }

    // Método da classe super filho(Transporte) que chamada da classe super
    // pai(Terrestre)
    public void exibirInformacoes() {
        super.exibirInformacoes();
        System.out.printf("Altitude maxima: %2f %n %n", altitudeMaxima);
    }

    // Getter e Setter da classe super filho(Terrestre)
    public double getAltitudeMaxima() {
        return altitudeMaxima;
    }

    public void setAltitudeMaxima(double altitudeMaxima) {
        this.altitudeMaxima = altitudeMaxima;
    }
}
