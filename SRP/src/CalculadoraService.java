public class CalculadoraService {
    public double calcularSalarioLiquido(Funcionario funcionario){
        if (funcionario.getSalarioBase() > 5000.00) {
            return funcionario.getSalarioBase() * 0.90;
        } else {
            return funcionario.getSalarioBase() * 0.95;
        }
    }

}
