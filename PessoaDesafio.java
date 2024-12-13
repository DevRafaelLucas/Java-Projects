public class PessoaDesafio{

    /* Sistema de Registro Detalhado de Pessoas

Desenvolver um sistema para registrar e gerenciar informações detalhadas sobre pessoas.
O sistema deve validar os dados inseridos, utilizando lógica condicional (if e else) nos métodos setters.

Instruções:
Criação da Classe Pessoa:
Crie uma classe chamada Pessoa com os seguintes atributos privados:
Nome, idade, endereço, telefone, email, cpf, sexo, estadoCivil, profissão, salário, nacionalidade, 
filhos (representando a quantidade de filhos, ex.: "Nenhum", "Um", "Dois", etc.)

Construtor:
Implemente um construtor para a classe Pessoa que receba valores para todos os atributos e inicialize-os.

Métodos Getters e Setters:
Nome: O nome não pode ser vazio ou nulo.
Idade: A idade deve ser um valor positivo.
Endereço: Aceita qualquer String.
Telefone: Digite seu telefone.
E-mail: Digite seu e-mail.
CPF: Deve ter exatamente 11 dígitos.
Sexo: Deve ser "Masculino", "Feminino" ou "Outro".
Estado Civil: Deve ser "Solteiro", "Casado", "Divorciado" ou "Viúvo".
Profissão: Não pode ser vazia ou nula.
Salário: Deve ser um valor positivo.
Nacionalidade: Aceita qualquer String.
Filhos: Deve ser uma string representando um número inteiro não negativo ou termos como
"Nenhum", "Um", "Dois", etc.

Dica: Em cada setter, utilize if e else para verificar se o valor atribuído é válido. Se não for, imprima uma mensagem de
erro ou ajuste o valor para um padrão.

Métodos Adicionais:
Método exibirDetalhes: Crie um método que retorna uma string com todos os detalhes da pessoa,
formatados de forma clara.
Método atualizarEndereco: Crie um método para atualizar o endereço da pessoa, recebendo o novo endereço
como parâmetro.

Testes: 
No método main:
Crie algumas instâncias da classe Pessoa.
Inicialize os atributos usando o construtor.
Use os getters para exibir as informações.
Utilize os setters para modificar alguns atributos, testando as validações com entradas válidas e inválidas.
Exiba os detalhes completos de cada pessoa usando o método exibirDetalhes.
Atualize o endereço de uma pessoa usando o método atualizarEndereco e exiba os detalhes atualizados.

Objetivo do Desafio: Visa reforçar a prática de encapsulamento, uso de métodos getters e setters com validação de dados, 
e aplicação de lógica condicional para garantir a integridade dos dados inseridos no sistema. */
    
    //Atributos da classe
    public String nome; 
    public int idade;
    public String endereco;
    public long telefone; 
    public String email; 
    public String cpf; 
    public char sexo; 
    public char estadoCivil; 
    public String profissao; 
    public float salario;
    public String nacionalidade; 
    public String filhos;

    //Construtor
    public PessoaDesafio(String nome, int idade, String endereco, long telefone, String email, String cpf, 
    char sexo, char estadoCivil, String profissao, float salario, String nacionalidade, String filhos) {

        this.nome = nome;
        this.idade = idade;
        this.endereco = endereco;
        this.telefone = telefone;
        this.email = email;
        this.cpf = cpf;
        this.sexo = sexo;
        this.estadoCivil = estadoCivil;
        this.profissao = profissao;
        this.salario = salario;
        this.nacionalidade = nacionalidade;
        this.filhos = filhos;

    }

    //Método Getter
    
    public String getNome() {
        return nome;
    }
    public int getIdade() {
        return idade;
    }
    public String getEndereco() {
        return endereco;
    }
    public long getTelefone() {
        return telefone;
    }
    public String getEmail() {
        return email;
    }
    public String getCpf() {
        return cpf;
    }
    public char getSexo() {
        return sexo;
    }
    public char getEstadoCivil() {
        return estadoCivil;
    }
    public String getProfissao() {
        return profissao;
    }
    public float getSalario() {
        return salario;
    }
    public String getNacionalidade() {
        return nacionalidade;
    }
    public String getFilhos() {
        return filhos;
    }

// Método Setter

    public void setNome(String nome) { /* V */
        this.nome = nome;

        if (nome == null) {
            System.out.println("Erro, tente novamente");
        }
        else {
            System.out.println("Seu nome é " + getNome());
        }
    }
    public void setIdade(int idade) { /* V */
        this.idade = idade;

        if (idade <= 0) {
            System.out.println("Erro tente novamente");
        }
        else {
            System.out.println("Sua idade é " + getIdade());
        }
    }
    public void setEndereco(String endereco) { /* V */
        this.endereco = endereco;

        if (endereco == null) {
            System.out.println("Erro, tente novamente");
        }
        else {
            System.out.println("Seu endereço é " + getEndereco());
        }

    }
    public void setTelefone(long telefone) {
        this.telefone = telefone;
        
        if (telefone <= 0)
            System.out.println("Erro, tente novamente");
        else {
            System.out.println("Seu telefone é " + getTelefone());
        }    
    }
    public void setEmail(String email) {
        this.email = email;

        if (email == null) {
            System.out.println("Erro, tente novamente");
        }
        else {
            System.out.println("Seu email é " + getEmail());
        }
        
    }
    public void setCpf(String cpf) {
        this.cpf = cpf;

        if (cpf.length() > 11) {
            System.out.println("Erro, no sistema");
        } else {
            System.out.println("Seu Cp");
        }
    }

    public void setSexo(char sexo) {
        this.sexo = sexo;
    }
    public void setEstadoCivil(char estadoCivil) {
        this.estadoCivil = estadoCivil;
    }    
    public void setProfissao(String profissao) {
        this.profissao = profissao;

        if (profissao == null) {
            System.out.println("Erro, tente novamente");
        }
        else {
            System.out.println("A sua profissão é" + getProfissao());
        }
    }
    public void setSalario(float salario) {
        this.salario = salario;
    }
    public void setNacionalidae(String nacionalidade) {
        this.nacionalidade = nacionalidade;

        if (nacionalidade == null) {
            System.out.println("Erro tente novamente");
        }
        else {
            System.out.println("Sua nacionalidade é " + getNacionalidade());
        }
    }
    public void setFilhos(String filhos) {
        this.filhos = filhos;
    }



}