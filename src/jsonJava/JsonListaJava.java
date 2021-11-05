
package jsonjava;

import java.io.FileWriter;
import java.io.IOException;
import javax.swing.JOptionPane;
import org.json.simple.JSONArray;
import org.json.simple.JSONObject;

public class JsonListaJava {

    @SuppressWarnings("unchecked")
    public static void main(String[] args) {
        
        String nome;
        Double nota;
        Integer matricula;
        int QtdAluno = 2;
        JSONObject objetoJson = new JSONObject();
        JSONArray listaJson = new JSONArray();
        for (int i = 0; i < QtdAluno; i++) {
            objetoJson.put("nomeAluno", JOptionPane.showInputDialog("informe um nome"));
            objetoJson.put("numMatricula", Integer.parseInt(JOptionPane.showInputDialog("informe a matricula")));
            objetoJson.put("mediaAluno", Double.parseDouble(JOptionPane.showInputDialog("informe a nota")));
            listaJson.add(objetoJson);
        }

        FileWriter writeFile = null;
        
         

            try{
                writeFile = new FileWriter("aluno.json");
                //Escreve no arquivo conteudo do Objeto JSON
                writeFile.write(objetoJson.toJSONString());
                writeFile.close();
            }
            catch(IOException e){
            e.printStackTrace();
            }
                //Imprimne na Tela o Objeto JSON para vizualização
                System.out.println(objetoJson);

        }
    
}


