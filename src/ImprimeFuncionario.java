public class ImprimeFuncionario {

    private final CalculadoraService calculadora;

    public ImprimeFuncionario(CalculadoraService calculadora){
        this.calculadora = calculadora;
    }

    public void imprimirRelatorio(Funcionario funcionario){

        double salarioLiquido = calculadora.calcularSalarioLiquido(funcionario);

        System.out.println("--- Relatório do Funcionário ---");

    }
}
