public class Pessoa {
    private String cpf;
    private String data_nasc;

    // Construtor
    public Pessoa(String cpf, String data_nasc) {
        this.cpf = cpf;
        this.data_nasc = data_nasc;
    }

    //Métodos GETTER e SETTER
    public String getCpf(){
        return cpf;
    }

    public String getData_nasc(){
        return data_nasc;
    }

    public void setCpf(String cpf){
        this.cpf = cpf;
    }

    public void setData_nasc(String data_nasc){
        this.data_nasc = data_nasc;
    }
}
