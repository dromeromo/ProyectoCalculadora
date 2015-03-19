/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package co.edu.uelbosque.mb;

import javax.faces.bean.ManagedBean;

/**
 *
 * @author Administrador
 */
@ManagedBean
public class MBDisplay {
    private String resultado="";
    private String aux="";

    public MBDisplay() {
    }

    public String getResultado() {
        return resultado;
    }

    public String getAux() {
        return aux;
    }

    public void setAux(String aux) {
        this.aux = aux;
    }
    

    public void setResultado(String resultado) {
        this.resultado =getResultado().concat(resultado);
        setAux(this.resultado);
    }
    
    
    
}
