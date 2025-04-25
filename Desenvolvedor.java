public class Desenvolvedor extends Funcionario {
    public Desenvolvedor(String cpf, String data_nasc, String nome, float salario, String departamento){
        super(cpf, data_nasc, nome, salario, departamento);
    }

    public void programar(){
        System.out.println("Desenvolvedor está programando!");
    }
}
