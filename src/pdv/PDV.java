package pdv;

public class PDV {

    public static void main(String[] args) {


        Loja loja = new Loja();



        Gerente g1 = new Gerente(
                1,
                "Joao",
                "9863542187",
                7200f,
                "Gerente",
                "Administrativo",
                1500f
        );


        loja.cadastrarFuncionario(g1);



        Caixa c1 = new Caixa(
                2,
                "Lucas",
                "548632019",
                2250f,
                "Caixa",
                1
        );


        Caixa c2 = new Caixa(
                3,
                "Julia",
                "65874321589",
                2250f,
                "Caixa",
                2
        );


        Caixa c3 = new Caixa(
                4,
                "Marcos",
                "25634856479",
                2250f,
                "Caixa",
                3
        );


        Caixa c4 = new Caixa(
                5,
                "Beatriz",
                "2314587695",
                2250f,
                "Caixa",
                4
        );


        Caixa c5 = new Caixa(
                6,
                "Rafael",
                "658432103658",
                2250f,
                "Caixa",
                5
        );



        c1.abrirCaixa();
        c2.abrirCaixa();
        c3.abrirCaixa();
        c4.abrirCaixa();
        c5.abrirCaixa();



        loja.cadastrarFuncionario(c1);
        loja.cadastrarFuncionario(c2);
        loja.cadastrarFuncionario(c3);
        loja.cadastrarFuncionario(c4);
        loja.cadastrarFuncionario(c5);



        Menu menu = new Menu(loja);

        menu.iniciar();


    }

}