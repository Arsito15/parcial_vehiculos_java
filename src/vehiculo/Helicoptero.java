/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package vehiculo;

/**
 *
 * @author aruns
 */
public class Helicoptero extends Vehiculo_aereo{
    private String helice,estabilizador,patin_aterrizaje;

    public Helicoptero(String helice, String estabilizador, String patin_aterrizaje, String turbina, String aleron, String marca, String diseño, String modelo, String material, String pasajeros) {
        super(turbina, aleron, marca, diseño, modelo, material, pasajeros);
        this.helice = helice;
        this.estabilizador = estabilizador;
        this.patin_aterrizaje = patin_aterrizaje;
    }

    public String getHelice() {
        return helice;
    }

    public void setHelice(String helice) {
        this.helice = helice;
    }

    public String getEstabilizador() {
        return estabilizador;
    }

    public void setEstabilizador(String estabilizador) {
        this.estabilizador = estabilizador;
    }

    public String getPatin_aterrizaje() {
        return patin_aterrizaje;
    }

    public void setPatin_aterrizaje(String patin_aterrizaje) {
        this.patin_aterrizaje = patin_aterrizaje;
    }
    
    
}
