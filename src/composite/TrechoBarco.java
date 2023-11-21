package composite;

public class TrechoBarco extends MeiodeTransporte{

    public TrechoBarco(String direcao, double distancia){
        this.direcao = direcao;
        this.distancia = distancia;
    }

    @Override
    public void imprimir() {
        System.out.println("Navegue na direcao " + direcao + " por " + distancia + " metros.");
    }
}
