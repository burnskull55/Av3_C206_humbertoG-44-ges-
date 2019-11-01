/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package br.inatel.Av3.model;

import br.inatel.Av3.Exceptions.CamposVaziosException;
import br.inatel.Av3.Exceptions.CpfInvalidoException;
import br.inatel.Av3.Exceptions.NumeroErradoException;
import java.io.Serializable;

/**
 *
 * @author burns
 */
public class Voto implements Serializable{
    private String cpf;
    private String num;

    public String getCpf() {
        return cpf;
    }

    public void setCpf(String cpf){
        if(cpf.equals("")){
            throw new CamposVaziosException();
        }
        else if(cpf.length() != 11){
            throw new CpfInvalidoException();
        }
        else 
            this.cpf = cpf;    
    }

    public String getNum() {
        return num;
    }

    public void setNum(String num) {
        if(num.equals("")){
            throw new CamposVaziosException();
        }
        else if(!num.equals("77") && !num.equals("51") && !num.equals("43")){
            throw new NumeroErradoException();
        }
        else 
            this.num = num;
        
    }
    
    
}
