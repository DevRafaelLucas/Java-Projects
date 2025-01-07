package transporte;

public class AppTransporte {

    public static void main(String[] args) throws Exception {

        Terrestre terrestre = new Terrestre("Carro", 5, 1300, "Gasolina");
        terrestre.exibirInformacoes();

        Aereo aereo = new Aereo("Avião", 800, 300, 40000);
        aereo.exibirInformacoes();

        Maritmo maritmo = new Maritmo("Navio", 30, 5, "Proa");
        maritmo.exibirInformacoes();
    }
}
