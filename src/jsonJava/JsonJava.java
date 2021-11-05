
package jsonjava;

import java.io.FileWriter;
import java.io.IOException;
import org.json.simple.JSONObject;

public class JsonJava {

    @SuppressWarnings("unchecked")
    public static void main(String[] args) {
        
        String nome = "Luciano";
        Double nota = 10.0;
        Integer matricula = 52545874;

        //Cria um Objeto JSON
        JSONObject objetoJson = new JSONObject();

        FileWriter writeFile = null;

        //Armazena dados em um Objeto JSON
        objetoJson.put("nomeAluno", nome);
        objetoJson.put("numMatricula", matricula);
        objetoJson.put("mediaAluno", nota);

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


