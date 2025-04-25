public class Funcionario extends Pessoa{
    private String nome;
    private float salario;
    private String departamento;

    // Construtor
    public Funcionario(String cpf, String data_nasc, String nome, float salario, String departamento){
        super(cpf, data_nasc);
        this.nome = nome;
        this.salario = salario;
        this.departamento = departamento;
    }

    //Métodos GETTER e SETTER
    public String getNome(){
        return nome;
    }

    public float getSalario(){
        return salario;
    }

    public String getDepartamento(){
        return departamento;
    }

    public void setNome(String nome){
        this.nome = nome;
    }

    public void setSalario(float salario){
        this.salario = salario;
    }

    public void setDepartamento(String departamento){
        this.departamento = departamento;
    }
    
    //Métodos
    public void mostrarDados(){
        System.out.println("Nome: "+ nome +"\nCPF: " + getCpf() + "\nData de Nascimento: "+ getData_nasc() +"\nSalario: R$"+ salario +"\nDepartamento: "+ departamento);
    }

    public void baterPonto(){
        System.out.println("Funcionário bateu o ponto!");
    }
}
