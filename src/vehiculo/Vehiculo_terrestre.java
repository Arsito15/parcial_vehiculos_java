/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package vehiculo;

/**
 *
 * @author aruns
 */
public class Vehiculo_terrestre extends Vehiculo{
 private String llantas,timon;
    public Vehiculo_terrestre  (){}
    public Vehiculo_terrestre (String llantas, String timon, String marca, String diseño, String modelo, String material, String pasajeros) {
        super(marca, diseño, modelo, material, pasajeros);
        this.llantas = llantas;
        this.timon = timon;
    }

    public String getLlantas() {
        return llantas;
    }

    public void setNit(String llantas) {
        this.llantas = llantas;
    }
    
    public String getTimon() {
        return timon;
    }

    public void setTimon(String timon) {
        this.timon = timon;
    }    
    
    @Override
    public void agregar(){
        System.out.println("Llantas: " + getLlantas());
        System.out.println("Timon: " + getTimon());        
        System.out.println("Marca: " + getMarca());
        System.out.println("Diseño: " + getDiseño());
        System.out.println("Modelo: " + getModelo());
        System.out.println("Material: " + getMaterial());
        System.out.println("Fecha Pasajeros: " + getPasajeros());
        System.out.println("________________________________" );
    }
    
}
