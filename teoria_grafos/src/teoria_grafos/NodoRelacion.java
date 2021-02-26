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
public class NodoRelacion {
    private NodoRelacion pnext;
    private int ID_actor;
    private int ID_pelicula;
    
    
    public NodoRelacion(int ID_actor, int ID_pelicula){
        this.pnext=null;
        this.ID_actor = ID_actor;
        this.ID_pelicula= ID_pelicula;
        
        
    }

    /**
     * @return the ID_actor
     */
    public int getID_actor() {
        return ID_actor;
    }

    /**
     * @param ID_actor the ID_actor to set
     */
    public void setID_actor(int ID_actor) {
        this.ID_actor = ID_actor;
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
     * @return the pnext
     */
    public NodoRelacion getPnext() {
        return pnext;
    }

    /**
     * @param pnext the pnext to set
     */
    public void setPnext(NodoRelacion pnext) {
        this.pnext = pnext;
    }
    
}
