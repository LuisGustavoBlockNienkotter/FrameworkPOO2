
package Conexão;

/**
 *
 * @author Luis Gustavo Block Nienkotter
 */
public interface Conexao {
    public String getDados(String url, int nmrPages);
    
    public boolean hasNext(String url);
    
    public String getNext(String urlAtual);
}
