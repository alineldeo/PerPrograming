package Model;

public class Funcionario extends Pessoa {

    private String nome;
    private int matricula;

    public Funcionario() {
    }

    public Funcionario(String nome, String CPF, String Endereco, String email) {
        super(nome, CPF, Endereco, email);
    }

    public int getMatricula() {
        return matricula;
    }

    public void setMatricula(int matricula) {
        this.matricula = matricula;
    }

}
