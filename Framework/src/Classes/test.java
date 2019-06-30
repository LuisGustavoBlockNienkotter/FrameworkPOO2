/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Classes;


import Classes.BO.ListaProduto;
import Classes.BO.ManipJSON;
import Conexão.Conexao;
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
        String url = "https://www.amazon.com.br/b/ref=s9_acss_bw_cg_Celular_3b1_w?ie=UTF8&"
                + "node=17716142011&pf_rd_m=A3RN7G7QC5MWSZ&pf_rd_s=merchandised-search-5&pf_rd_r="
                + "1HJXS0SG9GZ6HM5WM7CD&pf_rd_t=101&pf_rd_p=0838205f-62f8-4999-8714-b5d906838dae&pf_rd_i=16243890011";
        //ManipJSON.gravar(Conexao.getDados(url));
        //ListaProduto lista = ManipJSON.ler();
        Document doc = Jsoup.connect(url).get();
        
        System.out.println(doc);
    }
}
