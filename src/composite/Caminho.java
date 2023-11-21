package composite;

import java.util.ArrayList;
import java.util.List;


// gerencia os trechos
public class Caminho implements Trecho{
    private List<Trecho> trechos;

    public void add(Trecho trecho){
        trechos.add(trecho);
    }

    public void remover(Trecho trecho){
        trechos.remove(trecho);
    }

    public Caminho() {
        trechos = new ArrayList<>();
    }

    @Override
    public void imprimir() {
        for(Trecho trecho : trechos){
            trecho.imprimir();
        }
    }
    
}
