
package Conexão;

import java.io.IOException;
import org.jsoup.Jsoup;
import org.jsoup.nodes.Document;

public class Conexao {
    
    public static String getDados(String url){
        try{
            String dados = "";
            int page = 1;
            String nextUrl = url;
            do{
                url = nextUrl;
                nextUrl = getNext(url);
                Document doc = Jsoup.connect(url).get();
                String pt1 = doc.data().split("\"navigationShowcase\":")[1];
                String pt2 = pt1.split("},\"cookies\"")[0];
                if(page ==1 && hasNext(url)){
                    pt2 = pt2.replace("]", "");
                }else{
                    if(!hasNext(url) || page ==4){
                        pt2 = pt2.replace("[", ",");
                    }else{
                        pt2 = pt2.replace("[", ",");
                        pt2 = pt2.replace("]", "");
                    }
                }
                dados += pt2;
                page++;
            }while(hasNext(url) && page != 5);
            return dados;
        }catch(IOException e){
            e.printStackTrace();
        }
        return "";
    }
    
    public static boolean hasNext(String url){
        try {
            Document doc = Jsoup.connect(url).get();
            if(doc.hasText()){
                return true;
            }
        } catch (Exception e) {
            e.printStackTrace();
        }
        return false;
    }
    
    public static String getNext(String urlAtual){
        String nextUrl = "";
        if (urlAtual.contains("?")) {
            String[] parse = urlAtual.split("=");
            int page = Integer.parseInt(parse[1]) + 1;
            nextUrl = parse[0] + "=" + String.valueOf(page);
        }else{
            nextUrl = urlAtual + "?page=2";
        }
        return nextUrl;
    }
}
