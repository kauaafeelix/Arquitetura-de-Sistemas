public class Main {
    public static void main(String[] args) {
        CalculadoraService calculadora = new CalculadoraService();
        PersisteFuncionarioImpl repository = new PersisteFuncionarioImpl();
        ImprimeFuncionario relatorioService = new ImprimeFuncionario(calculadora); // Injeta a calculadora

        Funcionario joao = new Funcionario("João Silva", 6000.00, "Desenvolvedor Sr");

        repository.salvar(joao);

        relatorioService.imprimirRelatorio(joao);

    }

}