/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package vehiculo;

/**
 *
 * @author aruns
 */
public class Moto extends Vehiculo_terrestre{
   private String pedal,cadena,acelerador;    

    public Moto(String pedal, String cadena, String acelerador, String llantas, String timon, String marca, String diseño, String modelo, String material, String pasajeros) {
        super(llantas, timon, marca, diseño, modelo, material, pasajeros);
        this.pedal = pedal;
        this.cadena = cadena;
        this.acelerador = acelerador;
    }

    public String getPedal() {
        return pedal;
    }

    public void setPedal(String pedal) {
        this.pedal = pedal;
    }

    public String getCadena() {
        return cadena;
    }

    public void setCadena(String cadena) {
        this.cadena = cadena;
    }

    public String getAcelerador() {
        return acelerador;
    }

    public void setAcelerador(String acelerador) {
        this.acelerador = acelerador;
    }
    
   
}
