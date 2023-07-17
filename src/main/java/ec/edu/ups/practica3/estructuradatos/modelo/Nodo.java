/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package ec.edu.ups.practica3.estructuradatos.modelo;

/**
 *
 * @author Usuario
 */
public class Nodo {
    private Contacto contacto;
    private Nodo letf;
    private Nodo rigth;

    public Nodo(Contacto contacto) {
        this.contacto = contacto;
        this.letf = null;
        this.rigth = null;
    }

    public Contacto getContacto() {
        return contacto;
    }

    public void setContacto(Contacto contacto) {
        this.contacto = contacto;
    }

    public Nodo getLetf() {
        return letf;
    }

    public void setLetf(Nodo letf) {
        this.letf = letf;
    }

    public Nodo getRigth() {
        return rigth;
    }

    public void setRigth(Nodo rigth) {
        this.rigth = rigth;
    }
    
    
}
