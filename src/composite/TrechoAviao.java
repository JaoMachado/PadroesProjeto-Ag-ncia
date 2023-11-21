package composite;

public class TrechoAviao extends MeiodeTransporte{
    public TrechoAviao(String direcao, double distancia){
        this.direcao = direcao;
        this.distancia = distancia;
    }

    @Override
    public void imprimir() {
        System.out.println("Voe na direcao " + direcao + " por " + distancia + " metros.");
    }
}
