import java.util.Scanner;
import java.util.ArrayList;

public class Main {
    public static void main (String[] args){
        System.out.println("Bem-vindo ao Sistema de Cadastro dos Funcionários!");
        int op = 0;
        Scanner scanner = new Scanner(System.in);
        ArrayList<Gerente> gerentes = new ArrayList<Gerente>();
        ArrayList<Desenvolvedor> devs = new ArrayList<Desenvolvedor>();
        ArrayList<Estagiario> estagiarios = new ArrayList<Estagiario>();
        do{
            System.out.println("1 - Cadastrar novo funcionário \n2 - Exibir os dados dos funcionários cadastrados \n3 - Sair");
            System.out.println("O que gostaria de fazer? ");
            op = scanner.nextInt();
            
            switch (op) {
                case 1:
                    System.out.println("Iniciando cadastro! \n");
        
                    scanner.nextLine(); 
                
                    System.out.println("Insira o CPF do funcionário: ");
                    String cpf = scanner.nextLine();
                
                    System.out.println("Insira a data de nascimento do funcionário (Ex.: 26/05/2007): ");
                    String data_nasc = scanner.nextLine();
                
                    System.out.println("Insira o nome do funcionário: ");
                    String nome = scanner.nextLine();
                
                    System.out.println("Insira o salário do funcionário: ");
                    float salario = scanner.nextFloat();
                
                    scanner.nextLine(); 
                
                    System.out.println("Insira o departamento do funcionário (Administração, RH ou Produção): ");
                    String departamento = scanner.nextLine();
                
                    System.out.println("Insira o cargo do funcionário (Gerente, Desenvolvedor ou Estagiario): ");
                    String cargo = scanner.nextLine();

                    if(cargo.equalsIgnoreCase("Gerente")){
                            Gerente gerente = new Gerente(cpf, data_nasc, nome, salario, departamento);
                            gerentes.add(gerente);
                    } else if(cargo.equalsIgnoreCase("Desenvolvedor")){
                            Desenvolvedor dev = new Desenvolvedor(cpf, data_nasc, nome, salario, departamento);
                            devs.add(dev);
                    } else if(cargo.equalsIgnoreCase("Estagiario")){
                            Estagiario estagiario = new Estagiario(cpf, data_nasc, nome, salario, departamento);
                            estagiarios.add(estagiario);
                    }
                break;
                
                case 2:
                    System.out.println("Gostaria de exibir os dados de quais Funcionários?: \n1 - Todos \n2 - Gerente \n3 - Desenvolvedor \n4 - Estagiário");
                    int op2 = scanner.nextInt();
                    if(op2 == 1){
                        System.out.println("Desenvolvedores: \n");
                        for(int i = 0; i < devs.size(); i++){
                            devs.get(i).mostrarDados();
                            System.out.println("\n");
                        }
                    
                        System.out.println("Gerentes: \n");
                        for(int i = 0; i < gerentes.size(); i++){
                            gerentes.get(i).mostrarDados();
                            System.out.println("\n");
                        }

                        System.out.println("Estagiários: \n");
                        for(int i = 0; i < estagiarios.size(); i++){
                            estagiarios.get(i).mostrarDados();
                            System.out.println("\n");
                        }
                    } else if( op2 == 2){
                        System.out.println("Gerentes: \n");
                        for(int i = 0; i < gerentes.size(); i++){
                            gerentes.get(i).mostrarDados();
                            System.out.println("\n");
                        }
                    } else if (op2 == 3){
                        System.out.println("Desenvolvedores: \n");
                        for(int i = 0; i < devs.size(); i++){
                            devs.get(i).mostrarDados();
                            System.out.println("\n");
                        }
                    } else if (op2 == 4) {
                        System.out.println("Estagiários: \n");
                        for(int i = 0; i < estagiarios.size(); i++){
                            estagiarios.get(i).mostrarDados();
                            System.out.println("\n");
                        }
                    }
                break;

                case 3:
                    System.out.println("Saindo...");
                break;

                default:
                    System.out.println("Por favor, insira um número apenas das opções acima.");
                break;
            }

        }while(op != 3);

        scanner.close();
    }

}