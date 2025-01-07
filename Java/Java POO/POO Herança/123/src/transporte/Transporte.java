package transporte;

public class Transporte {

    /*
     * Sistema de Transportes
     * 
     * Exercícios 26 OOP - Crie um sistema que gerencia diferentes tipos de
     * transportes, com verificações adicionais baseadas em suas características.
     * Passos:
     * 
     * Classe Transporte:
     * Atributos: capacidade (int), velocidadeMaxima (double).
     * Método: exibirInformacoes() que exibe a capacidade e a velocidade máxima.
     * 
     * Classe Terrestre (herda de Transporte):
     * Atributo adicional: tipoCombustivel (String).
     * Método sobrescrito exibirInformacoes(): adiciona o tipo de combustível às
     * informações exibidas.
     * 
     * Classe Aereo (herda de Transporte):
     * Atributo adicional: altitudeMaxima (double).
     * Método sobrescrito exibirInformacoes(): adiciona a altitude máxima às
     * informações exibidas.
     * 
     * Classe Maritimo (herda de Transporte):
     * Atributo adicional: tipoCasco (String).
     * Método sobrescrito exibirInformacoes(): adiciona o tipo de casco às
     * informações exibidas.
     * 
     * Classe Principal App:
     * Crie uma instância de cada tipo de transporte e chame o método
     * exibirInformacoes().
     */

    // Atributo da classe super pai(Transporte)
    private String transporte;
    private int capacidadade;
    private double velocidadeMaxima;

    // Construtor da classe super pai(Transporte)
    public Transporte(String transporte, int capacidade, double velocidadeMaxima) {
        this.transporte = transporte;
        this.capacidadade = capacidade;
        this.velocidadeMaxima = velocidadeMaxima;
    }

    // Método da classe super pai(Transporte)
    public void exibirInformacoes() {
        System.out.printf("Transportes: %s %n Capacidade: %d %n Velocidade maxima: %2f %n ", transporte, capacidadade,
                velocidadeMaxima);
    }

    // Getter e Setter do atributo "Capacidade" da classe super pai(Transporte)
    public int getCapacidade() {
        return capacidadade;
    }

    public void setCapacidade(int capacidadade) {
        this.capacidadade = capacidadade;
    }

    // Getter e Setter do atributo "velocidade Maxima" da classe super
    // pai(Transporte
    public double getVelocidadeMaxima() {
        return velocidadeMaxima;
    }

    public void setVelocidadeMaxima(double velocidadeMaxima) {
        this.velocidadeMaxima = velocidadeMaxima;
    }

}
