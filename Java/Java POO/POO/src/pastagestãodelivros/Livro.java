package pastagestãodelivros;

public class Livro {

    /*
     * Sistema de Gestão de Livros de uma Biblioteca
     * Desenvolver um sistema para gerenciar livros de uma biblioteca. O sistema
     * deve validar os dados inseridos utilizando lógica condicional (if e else) nos
     * métodos setters.
     * 
     * Instruções
     * Criação da Classe Livro:
     * Crie uma classe chamada Livro com os seguintes atributos privados:
     * 
     * Título: O título do livro.
     * Autor: O nome do autor.
     * Ano de Publicação: O ano em que o livro foi publicado.
     * Editora: Nome da editora.
     * ISBN: Número único de identificação do livro (13 dígitos).
     * Gênero: O gênero literário do livro (ex.: "Ficção", "Biografia", "Terror",
     * etc.).
     * Quantidade de Páginas: Número de páginas do livro.
     * Idioma: O idioma em que o livro está escrito.
     * Quantidade Disponível: Quantidade de exemplares disponíveis na biblioteca.
     * Preço de Compra: O valor pago pela biblioteca ao adquirir o livro.
     * 
     * Construtor:Implemente um construtor para a classe Livro que receba valores
     * para todos os atributos e inicialize-os.
     * 
     * Métodos Getters e Setters:
     * Título e Autor: Não podem ser vazios ou nulos.
     * Ano de Publicação: Deve ser maior que 1450 (ano de publicação do primeiro
     * livro impresso) e menor ou igual ao ano atual.
     * Editora: Aceita qualquer string.
     * ISBN: Deve conter exatamente 13 dígitos.
     * Gênero: Deve ser um gênero válido, como "Ficção", "Biografia", "Terror",
     * "História", etc.
     * Quantidade de Páginas: Deve ser um número inteiro positivo.
     * Idioma: Aceita qualquer string.
     * Quantidade Disponível: Deve ser um número inteiro não negativo.
     * Preço de Compra: Deve ser um valor positivo.
     * 
     * Dica: Em cada setter, utilize if e else para verificar se os valores são
     * válidos. Caso sejam inválidos, imprima uma mensagem de erro ou atribua um
     * valor padrão.
     * 
     * Testes no método main:
     * Crie algumas instâncias da classe Livro.
     * Inicialize os atributos usando o construtor.
     * Utilize os getters para exibir as informações.
     * Use os setters para modificar alguns atributos, testando as validações com
     * entradas válidas e inválidas.
     * 
     * Objetivo do Desafio:
     * Este desafio tem como objetivo reforçar os conceitos de encapsulamento,
     * validação de dados utilizando if e else, e uso de métodos getters e setters.
     * Além disso, estimula a implementação de métodos que simulam operações do
     * mundo real, como empréstimos e devoluções em uma biblioteca.
     * 
     * Dica Extra: Você pode personalizar os atributos ou adicionar funcionalidades
     * extras, como registrar múltiplos autores ou associar um código único a cada
     * exemplar do livro!
     */

    /* Atributes */
    private String titulo;
    String autor;
    String editora;
    String idioma;
    String ISBN;
    private int ano;
    int paginas;
    int disponiveis;
    int preco;
    private char genero;

    /* Construction */
    public Livro(String titulo, String autor, String editora, char genero, String idioma, String ISBN,
            int ano, int paginas, int disponiveis, int preco) {
        /* Strings */
        this.titulo = titulo;
        this.autor = autor;
        this.editora = editora;
        this.idioma = idioma;
        this.ISBN = ISBN;
        /* ints */
        this.ano = ano;
        this.paginas = paginas;
        this.disponiveis = disponiveis;
        this.preco = preco;
        /* chars */
        this.genero = genero;

    }

    /* Getters */
    /* Strings */
    public String getTitulo() {
        return titulo;
    }

    public String getAutor() {
        return autor;
    }

    public String getEditora() {
        return editora;
    }

