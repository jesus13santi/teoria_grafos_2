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
public class Lista {

    private Nodo first;
    private String nombre;
    private int tamano;
    private Nodo last;

    public Lista() {
        this.first = null;
        //this.nombre = nombre_lista;
        this.tamano = 0;
        this.last = null;
    }

    public void setPrimero(Nodo Point) {
        this.first = Point;
    }

    public int length() {
        return tamano;
    }

    public boolean esVacio() {
        return first == null;
    }

    public Nodo primero() {
        return first;
    }

    public Nodo proximo(Nodo valor) {
        if (valor != null) {
            valor = valor.getPnext();
            return valor;
        } else {
            return null;
        }
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

    public void recorrer() {
        Nodo aux;
        if (esVacio()) {
            System.out.println(nombre + " está vacía");
        } else {
            aux = first;
            while (aux != null) {
                aux = proximo(aux);
            }
        }
    }

    public Nodo ultimo() {
        Nodo aux;
        if (esVacio()) {
            return null;
        } else {
            aux = first;
            while (aux.getPnext() != null) {
                aux = proximo(aux);
            }
            return aux;
        }
    }

    public void Insertar_final(int ID, String Nombre, int anio) {
        Nodo nuevo = new Nodo(Nombre, ID, anio);
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
        Nodo actual = first;
        if (actual == null) {
            lista_completa = "Esta vacia";
        }
        while (actual != null) {
            lista_completa += actual.getID() + "," + actual.getNombre() + "," + actual.getAnio() + "\n";
            actual = actual.getPnext();

        }
        //System.out.println(lista_completa);
        return lista_completa;

    }

    public boolean existe(String ID) {
        Nodo aux = this.first;
        while (aux != null) {
            if (aux.getNombre() == ID) {
                return true;
            }
            aux = aux.getPnext();
        }
        return false;
    }

    public void buscar_elemento(int ID, ListaRelacion lista) {
        NodoRelacion aux = lista.getFirst();
        //Nodo ant=first;
        //Nodo aux2= lista_pelicula.primero();
        int listaPeli[];

        for (int i = 0; aux != null; i++) {
            if (aux.getID_actor() == ID) {

            }

        }
        

   

}
public ListaAuxiliar Peliculas_listas(int ID,ListaRelacion ele,Lista pelicula) {
        ListaAuxiliar a = new ListaAuxiliar();
        Nodo peli_aux=pelicula.primero();
        NodoRelacion aux = ele.getFirst();
        //NodoRelacion ant = ele.getFirst();
        int id=0;
        while (aux != null) {
            String peli="";
            if(aux.getID_actor()==ID){
                id=aux.getID_pelicula();
                
                while(peli_aux!=null){
                    if(peli_aux.getID()==id){
                        peli=peli_aux.getNombre();
                        a.Insertar_final_2(peli);
                    }
                    peli_aux=peli_aux.getPnext();
                }
                
            }
            
           
            
           
            //System.out.println(auxi.Imprimir_lista());

            aux = aux.getPnext();

        }
        
        
        return a;
    }    
}
  
      
        
    

