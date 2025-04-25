public class Desenvolvedor extends Funcionario {

    // Construtor
    public Desenvolvedor(String cpf, String data_nasc, String nome, float salario, String departamento){
        super(cpf, data_nasc, nome, salario, departamento);
    }

    // Métodos
    public void programar(){
        System.out.println("Desenvolvedor está programando!");
    }
    public void baterPonto(){
        System.out.println("Desenvolvedor bateu o ponto!");
    }
}
