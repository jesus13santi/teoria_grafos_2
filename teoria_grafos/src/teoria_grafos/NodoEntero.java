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
public class NodoEntero {
    
    NodoEntero pnext;
    int id;
    
    public NodoEntero(int valor){
        this.pnext = null;
        this.id = valor;
    }
    
    public NodoEntero getPnext(){
        return pnext;
    }
    
    public void setPnext(NodoEntero next){
        this.pnext = next;
    }
    
    public int getId(){
        return id;
    }
    
    public void setId(int valor){
        this.id = valor;
    }
    
}
