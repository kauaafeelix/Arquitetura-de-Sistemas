public class PersisteFuncionarioImpl implements PersisteFuncionario{

    @Override
    public void salvar(Funcionario funcionario){

        System.out.println("Funcionario "+funcionario.getNome()+ " salvo com Sucesso.");

    }
}
