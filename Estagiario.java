public class Estagiario extends Funcionario {

    // Construtor
    public Estagiario(String cpf, String data_nasc, String nome, float salario, String departamento){
        super(cpf, data_nasc, nome, salario, departamento);
    }

    // Métodos
    public void fazerTarefa(){
        System.out.println("Estagiário está realizando uma tarefa!");
    }

    public void baterPonto(){
        System.out.println("Estagiário bateu o ponto!");
    }
}
