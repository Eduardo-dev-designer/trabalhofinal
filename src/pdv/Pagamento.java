package pdv;

import java.util.Scanner;

public class Pagamento {

    Scanner teclado = new Scanner(System.in);

    private boolean status;
    private float numeroPagamento;
    private float valordaVenda;
    private String modalidadePagamento;


    public Pagamento(float numeroPagamento, float valordaVenda, String modalidadePagamento) {

        this.numeroPagamento = numeroPagamento;
        this.valordaVenda = valordaVenda;
        this.modalidadePagamento = modalidadePagamento;

    }


    public void realizarPagamento() {

        if (valordaVenda > 0 && modalidadePagamento != null && !modalidadePagamento.equals("")) {

            status = true;
            System.out.println("Pagamento realizado com sucesso!");

        } else {

            status = false;
            System.out.println("Pagamento inválido!");

        }

    }


    public void mostrarPagamento() {

        System.out.println("Número pagamento: " + numeroPagamento);
        System.out.println("Valor da venda: " + valordaVenda);
        System.out.println("Modalidade: " + modalidadePagamento);

        if (status) {

            System.out.println("Pagamento Aprovado");

        } else {

            System.out.println("Pagamento Reprovado");

        }

    }


    public void escolherPagamento() {

        System.out.println("\n====== FORMA DE PAGAMENTO ======");
        System.out.println("1 - Cartão de crédito");
        System.out.println("2 - Cartão de débito");
        System.out.println("3 - Pix");
        System.out.println("4 - Dinheiro");

        System.out.println("Escolha uma opção:");

        int opcao = teclado.nextInt();

        switch(opcao) {

            case 1:
                modalidadePagamento = "Cartão de crédito";
                break;

            case 2:
                modalidadePagamento = "Cartão de débito";
                break;

            case 3:
                modalidadePagamento = "Pix";
                break;

            case 4:
                modalidadePagamento = "Dinheiro";
                break;

            default:
                modalidadePagamento = "";
                System.out.println("Opção inválida");

        }

    }


    public boolean getStatus() {
        return status;
    }


    public float getNumeroPagamento() {
        return numeroPagamento;
    }


    public float getValordaVenda() {
        return valordaVenda;
    }


    public String getModalidadePagamento() {
        return modalidadePagamento;
    }

}