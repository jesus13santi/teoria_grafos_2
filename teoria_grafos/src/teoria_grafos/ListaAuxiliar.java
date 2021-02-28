/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package teoria_grafos;

/**
 *
 * @author Jrios
 */
public class ListaAuxiliar {
    private NodoAuxiliar first;
    private NodoAuxiliar last;
    private int tamano;

    public ListaAuxiliar() {
        this.first = null;
        //this.nombre = nombre_lista;
        this.tamano = 0;
        this.last = null;
    }

    /**
     * @return the first
     */
    public NodoAuxiliar getFirst() {
        return first;
    }

    /**
     * @param first the first to set
     */
    public void setFirst(NodoAuxiliar first) {
        this.first = first;
    }

    /**
     * @return the last
     */
    public NodoAuxiliar getLast() {
        return last;
    }

    /**
     * @param last the last to set
     */
    public void setLast(NodoAuxiliar last) {
        this.last = last;
    }

    /**
     * @return the tamano
     */
    public int getTamano() {
        return tamano;
    }

    /**
     * @param tamano the tamano to set
     */
    public void setTamano(int tamano) {
        this.tamano = tamano;
    }
    public boolean esVacio() {
        return first == null;
    }
    public void Insertar_final(int ID_actor) {
        NodoAuxiliar nuevo = new NodoAuxiliar(ID_actor);
        if (esVacio()) {
            first = last = nuevo;
        } else {
            
            last.setPnext(nuevo);
            last = nuevo;
        }
        tamano++;
    }

    public String Imprimir_lista() {
        String lista_completa = "";
        NodoAuxiliar actual = first;
        if (actual == null) {
            lista_completa = "Esta vacia";
        }
        while (actual != null) {
            lista_completa += actual.getID_actor() + "\n";
            actual = actual.getPnext();

        }
        //System.out.println(lista_completa);
        return lista_completa;
    }
    
    public String imprimir_lista_nombres(Lista actores){
        String lista_completa = "";
        NodoAuxiliar actual = first;
        if(actual == null){
            lista_completa = "Está vacía";
        }else{
            while(actual!=null){
                lista_completa += actores.buscar_nombre(actual.getID_actor())+"\n";
                actual = actual.getPnext();
            }
        }
        return lista_completa;
    }
    
    public void Vaciar() {
        first = last = null;
        tamano = 0;
    }
}
