package pdv;

public class Caixa extends Funcionario {


    private boolean status;


    public Caixa(int id, String nome, String CPF, float salario, String cargo){

        super(id, nome, CPF, salario, cargo);

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


        if(status){

            System.out.println("Caixa aberto");

        }else{

            System.out.println("Caixa fechado");

        }

    }


    public boolean getStatus(){

        return status;

    }

}