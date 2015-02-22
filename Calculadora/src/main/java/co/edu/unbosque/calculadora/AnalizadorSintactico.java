/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package co.edu.unbosque.calculadora;

/**
 *
 * @author Administrador
 */
public class AnalizadorSintactico {

    static int[][] m = new int[7][7];// matriz de prioridades

    public AnalizadorSintactico() {
        iniciaMatriz();
    }

    public void inaPos() {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    public void iniciaMatriz() {
        int i, j = 0;
        for (i = 0; i < 5; i++) { // inicio primer for
            for (j = 0; j < 5; j++) {// inicio segundo for
                if (j <= i) {
                    m[i][j] = 1;
                } else {
                    m[i][j] = 0;
                }
            }// fin segundo for
        }
        m[0][1] = m[2][3] = 1;
        //manejo de ( )
        for (j = 0; j < 7; j++) {// terser for
            m[5][j] = 0;
            m[j][5] = 0;
            m[j][6] = 1;
        }// fin terser for
        m[5][6] = 0;
    }
}


