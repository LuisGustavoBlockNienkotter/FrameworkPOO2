
package Classes.BO;

import Classes.DTO.Produto;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import java.util.function.Function;


public class ListaProduto {
     private List<Produto> lista = new ArrayList<Produto>();

    public List<Produto> getLista() {
        return lista;
    }

    public void setLista(List<Produto> lista) {
        this.lista = lista;
    }
    
    public void add(Produto p){
        lista.add(p);
    }
    
    public void remover(Produto p){
        lista.remove(p);
    }
    
    public List<String> selectAllTitles(){
        List<String> listaRetorno = new ArrayList<String>();
        for (Iterator<Produto> iterator = lista.iterator(); iterator.hasNext();) {
            Produto next = iterator.next();
            listaRetorno.add(next.getTitle());
        }
        return listaRetorno;
    }
     
}
