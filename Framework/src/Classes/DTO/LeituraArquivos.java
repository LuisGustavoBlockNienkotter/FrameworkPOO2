
package Classes.DTO;

import java.io.BufferedReader;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;

public class LeituraArquivos {
    public static String read (String caminho) {
		String txt = "";
		try {
			FileReader file = new FileReader(caminho);
                        BufferedReader br = new BufferedReader(file);
			String s;
			while ((s = br.readLine()) != null){
				if (txt.equals("")) {
					txt = s;
				}else {
					txt = txt + "\n" + s;
				}
			}
			file.close();
		}catch (IOException f){
			f.printStackTrace();
		}
		return txt;
	}
    public static void write (String txt, String caminho) {
		try {
			FileWriter file = new FileWriter(caminho);
			file.write(txt);
			file.flush();
			file.close();
		}catch (IOException f){
			f.printStackTrace();
		}
	}
}
