public class construtor {
    String nome;
    static  String nome2;

    public static void main(String[] args) {


        System.out.println(nome2);

    }

    public void nomes(String nome){
        this.nome = nome;

    }


}


class  Pessoa{
    void criaPessoa(){
        nomes meuMain = new nomes("gabriel");
    }
}