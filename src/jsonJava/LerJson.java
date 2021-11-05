/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package jsonJava;

import java.io.FileReader;
import java.io.FileNotFoundException;
import java.io.IOException;
import org.json.simple.parser.ParseException;
import org.json.simple.JSONObject;
import org.json.simple.parser.JSONParser;


/**
 *
 * @author joao.costa3
 */
public class LerJson {
    
    public static void main(String[] args) throws org.json.simple.parser.ParseException {
        String nomeAluno;
        Long numMatricula;
        Double mediaAluno;
        
        try {
            //cria variavel do tipo JSONObject
            JSONObject jsonObject;
            // cria o parse de tratamento
            JSONParser parser = new JSONParser();
            //converte o json lido para um objeto java
            jsonObject = (JSONObject) parser.parse(new FileReader("aluno.json"));
            //armazena os dados da leitura
            nomeAluno = (String) jsonObject.get("nomeAluno");
            numMatricula = (Long) jsonObject.get("numMatricula");
            mediaAluno = (Double) jsonObject.get("mediaAluno");
            String status;
            
            if (mediaAluno >= 7){
                status = "APROVADO!!!";
            } else{
                status = "REPROVADO!!!";
            }
            
            System.out.println("\nNome Aluno: " + nomeAluno + "\nNumero Matricula: " +
                    numMatricula + "\nMedia Aluno: " + mediaAluno + "\nStatus: " + 
                    status);
        } catch (FileNotFoundException e) {
            e.printStackTrace();
        } catch (IOException e) {
            e.printStackTrace();
        } catch (ParseException e){
            e.printStackTrace();
        }
    }
    
}
