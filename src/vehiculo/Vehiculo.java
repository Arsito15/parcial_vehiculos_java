/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package vehiculo;

/**
 *
 * @author aruns
 */
abstract class Vehiculo {
   private String marca,diseño,modelo,material,pasajeros;

    public Vehiculo(){}
    public Vehiculo(String marca, String diseño, String modelo, String material, String pasajeros) {
        this.marca = marca;
        this.diseño = diseño;
        this.modelo = modelo;
        this.material = material;
        this.pasajeros = pasajeros;
    }

    public String getMarca() {
        return marca;
    }

    public void setMarca(String marca) {
        this.marca = marca;
    }

    public String getDiseño() {
        return diseño;
    }

    public void setDiseño(String diseño) {
        this.diseño = diseño;
    }

        public String getModelo() {
        return modelo;
    }

    public void setModelo(String modelo) {
        this.modelo = modelo;
    }

    public String getMaterial() {
        return material;
    }

    public void setMaterial(String material) {
        this.material = material;
    }

    public String getPasajeros() {
        return pasajeros;
    }

    public void setPasajeros(String pasajeros) {
        this.pasajeros = pasajeros;
    }
    
    
    protected void agregar(){}
    
    
}
