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
    
    public void agregar(int i, int j, int valor){
        matrizAdyacencia[i][j] = valor;
    }
    
    public void remover(int i, int j){
        if(matrizAdyacencia[i][j]>0)
            matrizAdyacencia[i][j] -= 1;
    }
    
    public void agregarAristas(ListaElenco le){
        NodoElenco naux1 = le.getFirst();
        while(naux1 != null){
            NodoElenco naux2 = le.getFirst();
            while(naux2 != null){
                if(naux1 != naux2){
                    if(naux1.elencosAdyacentes(naux2.getLista())){
                        agregar(naux2.getPos(), naux1.getPos(), naux1.getID_pelicula());
                    }
                }
                naux2 = naux2.getPnext();
            }
            naux1 = naux1.getPnext();
        }
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


