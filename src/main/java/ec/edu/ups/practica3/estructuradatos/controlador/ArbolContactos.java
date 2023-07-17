/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package ec.edu.ups.practica3.estructuradatos.controlador;

import ec.edu.ups.practica3.estructuradatos.modelo.Contacto;
import ec.edu.ups.practica3.estructuradatos.modelo.Nodo;

/**
 *
 * @author Usuario
 */
public class ArbolContactos {
    private Nodo raiz;

    public ArbolContactos() {
        this.raiz = null;
    }
    
    public void insert(Contacto contacto){
        if(raiz==null){
            raiz = new Nodo(contacto); 
        }else{
            insertRecursivo(raiz, contacto);
        }
    }
    
    public void insertRecursivo(Nodo nodo,Contacto contacto){
        if(contacto.getNombre().compareTo(nodo.getContacto().getNombre()) < 0 ){
            if(nodo.getLetf() == null){
                nodo.setLetf(new Nodo(contacto));
            }else{
                insertRecursivo(nodo.getLetf(), contacto);
            }    
        }else if(contacto.getNombre().compareTo(nodo.getContacto().getNombre()) > 0 ){
            if(nodo.getRigth() == null){
                nodo.setRigth(new Nodo(contacto));
            }else{ 
                insertRecursivo(nodo.getRigth(), contacto);
            }
        }else{
            //Si el nombre del contacto nuevo es igual a uno existente
            
        }
    }
    
    public boolean estaEquilibrado(){
        return verificarBalance(raiz);
    }
    
    private boolean verificarBalance(Nodo nodo){
        if(nodo == null){
            return true; //Arbol vacio, se considera equilibardo
        }
        
        int alturaIzquierda = obtenerAltura(nodo.getLetf());
        int alturaDerecha = obtenerAltura(nodo.getRigth());
                
        int diferencia = Math.abs(alturaIzquierda - alturaDerecha);
        //verificamos la diferencia de las alturas
                
        if (diferencia > 1) {
            return false;
        }
        
        return verificarBalance(nodo.getLetf()) && verificarBalance(nodo.getRigth()); 
    }
    
    private int obtenerAltura(Nodo nodo){
        if(nodo == null){
            return 0;
        }
        int alturaIzquierda = obtenerAltura(nodo.getLetf());
        int alturaDerecha = obtenerAltura(nodo.getRigth());
        
        return Math.max(alturaIzquierda, alturaDerecha)+1;
    }
}
