/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package teoria_grafos;

import javax.swing.JOptionPane;

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
        if(esVacio()){
            System.out.println(nombre +" está vacía");
        }else{
            aux=first;
            while(aux!=null){
                aux = aux.getPnext();
            }
        }
    }
    
    public String buscar_nombre(int id){
        Nodo aux = first;
        String nombre_actor = "";
        if(esVacio()){
            System.out.println(nombre+" está vacía");
        }else{
            while(aux!=null){
                if(id == aux.getID()){
                    nombre_actor = aux.getNombre();
                }
                aux = aux.getPnext();
            }
        }
        return nombre_actor;
    }
    
    public Nodo ultimo(){
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

    public boolean existe(String n) {
        Nodo aux = this.first;
        boolean a=false;
        while (aux != null) {
            if (aux.getNombre().equals('"'+n+'"') ) {
                a=true;
            }
            aux = aux.getPnext();
        }
        return a;
    }

    

    
    public int encontrarId(String n){
        Nodo aux;
        int id = 0;
        if(esVacio()){
            System.out.println(nombre +" está vacía");
        }else{
            aux=first;
            while(aux!=null){
                if(aux.getNombre().equals('"'+n+'"')){
                    id = aux.getID();
                }
                aux = aux.getPnext();
            }
        }
        //System.out.println(id);
        return id;
    }
    public ListaAuxiliar Encontrar_peliculas(int ID,ListaRelacion ele){
        ListaAuxiliar peliculas=new ListaAuxiliar();
        NodoRelacion aux = ele.getFirst();
        while(aux!=null){
            if (aux.getID_actor()==ID) {
                peliculas.Insertar_final(aux.getID_pelicula());
                              
            }
            aux=aux.getPnext();
        }
        //System.out.println(peliculas.Imprimir_lista());
        return peliculas;
    }
    public ListaAuxiliar Converit_int(ListaAuxiliar ele, Lista peliculas){
        ListaAuxiliar string_peliculas =new ListaAuxiliar();
        NodoAuxiliar aux=ele.getFirst();
        Nodo ant =peliculas.primero();
        while(aux!=null){
            ant=peliculas.primero();
            while(ant!=null){
                if(aux.getID_actor()==ant.getID()){
                    string_peliculas.Insertar_final_2(ant.getNombre());
                }
                ant=ant.getPnext();
                
            }
            aux=aux.getPnext();
        }
        System.out.println(string_peliculas.Imprimir_lista2());
        return string_peliculas;
        
    }
    


}
  
      
        
    

