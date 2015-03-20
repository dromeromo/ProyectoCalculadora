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

    private String resultado = "";

    public MBDisplay() {
    }

    public String getResultado() {
        return resultado;
    }
    public void retroceso() {
        String aux = getResultado();
        char array[] = aux.toCharArray();
        aux = "";
        for (int x = 0; x < array.length - 1; x++) {
            aux = aux + array[x];
        }
        setResultado(aux);
    }

    public void capturar(String resultado) {
        this.resultado = getResultado().concat(resultado);
    }
        public void borrar(){
            setResultado("");
    }

    public void setResultado(String resultado) {
        this.resultado = resultado;
    }

}
