/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package vehiculo;

/**
 *
 * @author aruns
 */
public class Automovil extends Vehiculo_terrestre{
   private String claxon,retrovisor,direccional;    

    public Automovil(String claxon, String retrovisor, String direccional, String llantas, String timon, String marca, String diseño, String modelo, String material, String pasajeros) {
        super(llantas, timon, marca, diseño, modelo, material, pasajeros);
        this.claxon = claxon;
        this.retrovisor = retrovisor;
        this.direccional = direccional;
    }

    public String getClaxon() {
        return claxon;
    }

    public void setClaxon(String claxon) {
        this.claxon = claxon;
    }

    public String getRetrovisor() {
        return retrovisor;
    }

    public void setRetrovisor(String retrovisor) {
        this.retrovisor = retrovisor;
    }

    public String getDireccional() {
        return direccional;
    }

    public void setDireccional(String direccional) {
        this.direccional = direccional;
    }
    
    
}
