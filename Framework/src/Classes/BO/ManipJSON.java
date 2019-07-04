/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Classes.BO;

import Classes.DTO.Produto;
import java.util.List;

/**
 *
 * @author user
 */
public interface ManipJSON {
    public boolean gravar(String url, int nmrPages);
    public List<Produto> ler();
}
