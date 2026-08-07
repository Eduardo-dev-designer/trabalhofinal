package pdv;

public class Caixa extends Funcionario {


    private int numeroCaixa;
    private boolean status;



    public Caixa(int id, String nome, String CPF,
                 float salario, String cargo,
                 int numeroCaixa) {


        super(id, nome, CPF, salario, cargo);

        this.numeroCaixa = numeroCaixa;

        status = false;

    }



    public void abrirCaixa(){

        status = true;

    }



    public void fecharCaixa(){

        status = false;

    }



    @Override
    public void mostrarDados(){

        super.mostrarDados();

        System.out.println("Número do Caixa: " + numeroCaixa);


        if(status){

            System.out.println("Status do Caixa: Aberto");

        }else{

            System.out.println("Status do Caixa: Fechado");

        }

    }



    public int getNumeroCaixa(){

        return numeroCaixa;

    }



    public boolean getStatus(){

        return status;

    }



    public void setNumeroCaixa(int numeroCaixa){

        this.numeroCaixa = numeroCaixa;

    }

}