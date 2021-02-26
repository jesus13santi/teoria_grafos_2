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
public class ListaRelacion {

    private NodoRelacion first;
    private NodoRelacion last;
    private int tamano;

    public ListaRelacion() {
        this.first = null;
        //this.nombre = nombre_lista;
        this.tamano = 0;
        this.last = null;
    }

    /**
     * @return the first
     */
    public NodoRelacion getFirst() {
        return first;
    }

    /**
     * @param first the first to set
     */
    public void setFirst(NodoRelacion first) {
        this.first = first;
    }

    /**
     * @return the last
     */
    public NodoRelacion getLast() {
        return last;
    }

    /**
     * @param last the last to set
     */
    public void setLast(NodoRelacion last) {
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

    public Nodo proximo(Nodo valor) {
        if (valor != null) {
            valor = valor.getPnext();
            return valor;
        } else {
            return null;
        }
    }

    public boolean esVacio() {
        return first == null;
    }

    public int leer_id(Nodo valor) {
        return valor.getID();
    }

    public int leer_anio(Nodo valor) {
        return valor.getAnio();
    }

    public String leer_nombre(Nodo valor) {
        return valor.getNombre();
    }

    public void Insertar_final(int ID_actor, int ID_pelicula) {
        NodoRelacion nuevo = new NodoRelacion(ID_actor, ID_pelicula);
        if (esVacio()) {
            first = last = nuevo;
        } else {
            //nuevo.setSiguiente(last.getSiguiente());
            last.setPnext(nuevo);
            last = nuevo;
        }
        tamano++;
    }

    public String Imprimir_lista() {
        String lista_completa = "";
        NodoRelacion actual = first;
        if (actual == null) {
            lista_completa = "Esta vacia";
        }
        while (actual != null) {
            lista_completa += actual.getID_actor() + "," + actual.getID_pelicula() + "\n";
            actual = actual.getPnext();

        }
        //System.out.println(lista_completa);
        return lista_completa;

    }
    

    public void matriz_prueba() {
        int[][] matriz = new int[5][5];
        NodoRelacion aux;
        aux = first;
        int ele = 0;

        if (!esVacio()) {
            for (int i = 0; i < matriz.length - 1; i++) {
                for (int j = 0; j < matriz.length - 1; j++) {
                    ele = aux.getID_actor();
                    matriz[i][j] = 0;
                    System.out.print(matriz[i][j]);
                    //System.out.println(ele+"ho);

                    aux.getPnext();

                }

                //System.out.println(matriz[i][j]);
            }

        }
    }

    public boolean existe(int data) {
        //boolean existe = false;
        NodoRelacion aux = this.first;
        while (aux != null) {
            if (aux.getID_actor() == data) {
                return true;
            }
            aux = aux.getPnext();

        }
        return false;
    }

    public void Insertar_principio(int actor, int pelicula) {
        NodoRelacion nuevo = new NodoRelacion(actor,pelicula);
        NodoRelacion aux = first;
        if (esVacio()) {
            first = last = nuevo;

        } else {
            nuevo.setPnext(first);
            first = nuevo;

        }
        tamano++;
    }
     public NodoRelacion Anterior(NodoRelacion posicion) {
        NodoRelacion aux = first;
        NodoRelacion ant = first;

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
    public void Eliminar(NodoRelacion nodo) {
        NodoRelacion n = first;
        if (!esVacio() && first != nodo) {
            while (n != nodo) {
                n = n.getPnext();

            }
            Anterior(nodo).setPnext(nodo.getPnext());
            nodo.setPnext(null);

        } else if (first == nodo && last == nodo) {
            first = last = null;

        } else if (first == nodo) {
            first = nodo.getPnext();
        }
        tamano--;

    }
    public void Vaciar() {
        first = last = null;
        tamano = 0;
    }
    

    
}
