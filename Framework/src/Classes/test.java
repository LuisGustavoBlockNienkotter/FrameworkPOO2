/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Classes;


import Classes.BO.ListaProduto;
import Classes.BO.ManipJSON;
import Classes.BO.ManipJSONMagazineLuiza;
import Conexão.ConexaoMagazineLuiza;
import Facade.Controlador;
import java.io.IOException;
import java.net.MalformedURLException;
import java.net.URL;
import java.util.Iterator;
import org.jsoup.nodes.Document;
import org.jsoup.Jsoup;
/**
 *
 * @author user
 */
public class test {
    public static void main(String[] args) throws IOException{
        String url = "https://www.magazineluiza.com.br/celulares-e-smartphones/l/te/brand---samsung/";
        ManipJSON manip = new ManipJSONMagazineLuiza();
        Controlador c = new Controlador(manip);
        
        c.salvarDados(url);
        c.ler();
        
        for (String titulo : c.pegarTodosOsTitulos()) {
            System.out.println(titulo);
        }
        
                
    }
}
