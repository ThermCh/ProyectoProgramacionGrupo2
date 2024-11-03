/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package proyectoprogramacion;

/**
 *
 * @author AMD
 */
public class Trabajador {
    //declaración de variables
    public int edad=0;
    public String nom="";
    public String puesto="";
    private String ID="";
    //partes del barista
    public static enum menu{
        NormalCoffe, Capuchino, CapuchinoV, Chocolate, Moka, Te_chai, iceCoffe
    }

    public Usuario(int edad, String nom, String puesto, String ID) {
        this.edad=edad;
        this.nom=nom;
        this.puesto=puesto;
        this.ID=ID;
          
    }

    public int getEdad() {
        return edad;
    }

    public void setEdad(int edad) {
        this.edad = edad;
    }

    public String getNom() {
        return nom;
    }

    public void setNom(String nom) {
        this.nom = nom;
    }

    public String getPuesto() {
        return puesto;
    }

    public void setPuesto(String puesto) {
        this.puesto = puesto;
    }

    public String getID() {
        return ID;
    }

    public void setID(String ID) {
        this.ID = ID;
    } 
}
