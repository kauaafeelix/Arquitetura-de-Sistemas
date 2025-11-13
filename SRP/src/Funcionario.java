public class Funcionario {

    private String nome;
    private double salarioBase;
    private String cargo;

    public Funcionario(){

    }

    public Funcionario(String nome, double salarioBase, String cargo) {
        this.nome = nome;
        this.salarioBase = salarioBase;
        this.cargo = cargo;
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public double getSalarioBase() {
        return salarioBase;
    }

    public void setSalarioBase(double salarioBase) {
        this.salarioBase = salarioBase;
    }

    public String getCargo() {
        return cargo;
    }

    public void setCargo(String cargo) {
        this.cargo = cargo;
    }
}
