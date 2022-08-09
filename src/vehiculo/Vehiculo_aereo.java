/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package vehiculo;

/**
 *
 * @author aruns
 */
public class Vehiculo_aereo  extends Vehiculo{
 private String turbina,aleron;
    public Vehiculo_aereo  (){}
    public Vehiculo_aereo (String turbina, String aleron, String marca, String diseño, String modelo, String material, String pasajeros) {
        super(marca, diseño, modelo, material, pasajeros);
        this.turbina = turbina;
        this.aleron = aleron;
    }

    public String getTurbina() {
        return turbina;
    }

    public void setTurbina(String turbina) {
        this.turbina = turbina;
    }
    
    public String getAleron() {
        return aleron;
    }

    public void setAleron(String aleron) {
        this.aleron = aleron;
    }    
    
    @Override
    public void agregar(){
        System.out.println("Llantas: " + getTurbina());
        System.out.println("Timon: " + getAleron());        
        System.out.println("Marca: " + getMarca());
        System.out.println("Diseño: " + getDiseño());
        System.out.println("Modelo: " + getModelo());
        System.out.println("Material: " + getMaterial());
        System.out.println("Fecha Pasajeros: " + getPasajeros());
        System.out.println("________________________________" );
    }
    
}
