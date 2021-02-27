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
    private int Pos;
    public NodoElenco(ListaAuxiliar Lista,int ID,int Pos){
        this.lista=Lista;
        this.ID_pelicula=ID;
        this.Pos=Pos;
        
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

    /**
     * @return the Pos
     */
    public int getPos() {
        return Pos;
    }

    /**
     * @param Pos the Pos to set
     */
    public void setPos(int Pos) {
        this.Pos = Pos;
    }
    
    public boolean elencosAdyacentes(ListaAuxiliar la){
        NodoAuxiliar aux = this.lista.getFirst();
        boolean esAdyacente = false;
        while(aux != null){
            NodoAuxiliar aux2 = la.getFirst();
            while(aux2 != null){
                if(aux.getID_actor() == aux2.getID_actor()){
                    esAdyacente = true;
                }
                aux2 = aux2.getPnext();
            }
            aux = aux.getPnext();
        }
        return esAdyacente;
    }
    
}
