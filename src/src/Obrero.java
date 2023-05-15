/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package src;

/**
 *
 * @author beelze
 */
public class Obrero extends Empleado {
    private String puesto;
    private float hrsExtras;

    public Obrero(String puesto, float hrsExtras, int clave, String nombre, float salario) {
        super(clave, nombre, salario);
        this.puesto = puesto;
        this.hrsExtras = hrsExtras;
    }

    public float getHrsExtras() {
        return hrsExtras;
    }

    public void setHrsExtras(float hrsExtras) {
        this.hrsExtras = hrsExtras;
    }

    public String getPuesto() {
        return puesto;
    }

    public void setPuesto(String puesto) {
        this.puesto = puesto;
    }

    @Override
    public float calcularPago() {
        return getSalario() + hrsExtras * 69.90f;
    }
    
    
}
