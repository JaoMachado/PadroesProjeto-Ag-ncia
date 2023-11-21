package composite;

public class TrechoOnibus extends MeiodeTransporte{

    public TrechoOnibus(String direcao, double distancia){
        this.direcao = direcao;
        this.distancia = distancia;
    }

    @Override
    public void imprimir() {
        System.out.println("Continue na direcao " + direcao + " por " + distancia + " metros.");
    }

}
