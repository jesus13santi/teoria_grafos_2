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
public class ListaEnteros {
    
    NodoEntero first;
    String nombre;
    int tamano;
    NodoEntero last;
    
    public ListaEnteros(String valor){
        this.first = null;
        this.last = null;
        this.nombre = valor;
        this.tamano = 0;
    }
    
    public void setPrimero(NodoEntero point){
        this.first = point;
    }
    
    public int length(){
        return tamano;
    }
    
    public boolean esVacio(){
        return first == null;
    }
    
    public NodoEntero primero(){
        return first;
    }
    
    public NodoEntero proximo(NodoEntero valor){
        if(valor != null){
            valor = valor.getPnext();
            return valor;
        }else{
            return null;
        }
    }
    
    public int leerId(NodoEntero valor){
        return valor.id;
    }
    
    public void recorrer(){
        NodoEntero aux;
        if(esVacio()){
            System.out.println(nombre +" está vacía");
        }else{
            aux=first;
            while(aux!=null){
                aux = proximo(aux);
            }
        }
    }
    
    public void insertarFinal(int id){
        NodoEntero pnew = new NodoEntero(id);
        if(esVacio()){
            first = last = pnew;
        } else {
            last.setPnext(pnew);
            last = pnew;
        }
        tamano++;
    }
    
}
