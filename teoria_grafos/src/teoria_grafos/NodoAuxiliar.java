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
public class NodoAuxiliar {
    private NodoAuxiliar pnext;
    private int ID_actor;
    

    
    
    public NodoAuxiliar(int ID_actor){
        this.pnext=null;
        this.ID_actor = ID_actor;
       
        
        
    }

    /**
     * @return the pnext
     */
    public NodoAuxiliar getPnext() {
        return pnext;
    }

    /**
     * @param pnext the pnext to set
     */
    public void setPnext(NodoAuxiliar pnext) {
        this.pnext = pnext;
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
}
