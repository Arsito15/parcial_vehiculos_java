/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package vehiculo;

/**
 *
 * @author aruns
 */
public class Avion extends Vehiculo_aereo{
    private String cola,ala,fuselaje; 

    public Avion(String cola, String ala, String fuselaje, String turbina, String aleron, String marca, String diseño, String modelo, String material, String pasajeros) {
        super(turbina, aleron, marca, diseño, modelo, material, pasajeros);
        this.cola = cola;
        this.ala = ala;
        this.fuselaje = fuselaje;
    }

    public String getCola() {
        return cola;
    }

    public void setCola(String cola) {
        this.cola = cola;
    }

    public String getAla() {
        return ala;
    }

    public void setAla(String ala) {
        this.ala = ala;
    }

    public String getFuselaje() {
        return fuselaje;
    }

    public void setFuselaje(String fuselaje) {
        this.fuselaje = fuselaje;
    }
    
    
}
