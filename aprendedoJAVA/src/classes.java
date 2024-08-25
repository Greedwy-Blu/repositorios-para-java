public class classes
{
    String nome;
    static  String nome2;
    public static void main(String[] args) {

       System.out.println(nome2);

    }
    void declareNome(){
        nome = "gabriel";

        classes meuMain = new classes();
        meuMain.declareNome();
    }
    String getNome(){
        return nome;
    }

}
