public class ImprimeFuncionario {

    private final CalculadoraService calculadora;

    public ImprimeFuncionario(CalculadoraService calculadora){
        this.calculadora = calculadora;
    }

    public void imprimirRelatorio(Funcionario funcionario){

        double salarioLiquido = calculadora.calcularSalarioLiquido(funcionario);

        System.out.println("--- Relatório de Funcionário ---");
        System.out.println("Nome: " + funcionario.getNome());
        System.out.println("Salário Base: R$ " + funcionario.getSalarioBase());
        System.out.println("Salário Líquido Calculado: R$ " + salarioLiquido);
        System.out.println("--------------------------------");
    }
}
