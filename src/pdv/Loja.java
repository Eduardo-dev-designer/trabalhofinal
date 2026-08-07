package pdv;

import java.util.ArrayList;

public class Loja {


    ArrayList<Funcionario> funcionarios;
    ArrayList<Caixa> caixas;
    ArrayList<Pagamento> pagamentos;



    public Loja(){

        funcionarios = new ArrayList<>();
        caixas = new ArrayList<>();
        pagamentos = new ArrayList<>();

    }



    public void cadastrarFuncionario(Funcionario funcionario){

        funcionarios.add(funcionario);

        System.out.println("Funcionário cadastrado com sucesso!");

    }



    public void cadastrarCaixa(Caixa caixa){

        caixas.add(caixa);

        System.out.println("Caixa cadastrado com sucesso!");

    }



    public void cadastrarPagamento(Pagamento pagamento){

        pagamentos.add(pagamento);

        System.out.println("Pagamento cadastrado com sucesso!");

    }




    public void listarFuncionarios(){

        System.out.println("\n===== FUNCIONÁRIOS =====");


        for(Funcionario funcionario : funcionarios){

            funcionario.mostrarDados();

            System.out.println("-------------------");

        }

    }




    public void listarCaixas(){

        System.out.println("\n===== CAIXAS =====");


        for(Caixa caixa : caixas){

            caixa.mostrarDados();

            System.out.println("-------------------");

        }

    }




    public void listarPagamentos(){

        System.out.println("\n===== PAGAMENTOS =====");


        for(Pagamento pagamento : pagamentos){

            pagamento.mostrarPagamento();

            System.out.println("-------------------");

        }

    }

}