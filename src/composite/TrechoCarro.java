package composite;

public class TrechoCarro extends MeiodeTransporte{

    public TrechoCarro(String direcao, double distancia){
        this.distancia = distancia;
        this.direcao = direcao;
    }

    @Override
    public void imprimir() {
        System.out.println("Dirija o carro na direcao " + direcao + " por " + distancia + "metros");
    }
    
}
