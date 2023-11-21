package composite;
public class Teste {
    public static void main(String[] args) throws Exception {

        // criando os diverssos trechos
        Trecho t1 = new TrechoApe("norte", 300);
        Trecho t2 = new TrechoCarro("leste", 50);
        Trecho t3 = new TrechoOnibus("oeste", 400);
        Trecho t4 = new TrechoBarco("norte", 320);
        Trecho t5 = new TrechoAviao("sul", 1240);
        Trecho t6 = new TrechoTrem("leste", 460);

        // criando o objeto caminho, que guarda e gerencia todos os trechos criados e faz o processamento polimorfico
        Caminho caminho = new Caminho();
        caminho.add(t1);
        caminho.add(t2);
        caminho.add(t3);
        caminho.add(t4);
        caminho.add(t5);
        caminho.add(t6);


        // mandando imprimir todos os trechos que estao no objeto caminho
        caminho.imprimir();
    }
}
