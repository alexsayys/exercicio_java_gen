package POO.exercicio1;

public class Cliente {

    //Atributos
    private String nome;
    private String cpf;
    private String endereco;
    private String telefone;
    private String email;

    //Método Constructor
    public Cliente(String nome, String cpf, String endereco, String telefone, String email) {
        this.nome = nome;
        this.cpf = cpf;
        this.endereco = endereco;
        this.telefone = telefone;
        this.email = email;
    }

    //Getters and Setters
    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public String getCpf() {
        return cpf;
    }

    public void setCpf(String cpf) {
        this.cpf = cpf;
    }

    public String getEndereco() {
        return endereco;
    }

    public void setEndereco(String endereco) {
        this.endereco = endereco;
    }

    public String getTelefone() {
        return telefone;
    }

    public void setTelefone(String telefone) {
        this.telefone = telefone;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    //Métodos Específicos
    public void visualizarCliente() {

        System.out.printf("\nNome: %s\nCPF: %s\nEndereço: %s\nTelefone: %s\nE-mail: %s\n",nome,cpf,endereco,telefone,email);
    }
}
