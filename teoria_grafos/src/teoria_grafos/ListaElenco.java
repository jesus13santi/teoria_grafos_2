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
public class ListaElenco {

    private NodoElenco first;
    private NodoElenco last;
    private int tamano;

    public ListaElenco() {
        this.first = null;
        this.last = null;
        this.tamano = 0;
    }

    /**
     * @return the first
     */
    public NodoElenco getFirst() {
        return first;
    }

    /**
     * @param first the first to set
     */
    public void setFirst(NodoElenco first) {
        this.first = first;
    }

    /**
     * @return the last
     */
    public NodoElenco getLast() {
        return last;
    }

    /**
     * @param last the last to set
     */
    public void setLast(NodoElenco last) {
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
    
    public void Insertar_principio(NodoElenco nuevo){
        if(esVacio()){
            first = last = nuevo;
        } else {
            nuevo.setPnext(first);
            first = nuevo;
        }
        tamano++;
    }

    public void Insertar_final(ListaAuxiliar lista, int ID_pelicula) {
        NodoElenco nuevo = new NodoElenco(lista, ID_pelicula);
        if (esVacio()) {
            first = last = nuevo;
        } else {
            //nuevo.setSiguiente(last.getSiguiente());
            last.setPnext(nuevo);
            last = nuevo;
        }
        tamano++;
    }

    public ListaElenco elenco(ListaRelacion ele) {
        ListaElenco elenco_2 = new ListaElenco();
        ListaAuxiliar auxi = new ListaAuxiliar();
        NodoRelacion aux = ele.getFirst();
        NodoRelacion ant = ele.getFirst();
        while (aux != null) {
            ant = ele.getFirst();
            auxi.Vaciar();
            while (ant != null) {

                if (aux.getID_pelicula() == ant.getID_pelicula()) {
                    auxi.Insertar_final(ant.getID_actor());

                }
                ant = ant.getPnext();

            }
            System.out.println(auxi.Imprimir_lista());
            elenco_2.Insertar_final(auxi, aux.getID_pelicula());
            aux = aux.getPnext();

        }

        //System.out.println(elenco_2.Imprimir_lista());
        return elenco_2;
    }
    
    public NodoElenco getAnterior(NodoElenco ne){
        NodoElenco aux = first;
        NodoElenco ant = first;
        
        if(aux == ne){
            return null;
        }else{
            while(aux != null){
                aux = aux.getPnext();
                if(aux==ne){
                    return ant;
                } else{
                    ant = ant.getPnext();
                }
            }
        }
        return null;
    }
    
    public void eliminarNodo(NodoElenco ne){
        NodoElenco n = first;
        if(!esVacio() && ne != null){
            if(first == ne && last == ne){
                first = last = null;
            } else if (first == ne){
                first = ne.getPnext();
                ne.setPnext(null);
            } else if (last == ne){
                getAnterior(ne).setPnext(null);
            } else {
                while(n != null){
                    if(ne == n){
                        NodoElenco aux = getAnterior(ne);
                        aux.setPnext(ne.getPnext());
                    }
                }
            }
            tamano--;
        }
    }

    public String Imprimir_lista() {
        String lista_completa = "";
        NodoElenco actual = first;
        if (actual == null) {
            lista_completa = "Esta vacia";
        }
        while (actual != null) {
            lista_completa += actual.getLista().Imprimir_lista() + "," + actual.getID_pelicula() + "\n";
            actual = actual.getPnext();

        }
        //System.out.println(lista_completa);
        return lista_completa;

    }
    
    public boolean existe(NodoElenco ne){
        NodoElenco aux = this.first;
        while(aux != null){
            if(aux.getID_pelicula() == ne.getID_pelicula()){
                return true;
            }
            aux = aux.getPnext();
        }
        return false;
    }
    
    public void eliminarRepetidos(){
        if(!this.esVacio()){
            NodoElenco ne = this.first;
            this.eliminarNodo(last);
            this.eliminarRepetidos();
            if(!existe(ne)){
                this.Insertar_principio(ne);
            }
        }
    }

}