/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.unab.login.ProyctoLogin;

import com.unab.dominio.login;

/**
 *
 * @author kevin
 */
public class clsLogin {

    /**
     *
     * @param log
     * @return
     */
    public boolean accesoSistema(login log){
        
        if (log.getUsuario().equals("KEVIN") && log.getPass().equals("12345678")){
        
           return true; 
            
        }else {
                
                
        return false;
        
    }
    
}


    }
