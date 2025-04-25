public class Gerente extends Funcionario {

    // Construtor
    public Gerente(String cpf, String data_nasc, String nome, float salario, String departamento){
        super(cpf, data_nasc, nome, salario, departamento);
    }
    
    // Métodos
    public void realizarReuniao(){
        System.out.println("Gerente está marcando uma reunião!");
    }

    public void baterPonto(){
        System.out.println("Gerente bateu o ponto!");
    }
}
