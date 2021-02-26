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
public class NodoElenco {
    private NodoElenco pnext;
    private ListaAuxiliar lista;
    private int ID_pelicula;
    public NodoElenco(ListaAuxiliar Lista,int ID){
        this.lista=Lista;
        this.ID_pelicula=ID;
        
    }

    /**
     * @return the pnext
     */
    public NodoElenco getPnext() {
        return pnext;
    }

    /**
     * @param pnext the pnext to set
     */
    public void setPnext(NodoElenco pnext) {
        this.pnext = pnext;
    }

    /**
     * @return the lista
     */
    public ListaAuxiliar getLista() {
        return lista;
    }

    /**
     * @param lista the lista to set
     */
    public void setLista(ListaAuxiliar lista) {
        this.lista = lista;
    }

    /**
     * @return the ID_pelicula
     */
    public int getID_pelicula() {
        return ID_pelicula;
    }

    /**
     * @param ID_pelicula the ID_pelicula to set
     */
    public void setID_pelicula(int ID_pelicula) {
        this.ID_pelicula = ID_pelicula;
    }
    
}
