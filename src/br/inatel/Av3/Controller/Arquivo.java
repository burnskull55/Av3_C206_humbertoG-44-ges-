/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package br.inatel.Av3.Controller;

import br.inatel.Av3.model.Voto;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;
import java.io.OutputStream;
import java.util.ArrayList;
import java.util.logging.Level;
import java.util.logging.Logger;

/**
 *
 * @author burns
 */
public class Arquivo {
    //construtor que cria o arquivo pra ser escrito
    public Arquivo(String num) {
        try {
            OutputStream os = new FileOutputStream("candidato" +num+ ".txt", true);
        } catch (Exception e) {
        }
    }
    
    public void salvarArquivo(ArrayList<Voto> voto,String num){
        try {
            //salvando em um arquivo
            OutputStream os = new FileOutputStream("candidato" +num+ ".txt", false);
            ObjectOutputStream osw = new ObjectOutputStream(os);
            osw.writeObject(voto);

            //fechando o arquivo
            osw.close();
            os.close();

        } catch (FileNotFoundException ex) {
            Logger.getLogger(Arquivo.class.getName()).log(Level.SEVERE, null, ex);
        } catch (IOException ex) {
            Logger.getLogger(Arquivo.class.getName()).log(Level.SEVERE, null, ex);
        }

    }
    
    
    public ArrayList<Voto> ler(String num) {

        FileInputStream fin;
        ObjectInputStream in;
        ArrayList<Voto> votos = new ArrayList<>();

        try {
            fin = new FileInputStream("candidato" +num+ ".txt");
            in = new ObjectInputStream(fin);

            votos = (ArrayList<Voto>) in.readObject();

            in.close();
            fin.close();
        } catch (Exception ex) {
            System.out.println(ex);
        }
        
        return votos;
    }
           
}
    
