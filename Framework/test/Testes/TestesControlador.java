package Testes;

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

import Classes.BO.ListaProduto;
import Classes.BO.ManipJSON;
import Classes.BO.ManipJSONMagazineLuiza;
import Classes.DTO.Produto;
import Facade.Controlador;
import java.util.List;
import org.junit.Test;
import static org.junit.Assert.*;
import junit.framework.TestCase;

/**
 *
 * @author user
 */
public class TestesControlador extends TestCase{
   
   ManipJSON manip = new ManipJSONMagazineLuiza();
   private Controlador c = new Controlador(manip);
   private String URL = "https://www.magazineluiza.com.br/celulares-e-smartphones/l/te/brand---samsung/";
   
   public void testeGravar(){
       assertEquals(true, c.salvarDados(URL, 5));
   }
   
   public void testeLer(){
       ListaProduto lista = c.ler();
       assertEquals(true, lista.getLista().size() > 0);
   }
   
   public void testePegarTodosOsTitulos(){
       c.ler();
       assertEquals(true, c.pegarTodosOsTitulos().size() > 0);
   }
   
   public void testeProcurarPorId(){
       c.ler();
       List<String> lista = c.pegarTodosOsTitulos();
       Produto p = c.procurarPorTitulo(lista.get(1));
       Produto p2 = c.procurarPorId(p.getId());
       assertEquals(p, p2);
   }
   
   public void testeProcurarPorTitulo(){
       c.ler();
       List<String> lista = c.pegarTodosOsTitulos();
       Produto p = c.procurarPorTitulo(lista.get(1));
       assertEquals(p.getTitle(), lista.get(1));
   }
    
}
