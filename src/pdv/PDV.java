package pdv;

public class PDV {

    public static void main(String[] args) {


        Loja loja = new Loja();



       

        Funcionario f1 = new Funcionario(1, "Joao", "11111111111", 2500f, "Gerente");
        Funcionario f2 = new Funcionario(2, "Maria", "22222222222", 1800f, "Vendedora");
        Funcionario f3 = new Funcionario(3, "Pedro", "33333333333", 2000f, "Estoquista");
        Funcionario f4 = new Funcionario(4, "Ana", "44444444444", 2200f, "Supervisora");
        Funcionario f5 = new Funcionario(5, "Carlos", "55555555555", 1700f, "Atendente");


        loja.cadastrarFuncionario(f1);
        loja.cadastrarFuncionario(f2);
        loja.cadastrarFuncionario(f3);
        loja.cadastrarFuncionario(f4);
        loja.cadastrarFuncionario(f5);




      

        Caixa c1 = new Caixa(1, "Lucas", "66666666666", 1900f, "Caixa");
        Caixa c2 = new Caixa(2, "Julia", "77777777777", 1950f, "Caixa");
        Caixa c3 = new Caixa(3, "Marcos", "88888888888", 2000f, "Caixa");
        Caixa c4 = new Caixa(4, "Beatriz", "99999999999", 2100f, "Caixa");
        Caixa c5 = new Caixa(5, "Rafael", "10101010101", 1850f, "Caixa");


        c1.abrirCaixa();
        c2.abrirCaixa();
        c3.abrirCaixa();
        c4.abrirCaixa();
        c5.abrirCaixa();


        loja.cadastrarCaixa(c1);
        loja.cadastrarCaixa(c2);
        loja.cadastrarCaixa(c3);
        loja.cadastrarCaixa(c4);
        loja.cadastrarCaixa(c5);


        Menu menu = new Menu(loja);

        menu.iniciar();


    }

}