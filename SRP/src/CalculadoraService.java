public class CalculadoraService {
    public double calcularSalarioLiquido(Funcionario funcionario){
        if (funcionario.getSalarioBase() > 5000.00) {
            return funcionario.getSalarioBase() * 0.90; // 10% de imposto
        } else {
            return funcionario.getSalarioBase() * 0.95; // 5% de imposto
        }
    }

}
