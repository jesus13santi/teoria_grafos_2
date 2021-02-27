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

        NodoRelacion aux = ele.getFirst();
        NodoRelacion ant = ele.getFirst();
        while (aux != null) {
            ant = ele.getFirst();
            ListaAuxiliar auxi = new ListaAuxiliar();
            while (ant != null) {

                if (aux.getID_pelicula() == ant.getID_pelicula()) {
                    auxi.Insertar_final(ant.getID_actor());

                }
                ant = ant.getPnext();

            }
            elenco_2.Insertar_final(auxi, aux.getID_pelicula());
            //System.out.println(auxi.Imprimir_lista());

            aux = aux.getPnext();

        }
        elenco_2.EliminarRepetidos();
        System.out.println(elenco_2.Imprimir_lista());
        return elenco_2;
    }

    public void Eliminar_principio() {
        first = first.getPnext();
        tamano--;

    }

    public NodoElenco Anterior(NodoElenco posicion) {
        NodoElenco aux = first;
        NodoElenco ant = first;

        boolean encontrado = false;

        if (aux == posicion) {
            return null;
        } else {
            while (aux != null) {
                aux = aux.getPnext();
                if (aux == posicion) {
                    encontrado = true;
                    return ant;
                } else {
                    ant = ant.getPnext();
                }
            }
        }
        return null;
    }

    public void EliminarRepetidos() {
        ListaElenco elenco_2 = new ListaElenco();
        //ListaElenco auxi = new ListaElenco();
        NodoElenco aux = first;
        NodoElenco ant = aux.getPnext();
        while (aux != null) {
            ant = aux.getPnext();
            while (ant != null) {
                if (aux.getID_pelicula() == ant.getID_pelicula()) {
                    if (ant == last) {
                        Anterior(ant).setPnext(null);
                        setTamano(getTamano() - 1);
                    } else {
                        Anterior(ant).setPnext(ant.getPnext());
                        setTamano(getTamano() - 1);

                    }

                }
                ant = ant.getPnext();

            }
            aux=aux.getPnext();
            

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

}
