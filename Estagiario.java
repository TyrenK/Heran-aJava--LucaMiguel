public class Estagiario extends Funcionario {

    public Estagiario(String cpf, String data_nasc, String nome, float salario, String departamento){
        super(cpf, data_nasc, nome, salario, departamento);
    }

    public void fazerTarefa(){
        System.out.println("Estagiário está realizando uma tarefa!");
    }
}
