package POO.exercicio2;

public class Funcionario {

    private String nome;
    private String sobrenome;
    private String cargo;
    private String email;
    private float salario;

    //Constructor

    public Funcionario(String nome, String sobrenome, String cargo, String email, float salario) {
        this.nome = nome;
        this.sobrenome = sobrenome;
        this.cargo = cargo;
        this.email = email;
        this.salario = salario;
    }

    //Getter&Setter

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public String getSobrenome() {
        return sobrenome;
    }

    public void setSobrenome(String sobrenome) {
        this.sobrenome = sobrenome;
    }

    public String getCargo() {
        return cargo;
    }

    public void setCargo(String cargo) {
        this.cargo = cargo;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public float getSalario() {
        return salario;
    }

    public void setSalario(float salario) {
        this.salario = salario;
    }

    //Método Específico
    public void visualizar() {

        System.out.printf("\nFuncionário(a): %s %s\nE-mail: %s\nCargo: %s\nSalário: %.2f\n",nome,sobrenome,email,cargo,salario);
    }
}
