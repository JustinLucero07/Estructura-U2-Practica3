/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 */

package ec.edu.ups.practica3.estructuradatos;

import ec.edu.ups.practica3.estructuradatos.controlador.ArbolContactos;
import ec.edu.ups.practica3.estructuradatos.modelo.Contacto;

/**
 *
 * @author Usuario
 */
public class Practica3EstructuraDatos {

    public static void main(String[] args) {
        ArbolContactos arbol = new ArbolContactos();
        
        Contacto contacto1 = new Contacto("Juan", "12345");
        Contacto contacto2 = new Contacto("Maria", "12345");
        Contacto contacto3 = new Contacto("Pedro", "12345");
        Contacto contacto4 = new Contacto("Pablo", "12345");
        
        arbol.insert(contacto1);
        arbol.insert(contacto2);
        arbol.insert(contacto3);
        arbol.insert(contacto4);
        arbol.insert(new Contacto("Juliana", "12345"));
        arbol.insert(new Contacto("Jhon", "12345"));
    }
}
