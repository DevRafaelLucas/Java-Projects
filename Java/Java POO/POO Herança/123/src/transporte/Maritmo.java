package transporte;
public class Maritmo extends Transporte{

    //Atributos da classe super filho(Terrestre)
    public String tipoCasco;

    //Construtor da classe super filho(Terrestre) que chama da classe super pai(Transporte)
    public Maritmo(String transporte, int capacidade, double velocidadeMaxima, String tipoCasco) {
        super(transporte, capacidade, velocidadeMaxima);
        this.tipoCasco = tipoCasco;
    }

    //Método da classe super filho(Transporte) que chamada da classe super pai(Terrestre)
    public void exibirInformacoes() {
        super.exibirInformacoes();
        System.out.printf("Tipo de casco: %s %n", tipoCasco);
    }

    //Getter e Setter da classe super filho(Terrestre)
    public String getTipoCasco() {
        return tipoCasco;
    }
    public void setTipoCasco(String tipoCasco) {
        this.tipoCasco = tipoCasco;
    }    
    
}
