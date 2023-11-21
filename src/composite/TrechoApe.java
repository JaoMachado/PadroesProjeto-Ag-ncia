package composite;

public class TrechoApe extends MeiodeTransporte{

    // metodo padrao para receber as variaveis
    public TrechoApe(String direcao, double distancia){
        this.distancia = distancia;
        this.direcao = direcao;
    }

    @Override
    public void imprimir() {
        System.out.println("Ande na direcao " + direcao + " por " + distancia + " metros.");
    }
    
}