    public String getIdioma() {
        return idioma;
    }

    public String getISBN() {
        return ISBN;
    }

    /* ints */
    public int getAno() {
        return ano;
    }

    public int getPaginas() {
        return paginas;
    }

    public int getDisponiveis() {
        return disponiveis;
    }

    public int getPreco() {
        return preco;
    }

    /* chars */
    public char getGenero() {
        return genero;
    }

    /* Setters */
    /* Strings */
    public void setTitulo(String titulo) {
        this.titulo = titulo;

        if (titulo == null) {
            System.out.println("Erro, digite algo, e tente novamente");
        } else {
            System.out.println("Titulo do livro: " + getTitulo());
        }
    }

    public void setAutor(String autor) {
        this.autor = autor;

        if (autor == null) {
            System.out.println("Erro, digite algo, e tente novamente");
        } else {
            System.out.println("Autor: " + getAutor());
        }
    }

    public void setEditora(String editora) {
        this.editora = editora;

        if (editora == null) {
            System.out.println("Erro, digite algo, e tente novamente");
        } else {
            System.out.println("Editora: " + getEditora());
        }
    }

    public void setIdioma(String idioma) {
        this.idioma = idioma;

        if (idioma == null) {
            System.out.println("Erro, digite algo e tente novamente");
        } else {
            System.out.println("Idioma: " + getIdioma());
        }
    }

    public void setISBN(String ISBN) {
        this.ISBN = ISBN;

        if (ISBN.length() > 13) {
            System.out.println("Erro, digite um numero menor que 13 digitos, e tente novamente");
        } else {
            System.out.println("ISBN: " + getISBN());
        }
    }

    /* ints */
    public void setAno(int ano) {
        this.ano = ano;

        if (ano < 0 || ano > 2025) {
            System.out.println("Erro, digite um ano valido, e tente novamente");
        } else {
            System.out.println("Ano: " + getAno());
        }
    }

    public void setPaginas(int paginas) {
        this.paginas = paginas;

        if (paginas < 0) {
            System.out.println("Erro, digite um numero maior que zero, e tente novamente");
        } else {
            System.out.println("Numero de paginas: " + getPaginas());
        }
    }

    public void setDisponiveis(int disponiveis) {
        this.disponiveis = disponiveis;

        if (disponiveis < 0) {
            System.out.println("Erro, digite um numero maior que zero, e tente novamente");
        } else {
            System.out.println("Quantidade de livros disponiveis: " + getDisponiveis());
        }
    }

    public void setPreco(int preco) {
        this.preco = preco;

        if (preco < 0) {
            System.out.println("Erro, digite um numero maior que zero, e tente novamente");
        } else {
            System.out.println("Preço: " + getPreco() + " R$");
        }
    }

    /* Chars */
    public void setGenero(char genero) {
        this.genero = genero;

        if (genero == 'F') {
            System.out.println("Gênero: Fantasia");
        } else if (genero == 'B') {
            System.out.println("Gẽnero: Biografia");
        } else if (genero == 'T') {
            System.out.println("Gênero: Terror");
        } else if (genero == 'H') {
            System.out.println("Gẽnero: Horror");
        } else {
            System.out.println("Erro, digite uma letra correspondente ao gênero do livro e tente novamente");
        }
    }

    /* Metdos */
    public void exibirDetalhes() {
        System.out.println("=====================");
        System.out.println("Livro do Usuário: ");
        System.out.println("=====================");
        System.out.println("");
        setTitulo(titulo);
        setAutor(autor);
        setAno(ano);
        setEditora(editora);
        setISBN(ISBN);
        setGenero(genero);
        setPaginas(paginas);
        setIdioma(idioma);
        setDisponiveis(disponiveis);
        setPreco(preco);
    }

    /* Main */
    public static void main(String[] args) {
        Livro livro = new Livro("Joãozinho", "João", "Zinho", 'H', "Português", "SLA",
                2010, 22, 12, 1);

        livro.exibirDetalhes();
    }

}
