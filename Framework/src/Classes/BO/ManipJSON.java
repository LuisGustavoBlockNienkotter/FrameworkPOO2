
package Classes.BO;

import Classes.DTO.LeituraArquivos;
import com.google.gson.Gson;

public class ManipJSON {
    final static String LOCALHOST = "src/Dados/";
    public static boolean gravar(String dados){
        String NOMEDOARQUIVO = "CelularesMagazineLuiza";
        String caminho = LOCALHOST + NOMEDOARQUIVO + ".json";
        //String jsonAtendimento = new Gson().toJson(marcas);
        LeituraArquivos.write("{\"lista\":" + dados + "}", caminho);
        if(LeituraArquivos.read(caminho).equals("")){
            return false;
        }
        return true;
    }
    
    public static ListaProduto ler(){
        ListaProduto lista = new ListaProduto();
        String NOMEDOARQUIVO = "CelularesMagazineLuiza";
        String caminho = LOCALHOST + NOMEDOARQUIVO + ".json";   
        if(!LeituraArquivos.read(caminho).equals("")) {           
            lista = new Gson().fromJson(LeituraArquivos.read(caminho), ListaProduto.class);
	}
        return lista;             
    }
}
