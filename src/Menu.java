package pdv;

import java.util.Scanner;

public class Menu {


    Scanner teclado = new Scanner(System.in);

    Loja loja;


    public Menu(Loja loja){

        this.loja = loja;

    }



    public void iniciar(){


        int opcao = 0;


        while(opcao != 7){


            System.out.println("\n========= MENU PDV =========");
            System.out.println("1 - Cadastrar Funcionário");
            System.out.println("2 - Cadastrar Caixa");
            System.out.println("3 - Realizar Pagamento");
            System.out.println("4 - Listar Funcionários");
            System.out.println("5 - Listar Caixas");
            System.out.println("6 - Listar Pagamentos");
            System.out.println("7 - Sair");


            System.out.println("Escolha uma opção:");

            opcao = teclado.nextInt();



            switch(opcao){


                case 1:


                    System.out.println("\n===== CADASTRO FUNCIONÁRIO =====");


                    System.out.println("Digite o id:");
                    int id = teclado.nextInt();


                    teclado.nextLine();


                    System.out.println("Digite o nome:");
                    String nome = teclado.nextLine();


                    System.out.println("Digite o CPF:");
                    String CPF = teclado.nextLine();


                    System.out.println("Digite o salário:");
                    float salario = teclado.nextFloat();


                    teclado.nextLine();


                    System.out.println("Digite o cargo:");
                    String cargo = teclado.nextLine();



                    Funcionario funcionario = new Funcionario(
                            id,
                            nome,
                            CPF,
                            salario,
                            cargo
                    );


                    loja.cadastrarFuncionario(funcionario);


                    break;




                case 2:


                    System.out.println("\n===== CADASTRO CAIXA =====");


                    System.out.println("Digite o id:");
                    int idCaixa = teclado.nextInt();


                    teclado.nextLine();


                    System.out.println("Digite o nome:");
                    String nomeCaixa = teclado.nextLine();


                    System.out.println("Digite o CPF:");
                    String cpfCaixa = teclado.nextLine();


                    System.out.println("Digite o salário:");
                    float salarioCaixa = teclado.nextFloat();


                    teclado.nextLine();


                    System.out.println("Digite o cargo:");
                    String cargoCaixa = teclado.nextLine();



                    Caixa caixa = new Caixa(
                            idCaixa,
                            nomeCaixa,
                            cpfCaixa,
                            salarioCaixa,
                            cargoCaixa
                    );


                    caixa.abrirCaixa();


                    loja.cadastrarCaixa(caixa);


                    break;




                case 3:


                    System.out.println("\n===== REALIZAR PAGAMENTO =====");


                    System.out.println("Número do pagamento:");
                    float numero = teclado.nextFloat();


                    System.out.println("Valor da venda:");
                    float valor = teclado.nextFloat();


                    teclado.nextLine();


                    System.out.println("Modalidade de pagamento:");
                    String modalidade = teclado.nextLine();



                    Pagamento pagamento = new Pagamento(
                            numero,
                            valor,
                            modalidade
                    );


                    pagamento.realizarPagamento();


                    loja.cadastrarPagamento(pagamento);


                    break;




                case 4:


                    loja.listarFuncionarios();


                    break;




                case 5:


                    loja.listarCaixas();


                    break;




                case 6:


                    loja.listarPagamentos();


                    break;




                case 7:


                    System.out.println("Sistema encerrado!");


                    break;




                default:


                    System.out.println("Opção inválida!");

            }


        }


    }


}