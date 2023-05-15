/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package src;

/**
 *
 * @author beelze
 */
public class Supervisor extends Empleado {
    private String area;
    private float bono;

    public Supervisor(String area, float bono, int clave, String nombre, float salario) {
        super(clave, nombre, salario);
        this.area = area;
        this.bono = bono;
    }

    public float getBono() {
        return bono;
    }

    public void setBono(float bono) {
        this.bono = bono;
    }

    public String getArea() {
        return area;
    }

    public void setArea(String area) {
        this.area = area;
    }

    @Override
    public float calcularPago() {
        return getSalario() + bono;
    }
    
}
