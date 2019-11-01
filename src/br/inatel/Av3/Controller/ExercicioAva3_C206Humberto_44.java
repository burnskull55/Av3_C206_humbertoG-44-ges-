/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package br.inatel.Av3.Controller;

import br.inatel.Av3.model.Voto;
import br.inatel.Av3.model.Candidato;
import br.inatel.Av3.Exceptions.CpfInvalidoException;
import br.inatel.Av3.Exceptions.NumeroErradoException;
import br.inatel.Av3.view.Tela1;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.OutputStream;
import java.util.ArrayList;
import javax.swing.JOptionPane;

/**
 *
 * @author burns
 */
public class ExercicioAva3_C206Humberto_44 {

    /**
     * @param args the command line arguments
     * @throws br.inatel.Av3.Exceptions.CpfInvalidoException
     * @throws br.inatel.Av3.Exceptions.NumeroErradoException
     * @throws java.io.IOException
     */
    public static void main(String[] args){
        java.awt.EventQueue.invokeLater(() -> {
            new Tela1().setVisible(true);
        });
        
        
    }
    
}
