public class Gerente extends Funcionario {
    public Gerente(String cpf, String data_nasc, String nome, float salario, String departamento){
        super(cpf, data_nasc, nome, salario, departamento);
    }
    
    public void realizarReuniao(){
        System.out.println("Gerente está marcando uma reunião!");
    }
}
