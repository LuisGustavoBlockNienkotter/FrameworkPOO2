
package Facade;

import Classes.BO.ListaProduto;
import Classes.BO.ManipJSON;
import Classes.DTO.Produto;
import java.util.List;

/**
 *
 * @author Luis Gustavo Block Nienkotter
 */
public class Controlador {

    private ManipJSON manip;
    private ListaProduto lista = new ListaProduto();
    
    /**
     *
     * @param manip
     */
    public Controlador(ManipJSON manip) {
        this.manip = manip;
    }
    
    /**
     *
     * @param url
     * @return true se os dados foram salvos, e false se não
     */
    public boolean salvarDados(String url, int nmrPages){
        if(manip.gravar(url, 5)){
            return true;
        }
        return false;
    }
    
    /**
     *
     * @return uma lista de produtos
     */
    public ListaProduto ler(){
        this.lista.setLista(manip.ler());
        return lista;
    }
    
    /**
     *
     * @return os titulos da lista de produto
     */
    public List<String> pegarTodosOsTitulos(){
        return lista.selectAllTitles();
    }
    
    /**
     *
     * @param id
     * @return o produto com o id recebido
     */
    public Produto procurarPorId(String id){
        return lista.selectById(id);
    }
    
    /**
     *
     * @param title
     * @return o produto com o titulo recebido
     */
    public Produto procurarPorTitulo(String title){
        return lista.selectByTitle(title);
    }
    
}
