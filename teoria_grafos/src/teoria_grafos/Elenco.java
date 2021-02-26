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
public class Elenco {
    
    int posicion;
    int[] actores;
    int id_pelicula;
    
    public Elenco(int pos, int[] args, int id){
        this.posicion = pos;
        this.actores = args;
        this.id_pelicula = id;
    }
    
    public int getPosicion(Elenco e){
        return e.posicion;
    }
    
    public int[] getActores(Elenco e){
        return e.actores;
    }
    
    public int getIdPelicula(Elenco e){
        return e.id_pelicula;
    }
    
}
