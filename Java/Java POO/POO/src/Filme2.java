public class Filme2 {

    /* Exercícios 19 OOP - Criar uma classe Filme com atributos para título e classificação indicativa, 
    garantindo que a classificação 18 anos. */
    
    //Atributos da classe
    public String titulo;
    public int classificacaoindicativa;

    //Construtor
    public Filme2(String titulo, int classificacaoindicativa) {
        this.titulo = titulo;
        this.classificacaoindicativa = classificacaoindicativa;

        if (classificacaoindicativa < 18) {
            System.out.println("não pode ver o filme");
        } else {
            System.out.println("pode ver o filme");
        }
    }

    //Método getter e setter do Titulo
    public String getTitulo() {
        return titulo;
    }
    public void setTitulo(String titulo){
        this.titulo = titulo;
    }

    //Método getter e setter da Classificação Indicativa
    public int getClassificacaoIndicativa() {
        return classificacaoindicativa;
    }

    public void setClassificacaoindicativa(int classificacaoindicativa) {
        this.classificacaoindicativa = classificacaoindicativa;
    }

    // Método main
    public static void main(String[] args) {
        Filme2 filme = new Filme2("Rambo", 18);

       System.out.println("Nome do filme: " + filme.getClassificacaoIndicativa());
       System.out.println("Classificação indicativa: " + filme.getTitulo());
    }
}
