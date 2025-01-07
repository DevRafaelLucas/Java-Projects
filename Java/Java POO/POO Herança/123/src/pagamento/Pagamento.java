package pagamento;

public class Pagamento {

    /*
     * Exercícios 27 OOP - Sistema de pagamento - Implemente um sistema que simula
     * diferentes métodos de pagamento com regras específicas.
     * Passos:
     * 
     * Classe Pagamento:
     * Atributos: valor (double).
     * Método: realizarPagamento(), que exibe uma mensagem padrão.
     * 
     * Classe CartaoCredito (herda de Pagamento):
     * Atributo adicional: taxa (double).
     * Método sobrescrito realizarPagamento(): aplica a taxa ao valor e exibe o
     * total pago.
     * 
     * Classe Boleto (herda de Pagamento):
     * Atributo adicional: desconto (double).
     * Método sobrescrito realizarPagamento(): aplica o desconto ao valor e exibe o
     * total pago.
     * 
     * Classe Pix (herda de Pagamento):
     * Método sobrescrito realizarPagamento(): exibe o valor pago sem alterações.
     * 
     * Classe Principal App:
     * Crie instâncias de cada tipo de pagamento, configure os valores e exiba o
     * total pago usando o método realizarPagamento().
     */

    // Atributos da classe
    private String pagamento;
    private double valor;

    // Construtor da classe
    public Pagamento(double valor, String pagamento) {
        this.pagamento = pagamento;
        this.valor = valor;
    }

    // Método da classe
    public void realizarPagamento() {
        System.out.printf("Tipo de pagamento: %s %n Valor do pagamento: %2f %n ", pagamento, valor);
    }

    // Método Getter e Setter
    public double getValor(double valor) {
        return valor;
    }

    public void setValor(double valor) {
        this.valor = valor;
    }

}
