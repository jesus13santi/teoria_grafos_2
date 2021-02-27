/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package teoria_grafos;

/**
 *
 * @author Usuario
 */
public class Grafo {
    private int size;
    private int[][] matrizAdyacencia;
    
     // Constructor
    public Grafo(int size) {
        this.size = size;
        matrizAdyacencia = new int[this.size][this.size];
       
        for(int i=0; i< size; i++){
            for(int j=0; j< size; j++){
                matrizAdyacencia[i][j] = 0;
            }            
        }
    }
    
    public void agregar(int i, int j){
        matrizAdyacencia[i][j] += 1;
    }
    
    public void remover(int i, int j){
        if(matrizAdyacencia[i][j]>0)
            matrizAdyacencia[i][j] -= 1;
    }
    
    public void imprimir(){
        for(int i=0; i< size; i++){
            for(int j=0; j< size; j++){
                System.out.print( matrizAdyacencia[i][j] + "  " );        
            }
            System.out.println();
        }  
    }
}


