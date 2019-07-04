
package Classes.BO;

import Classes.DTO.LeituraArquivos;
import Classes.DTO.Produto;
import Conexão.Conexao;
import Conexão.ConexaoMagazineLuiza;
import com.google.gson.Gson;
import java.util.List;

/**
 *
 * @author user
 */
public class ManipJSONMagazineLuiza implements ManipJSON{
    final String LOCALHOST = "src/Dados/";
    private Conexao c = ConexaoMagazineLuiza.getInstance();
    
    /**
     *
     * @param url
     * @return Se gravou os dados ou não
     */
    public boolean gravar(String url, int nmrPages){
        String NOMEDOARQUIVO = "MagazineLuiza";
        String caminho = LOCALHOST + NOMEDOARQUIVO + ".json";
        //String jsonAtendimento = new Gson().toJson(marcas);
        LeituraArquivos.write("{\"lista\":" + c.getDados(url, nmrPages) + "}", caminho);
        if(LeituraArquivos.read(caminho).equals("")){
            return false;
        }
        return true;
    }
    
    /**
     *
     * @return A lista com todos os produtos
     */
    public List<Produto> ler(){
        ListaProduto lista = new ListaProduto();
        String NOMEDOARQUIVO = "MagazineLuiza";
        String caminho = LOCALHOST + NOMEDOARQUIVO + ".json";   
        if(!LeituraArquivos.read(caminho).equals("")) {           
            lista = new Gson().fromJson(LeituraArquivos.read(caminho), ListaProduto.class);
	}
        return lista.getLista();             
    }

}
